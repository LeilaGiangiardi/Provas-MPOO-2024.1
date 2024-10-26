package View;

import java.awt.*;
import javax.swing.*;
import Model.BaseDados;
import Model.CPFException;
import Model.Cliente;

public class TelaCadastro extends JFrame {

    private JTextField nomeField;
    private JTextField emailField;
    private JTextField cpfField;

    public TelaCadastro(String email) {
        setTitle("Cadastro de Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nomeField = new JTextField(20);
        emailField = new JTextField(email, 20); // Preenche com o e-mail que o cliente informou
        cpfField = new JTextField(20);

        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnSaibaMais = new JButton("Saiba Mais");

        btnCadastrar.addActionListener(e -> cadastrarCliente());
        btnSaibaMais.addActionListener(e -> JOptionPane.showMessageDialog(null, "Insira seu nome, e-mail e CPF para se cadastrar e receber seu cupom!"));

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Nome: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("E-mail: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("CPF: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(cpfField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnCadastrar, gbc);

        gbc.gridy = 4;
        add(btnSaibaMais, gbc);
    }

    private void cadastrarCliente() {
        String nome = nomeField.getText();
        String email = emailField.getText();
        String cpf = cpfField.getText();

        try {
            if (BaseDados.existeClientePorEmail(email)) {
                exibirMensagemErroCadastroCliente("E-mail já cadastrado.");
                return;
            }

            Cliente novoCliente = new Cliente(nome, cpf, email);
            BaseDados.adicionarCliente(novoCliente);
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            dispose(); // Fecha a tela de cadastro
            new TelaCupom().setVisible(true); // Volta para a tela de cupom
        } catch (CPFException ex) {
            exibirMensagemErroCadastroCliente("Erro ao cadastrar: CPF inválido.");
        } catch (Exception ex) {
            exibirMensagemErroCadastroCliente("Erro ao cadastrar: " + ex.getMessage());
        }
    }

    private void exibirMensagemErroCadastroCliente(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro ao Cadastrar Cliente", JOptionPane.ERROR_MESSAGE);
    }
}

package View;

import java.awt.*;
import javax.swing.*;
import Model.BaseDados;
import Model.Cliente;

public class TelaCupom extends JFrame {

    public TelaCupom() {
        setTitle("Tela do Cupom");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnPegarCupom = new JButton("Pegar Cupom");
        btnPegarCupom.addActionListener(e -> pegarCupom());

        setLayout(new FlowLayout());
        add(btnPegarCupom);
    }

    private void pegarCupom() {
        String email = JOptionPane.showInputDialog("Digite seu e-mail para pegar o cupom:");

        if (email == null || email.isEmpty()) {
            return;
        }

        Cliente cliente = BaseDados.buscarEmail(email);
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cliente.jaPossuiCupom()) { 
            exibirMensagemErroClienteJaPossuiCupom();
            return;
        }

       
        JOptionPane.showMessageDialog(this, "Cupom concedido com sucesso!");
    }

    private void exibirMensagemErroClienteJaPossuiCupom() {
        JOptionPane.showMessageDialog(this, "Erro: Cliente já possui um cupom.", "Erro ao Pegar Cupom", JOptionPane.ERROR_MESSAGE);
    }
}

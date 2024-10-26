package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAbertura extends JFrame {

    public TelaAbertura() {
        setTitle("Bem-vindo");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        ImageIcon imagemIcon = new ImageIcon(getClass().getResource("/img/logo.png"));
        JLabel labelImagem = new JLabel(imagemIcon);

        
        JLabel labelTexto = new JLabel("Participe você também e ganhe um cupom do MPOO Shop!", SwingConstants.CENTER);
        labelTexto.setFont(new Font("Arial", Font.PLAIN, 12)); 

        JButton btnParticipar = new JButton("Participe");
        btnParticipar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaCupom().setVisible(true);
                dispose();
            }
        });

        setLayout(new BorderLayout());
        add(labelImagem, BorderLayout.NORTH); 
        add(labelTexto, BorderLayout.CENTER); 
        add(btnParticipar, BorderLayout.SOUTH); 
    }

    public static void main(String[] args) {
        new TelaAbertura().setVisible(true);
    }
}

package Atividade1;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Exercicio1_BoasVindas extends JFrame {

    private JTextField txtNome;
    private JButton btnEntrar;

    public Exercicio1_BoasVindas() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Boas-Vindas");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        java.net.URL imgUrl = getClass().getResource("imagem.jpg");
        ImageIcon iconeOriginal = new ImageIcon(imgUrl);

        // Redimensiona a imagem para o tamanho do JLabel (250x120)
        java.awt.Image imagem = iconeOriginal.getImage().getScaledInstance(250, 120, java.awt.Image.SCALE_SMOOTH);

        JLabel lblImagem = new JLabel(new ImageIcon(imagem));
        lblImagem.setBounds(50, 20, 250, 120);
        add(lblImagem);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 160, 50, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(80, 160, 150, 25);
        add(txtNome);

        btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(115, 210, 80, 25);
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);
        add(btnEntrar);
    }

    private void btnEntrarActionPerformed(ActionEvent evt) {
        try {
            String nome = txtNome.getText();
            if (nome.trim().isEmpty()) {
                throw new Exception("O campo nome não pode estar vazio!");
            }
            JOptionPane.showMessageDialog(this, "Bem-vindo, " + nome + "!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Exercicio1_BoasVindas().setVisible(true));
    }
}
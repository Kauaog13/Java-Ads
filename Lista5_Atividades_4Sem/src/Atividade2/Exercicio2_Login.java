package Atividade2;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Exercicio2_Login extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar, btnSair;

    public Exercicio2_Login() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Login");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        try {
            java.net.URL imgUrl = getClass().getResource("imagem.jpg");
            if (imgUrl != null) {
                ImageIcon iconeOriginal = new ImageIcon(imgUrl);
                java.awt.Image imagem = iconeOriginal.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                JLabel lblImagem = new JLabel(new ImageIcon(imagem));
                lblImagem.setBounds(140, 20, 100, 100);
                add(lblImagem);
            }
        } catch (Exception e) {
            System.out.println("Imagem não encontrada");
        }

        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(70, 140, 60, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(140, 140, 150, 25);
        add(txtUsuario);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(70, 180, 60, 25);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(140, 180, 150, 25);
        add(txtSenha);

        btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(90, 230, 90, 25);
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);
        add(btnEntrar);

        btnSair = new JButton("Sair");
        btnSair.setBounds(200, 230, 90, 25);
        btnSair.addActionListener(e -> System.exit(0));
        add(btnSair);
    }

    private void btnEntrarActionPerformed(ActionEvent evt) {
        try {
            String usuario = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());

            if (usuario.trim().isEmpty() || senha.trim().isEmpty()) {
                throw new Exception("Por favor, preencha todos os campos.");
            }

            if (usuario.equals("admin") && senha.equals("123")) {
                JOptionPane.showMessageDialog(this, "Acesso permitido");
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Exercicio2_Login().setVisible(true));
    }
}
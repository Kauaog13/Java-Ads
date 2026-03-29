package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.UsuarioDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {
	
	private UsuarioDAO dao = new UsuarioDAO();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setBounds(100, 64, 68, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(100, 104, 68, 20);
		contentPane.add(lblNewLabel_1);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(158, 64, 144, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(158, 104, 144, 20);
		contentPane.add(txtSenha);
		
		JButton btnEntrar = new JButton("Login");
		btnEntrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        // 1. Pega o texto digitado nos campos de e-mail e senha 
		        String email = txtEmail.getText().trim(); 
		        String senha = new String(txtSenha.getPassword()).trim(); 

		        // 2. Verifica se o usuário esqueceu de preencher algo 
		        if(email.isEmpty() || senha.isEmpty()) { 
		            JOptionPane.showMessageDialog(null, "Preencha todos os campos!"); 
		            return; 
		        }

		        // 3. Pede para o DAO ir no banco de dados conferir se o login é válido 
		        if(dao.validarLogin(email, senha)) { 
		            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!"); 
		        } else { 
		            JOptionPane.showMessageDialog(null, "Email ou senha incorretos!"); 
		        }
		        
		    }
		});		btnEntrar.setBounds(85, 154, 122, 37);
		contentPane.add(btnEntrar);
		
		JButton btnAbrirCadastro = new JButton("Cadastrar");
		btnAbrirCadastro.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        // 1. Cria uma nova instância da tela de cadastro
		        TelaCadastro cadastro = new TelaCadastro(); 
		        
		        // 2. Torna a tela visível para o usuário
		        cadastro.setVisible(true);
		        
		    }
		});
		btnAbrirCadastro.setBounds(217, 154, 122, 37);
		contentPane.add(btnAbrirCadastro);

	}

}

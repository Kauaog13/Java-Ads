package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.UsuarioDAO;
import dto.UsuarioDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {
	
	private UsuarioDAO dao = new UsuarioDAO();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dao.criarTabelaSeNaoExistir();
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(97, 49, 64, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(97, 97, 64, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setBounds(97, 146, 64, 20);
		contentPane.add(lblNewLabel_2);
		
		txtNome = new JTextField();
		txtNome.setBounds(161, 49, 139, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(161, 97, 139, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(161, 146, 139, 20);
		contentPane.add(txtSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        String nome = txtNome.getText().trim();
		        String email = txtEmail.getText().trim();
		        String senha = new String(txtSenha.getPassword()).trim();

		        if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
		            return;
		        }

		        UsuarioDTO u = new UsuarioDTO(nome, email, senha);

		        if(dao.cadastrarUsuario(u)) {
		            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
		          
		            
		            // 1. Cria a tela de login novamente
		            TelaLogin login = new TelaLogin();
		            
		            // 2. Mostra a tela de login
		            login.setVisible(true);
		            
		            // 3. Fecha a tela de cadastro atual
		            dispose(); 
		            
		        } else {
		            JOptionPane.showMessageDialog(null, "Erro ao cadastrar. Email já existe?");
		        }
		        
		    }
		});
		btnCadastrar.setBounds(161, 187, 122, 32);
		contentPane.add(btnCadastrar);

	}
}

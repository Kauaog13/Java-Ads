package dao;

import dto.UsuarioDTO;
import java.sql.*;

public class UsuarioDAO {

    public void criarTabelaSeNaoExistir() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nome VARCHAR(100) NOT NULL, " +
                     "email VARCHAR(100) NOT NULL UNIQUE, " +
                     "senha VARCHAR(50) NOT NULL)";
        
        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean cadastrarUsuario(UsuarioDTO u) {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            ps.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                System.out.println("Email duplicado!");
            } else {
                e.printStackTrace();
            }
            return false;
        }
    }

    public boolean validarLogin(String email, String senha) {
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, email);
            ps.setString(2, senha);
            
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); // Retorna true se encontrou o usuário
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
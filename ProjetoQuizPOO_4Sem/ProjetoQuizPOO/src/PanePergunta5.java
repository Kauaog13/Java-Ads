import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanePergunta5 extends JPanel { // [cite: 58, 89]
    
    public PanePergunta5() {
        setLayout(null);
        
        JLabel lblPergunta = new JLabel("Pergunta 05: Para que serve o método setVisible?"); // [cite: 59]
        lblPergunta.setBounds(50, 20, 350, 30);
        add(lblPergunta);
        
        JRadioButton rbCorreta = new JRadioButton("Para exibir ou ocultar um componente"); // [cite: 60]
        rbCorreta.setBounds(50, 60, 300, 30);
        
        JRadioButton rb1 = new JRadioButton("Para fechar o programa"); // [cite: 60]
        rb1.setBounds(50, 90, 300, 30);
        
        JRadioButton rb2 = new JRadioButton("Para alterar a cor do painel"); // [cite: 60]
        rb2.setBounds(50, 120, 300, 30);
        
        ButtonGroup grupo = new ButtonGroup(); // [cite: 62]
        grupo.add(rbCorreta);
        grupo.add(rb1);
        grupo.add(rb2);
        
        add(rbCorreta);
        add(rb1);
        add(rb2);
        
        JButton btnVerificar = new JButton("Verificar"); // [cite: 61, 95]
        btnVerificar.setBounds(50, 170, 100, 30);
        add(btnVerificar);
        
        btnVerificar.addActionListener(new ActionListener() { // [cite: 68]
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbCorreta.isSelected()) { // [cite: 69]
                    JOptionPane.showMessageDialog(PanePergunta5.this, "Resposta correta!"); // [cite: 71, 96]
                    Quiz.pontuacao += 1; // [cite: 71]
                } else {
                    JOptionPane.showMessageDialog(PanePergunta5.this, "Resposta incorreta!"); // [cite: 73, 96]
                }
                
                // Exibe a pontuação final [cite: 84, 92]
                JOptionPane.showMessageDialog(PanePergunta5.this, "Sua pontuação final: " + Quiz.pontuacao); // [cite: 84]
                
                // Encerra a aplicação
                System.exit(0);
            }
        });
    }
}
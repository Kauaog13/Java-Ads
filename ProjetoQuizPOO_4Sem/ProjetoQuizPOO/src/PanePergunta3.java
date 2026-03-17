import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanePergunta3 extends JPanel { // [cite: 58, 89]
    
    public PanePergunta3() {
        setLayout(null);
        
        JLabel lblPergunta = new JLabel("Pergunta 03: Qual componente agrupa JRadioButtons?"); // [cite: 59]
        lblPergunta.setBounds(50, 20, 350, 30);
        add(lblPergunta);
        
        JRadioButton rbCorreta = new JRadioButton("ButtonGroup"); // [cite: 60, 62]
        rbCorreta.setBounds(50, 60, 300, 30);
        
        JRadioButton rb1 = new JRadioButton("JPanel"); // [cite: 60]
        rb1.setBounds(50, 90, 300, 30);
        
        JRadioButton rb2 = new JRadioButton("JButton"); // [cite: 60]
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
                    JOptionPane.showMessageDialog(PanePergunta3.this, "Resposta correta!"); // [cite: 71, 96]
                    Quiz.pontuacao += 1; // [cite: 71]
                } else {
                    JOptionPane.showMessageDialog(PanePergunta3.this, "Resposta incorreta!"); // [cite: 73, 96]
                }
                
                setVisible(false);
                Quiz.p4.setVisible(true);
            }
        });
    }
}
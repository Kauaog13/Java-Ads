import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanePergunta2 extends JPanel {
    
    public PanePergunta2() {
        setLayout(null);
        
        JLabel lblPergunta = new JLabel("Pergunta 02: Qual é a linguagem deste Quiz?");
        lblPergunta.setBounds(50, 20, 300, 30);
        add(lblPergunta);
        
        JRadioButton rb1 = new JRadioButton("Python");
        rb1.setBounds(50, 60, 100, 30);
        
        JRadioButton rbCorreta = new JRadioButton("Java");
        rbCorreta.setBounds(50, 90, 100, 30);
        
        JRadioButton rb2 = new JRadioButton("C++");
        rb2.setBounds(50, 120, 100, 30);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rbCorreta);
        grupo.add(rb2);
        
        add(rb1);
        add(rbCorreta);
        add(rb2);
        
        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(50, 170, 100, 30);
        add(btnVerificar);
        
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbCorreta.isSelected()) {
                    JOptionPane.showMessageDialog(PanePergunta2.this, "Resposta correta!");
                    Quiz.pontuacao += 1;
                } else {
                    JOptionPane.showMessageDialog(PanePergunta2.this, "Resposta incorreta!");
                }
                
                // Navegação: Ocultar painel atual e mostrar o próximo
                setVisible(false);
                Quiz.p3.setVisible(true);

            }
        });
    }
}
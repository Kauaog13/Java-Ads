import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanePergunta1 extends JPanel {
    
    public PanePergunta1() {
        setLayout(null); // Layout nulo para posicionamento manual (como no NetBeans)
        
        JLabel lblPergunta = new JLabel("Pergunta 01: Quanto é 3 + 3?");
        lblPergunta.setBounds(50, 20, 300, 30);
        add(lblPergunta);
        
        JRadioButton rb1 = new JRadioButton("10");
        rb1.setBounds(50, 60, 100, 30);
        
        JRadioButton rb2 = new JRadioButton("5");
        rb2.setBounds(50, 90, 100, 30);
        
        JRadioButton rbCorreta = new JRadioButton("6");
        rbCorreta.setBounds(50, 120, 100, 30);
        
        // Agrupando os botões para seleção única
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rbCorreta);
        
        add(rb1);
        add(rb2);
        add(rbCorreta);
        
        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(50, 170, 100, 30);
        add(btnVerificar);
        
        // Lógica de verificação
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbCorreta.isSelected()) {
                    JOptionPane.showMessageDialog(PanePergunta1.this, "Resposta correta!");
                    Quiz.pontuacao += 1;
                } else {
                    JOptionPane.showMessageDialog(PanePergunta1.this, "Resposta incorreta!");
                }
                
                // Navegação: Ocultar painel atual e mostrar o próximo
                setVisible(false);
                Quiz.p2.setVisible(true);
            }
        });
    }
}
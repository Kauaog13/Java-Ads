package Atividade5;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Exercicio5_Preferencias extends JFrame {

    private JRadioButton rbManha, rbTarde, rbNoite;
    private JButton btnSelecionar;
    private JLabel lblResultado;
    private ButtonGroup grupoTurno;

    public Exercicio5_Preferencias() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Qual horário você estuda");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        rbManha = new JRadioButton("Manhã"); 
        rbManha.setBounds(50, 30, 100, 25);
        rbTarde = new JRadioButton("Tarde"); 
        rbTarde.setBounds(50, 60, 100, 25);
        rbNoite = new JRadioButton("Noite"); 
        rbNoite.setBounds(50, 90, 100, 25);

        grupoTurno = new ButtonGroup();
        grupoTurno.add(rbManha);
        grupoTurno.add(rbTarde);
        grupoTurno.add(rbNoite);

        add(rbManha); add(rbTarde); add(rbNoite);

        btnSelecionar = new JButton("Selecionar"); 
        btnSelecionar.setBounds(50, 130, 100, 25);
        btnSelecionar.addActionListener(this::btnSelecionarActionPerformed);
        add(btnSelecionar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(50, 170, 200, 25);
        add(lblResultado);
    }

    private void btnSelecionarActionPerformed(ActionEvent evt) {
        String turno = "";
        if (rbManha.isSelected()) turno = "Manhã";
        if (rbTarde.isSelected()) turno = "Tarde";
        if (rbNoite.isSelected()) turno = "Noite";
        
        if(!turno.isEmpty()) {
            lblResultado.setText("Curso escolhido: " + turno);
        } else {
             JOptionPane.showMessageDialog(this, "Selecione um horário.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Exercicio5_Preferencias().setVisible(true));
    }
}
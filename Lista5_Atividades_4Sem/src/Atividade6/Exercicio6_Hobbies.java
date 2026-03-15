package Atividade6;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Exercicio6_Hobbies extends JFrame {

    private JCheckBox cbLer, cbJogar, cbProgramar, cbEsportes;
    private JButton btnEscolher;
    private JTextArea txtResultado;

    public Exercicio6_Hobbies() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Preferências do Usuário"); 
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        cbLer = new JCheckBox("Ler"); 
        cbLer.setBounds(50, 30, 150, 25);
        cbJogar = new JCheckBox("Jogar"); 
        cbJogar.setBounds(50, 60, 150, 25);
        cbProgramar = new JCheckBox("Programar"); 
        cbProgramar.setBounds(50, 90, 150, 25);
        cbEsportes = new JCheckBox("Praticar Esportes");
        cbEsportes.setBounds(50, 120, 150, 25);

        add(cbLer); add(cbJogar); add(cbProgramar); add(cbEsportes);

        btnEscolher = new JButton("Escolher"); 
        btnEscolher.setBounds(80, 160, 100, 25);
        btnEscolher.addActionListener(this::btnEscolherActionPerformed);
        add(btnEscolher);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtResultado);
        scrollPane.setBounds(30, 200, 220, 80);
        add(scrollPane);
    }

    private void btnEscolherActionPerformed(ActionEvent evt) {
        StringBuilder escolhas = new StringBuilder("Hobbies escolhidos:\n"); 
        
        if (cbLer.isSelected()) escolhas.append("Ler livros\n");
        if (cbJogar.isSelected()) escolhas.append("Jogar videogame\n");
        if (cbProgramar.isSelected()) escolhas.append("Programar\n");
        if (cbEsportes.isSelected()) escolhas.append("Praticar esporte\n");

        txtResultado.setText(escolhas.toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Exercicio6_Hobbies().setVisible(true));
    }
}
package Atividade4;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Exercicio4_Cursos extends JFrame {

    private JRadioButton rbPython, rbJava, rbCSharp;
    private JButton btnSelecionar;
    private JLabel lblResultado;
    private ButtonGroup grupoCursos;

    public Exercicio4_Cursos() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Escolha de Curso");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblTitulo = new JLabel("Selecione um curso:");
        lblTitulo.setBounds(50, 20, 150, 25);
        add(lblTitulo);

        rbPython = new JRadioButton("Python"); 
        rbPython.setBounds(50, 50, 100, 25);
        rbJava = new JRadioButton("Java"); 
        rbJava.setBounds(50, 80, 100, 25);
        rbCSharp = new JRadioButton("C#"); 
        rbCSharp.setBounds(50, 110, 100, 25);

        grupoCursos = new ButtonGroup();
        grupoCursos.add(rbPython);
        grupoCursos.add(rbJava);
        grupoCursos.add(rbCSharp);

        add(rbPython); add(rbJava); add(rbCSharp);

        btnSelecionar = new JButton("Selecionar"); 
        btnSelecionar.setBounds(50, 150, 100, 25);
        btnSelecionar.addActionListener(this::btnSelecionarActionPerformed);
        add(btnSelecionar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(50, 190, 200, 25);
        add(lblResultado);
    }

    private void btnSelecionarActionPerformed(ActionEvent evt) {
        try {
            String curso = "";
            if (rbPython.isSelected()) curso = "Python";
            else if (rbJava.isSelected()) curso = "Java";
            else if (rbCSharp.isSelected()) curso = "C#";
            else throw new Exception("Nenhuma opção marcada. Selecione um curso."); // Tratamento de exceção

            lblResultado.setText("Curso escolhido: " + curso); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Exercicio4_Cursos().setVisible(true));
    }
}
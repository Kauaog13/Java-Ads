package Atividade7;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Exercicio7_Alimentacao extends JFrame {

    private JCheckBox cbPizza, cbHamburguer, cbSalada, cbFrutas;
    private JButton btnEscolher;
    private JTextArea txtResultado;

    public Exercicio7_Alimentacao() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Preferências do Usuário"); 
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        cbPizza = new JCheckBox("Pizza"); 
        cbPizza.setBounds(50, 30, 150, 25);
        cbHamburguer = new JCheckBox("Hambúrguer"); 
        cbHamburguer.setBounds(50, 60, 150, 25);
        cbSalada = new JCheckBox("Salada"); 
        cbSalada.setBounds(50, 90, 150, 25);
        cbFrutas = new JCheckBox("Frutas"); 
        cbFrutas.setBounds(50, 120, 150, 25);

        add(cbPizza); add(cbHamburguer); add(cbSalada); add(cbFrutas);

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
        try {
            boolean marcouAlgum = false;
            StringBuilder escolhas = new StringBuilder("Você escolheu: ");
            
            if (cbPizza.isSelected()) { escolhas.append("Pizza, "); marcouAlgum = true; }
            if (cbHamburguer.isSelected()) { escolhas.append("Hambúrguer, "); marcouAlgum = true; }
            if (cbSalada.isSelected()) { escolhas.append("Salada, "); marcouAlgum = true; }
            if (cbFrutas.isSelected()) { escolhas.append("Frutas, "); marcouAlgum = true; }

            if (!marcouAlgum) {
                throw new Exception("Selecione pelo menos uma opção de alimento!"); // Tratamento se nada for marcado 
            }

            // Remove a última vírgula e espaço
            escolhas.setLength(escolhas.length() - 2); 
            txtResultado.setText(escolhas.toString());
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Exercicio7_Alimentacao().setVisible(true));
    }
}
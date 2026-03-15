package Atividade3;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalculadoraCompleta extends JFrame {

    private JTextField num1, num2;
    private JLabel lblResultado;
    private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

    public CalculadoraCompleta() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Calculadora de números"); 
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNum1 = new JLabel("Número 01");
        lblNum1.setBounds(50, 30, 80, 25);
        add(lblNum1);

        num1 = new JTextField();
        num1.setBounds(140, 30, 100, 25);
        add(num1);

        JLabel lblNum2 = new JLabel("Número 02");
        lblNum2.setBounds(50, 70, 80, 25);
        add(lblNum2);

        num2 = new JTextField();
        num2.setBounds(140, 70, 100, 25);
        add(num2);

        btnSomar = new JButton("Somar");
        btnSomar.setBounds(30, 120, 80, 25);
        btnSomar.addActionListener(e -> calcular("+"));
        add(btnSomar);

        btnSubtrair = new JButton("Subtrair");
        btnSubtrair.setBounds(115, 120, 80, 25);
        btnSubtrair.addActionListener(e -> calcular("-"));
        add(btnSubtrair);

        btnMultiplicar = new JButton("Multiplicar");
        btnMultiplicar.setBounds(200, 120, 95, 25);
        btnMultiplicar.addActionListener(e -> calcular("*"));
        add(btnMultiplicar);

        btnDividir = new JButton("Dividir");
        btnDividir.setBounds(300, 120, 80, 25);
        btnDividir.addActionListener(e -> calcular("/"));
        add(btnDividir);

        lblResultado = new JLabel("Resultado:"); // Exibe o resultado no JLabel
        lblResultado.setBounds(50, 170, 200, 25);
        add(lblResultado);
    }

    private void calcular(String operacao) {
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double res = 0;

            switch (operacao) {
                case "+": res = n1 + n2; break;
                case "-": res = n1 - n2; break;
                case "*": res = n1 * n2; break;
                case "/": 
                    if(n2 == 0) throw new ArithmeticException("Divisão por zero não permitida!");
                    res = n1 / n2; break;
            }
            lblResultado.setText("Resultado: " + res);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira apenas números válidos.", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new CalculadoraCompleta().setVisible(true));
    }
}
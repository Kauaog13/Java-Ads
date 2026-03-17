import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz extends JFrame {
    
    // Variável estática para controlar a pontuação global
    public static int pontuacao = 0;
    
    // Instanciando os 5 painéis estaticamente para permitir a navegação
    public static PanePergunta1 p1 = new PanePergunta1();
    public static PanePergunta2 p2 = new PanePergunta2();
    public static PanePergunta3 p3 = new PanePergunta3();
    public static PanePergunta4 p4 = new PanePergunta4();
    public static PanePergunta5 p5 = new PanePergunta5();
    
    public Quiz() {
        setTitle("Quiz Senac - POO II");
        setSize(450, 300); // Aumentei um pouco para garantir que tudo caiba bem
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); 
        
        // Criando o JPanel principal
        JPanel panePrincipal = new JPanel();
        panePrincipal.setLayout(null); // A correção está aqui: layout nulo para empilhar os painéis
        
        // Definindo o tamanho e posição de cada painel (mesmo tamanho do JFrame)
        p1.setBounds(0, 0, 450, 300);
        p2.setBounds(0, 0, 450, 300);
        p3.setBounds(0, 0, 450, 300);
        p4.setBounds(0, 0, 450, 300);
        p5.setBounds(0, 0, 450, 300);
        
        // Adicionando todos os painéis ao painel principal
        panePrincipal.add(p1);
        panePrincipal.add(p2);
        panePrincipal.add(p3);
        panePrincipal.add(p4);
        panePrincipal.add(p5);
        
        // Apenas a Pergunta 1 começa visível
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        
        setContentPane(panePrincipal);
    }

    public static void main(String[] args) {
        Quiz telaPrincipal = new Quiz();
        telaPrincipal.setVisible(true);
    }
}
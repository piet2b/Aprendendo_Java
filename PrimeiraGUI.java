import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimeiraGUI {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Olá Mundo");

        JLabel label = new JLabel("Bem-vindo a primeira GUI");

        frame.add(label);

        frame.setSize(300, 100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}

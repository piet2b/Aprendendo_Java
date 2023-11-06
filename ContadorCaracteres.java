import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorCaracteres {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contador de Caracteres");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JButton contarButton = new JButton("Contar Caracteres");
        JLabel resultadoLabel = new JLabel("Quantidade de Caracteres: 0");

        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                int quantidadeCaracteres = texto.length();
                resultadoLabel.setText("Quantidade de Caracteres: " + quantidadeCaracteres);
            }
        });

        JPanel panel = new JPanel();
        panel.add(textArea);
        panel.add(contarButton);
        panel.add(resultadoLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}

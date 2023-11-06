import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ObterIPEquivalente {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Obter IP de URL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JLabel urlLabel = new JLabel("Digite a URL:");
        JTextField urlTextField = new JTextField(30);
        JButton obterIPButton = new JButton("Obter IP");
        JLabel resultadoLabel = new JLabel("IP Equivalente: ");

        obterIPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = urlTextField.getText();
                try {
                    InetAddress address = InetAddress.getByName(url);
                    String ip = address.getHostAddress();
                    resultadoLabel.setText("IP Equivalente: " + ip);
                } catch (UnknownHostException ex) {
                    resultadoLabel.setText("URL inválida ou não encontrada.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(urlLabel);
        panel.add(urlTextField);
        panel.add(obterIPButton);
        panel.add(resultadoLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}

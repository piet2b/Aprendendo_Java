import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Simples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JTextField valor1Field = new JTextField(10);
        JTextField valor2Field = new JTextField(10);
        JButton somaButton = new JButton("Somar");
        JButton subtracaoButton = new JButton("Subtrair");
        JButton multiplicacaoButton = new JButton("Multiplicar");
        JButton divisaoButton = new JButton("Dividir");
        JLabel resultadoLabel = new JLabel("Resultado: ");

        somaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(valor1Field.getText());
                double valor2 = Double.parseDouble(valor2Field.getText());
                double resultado = valor1 + valor2;
                resultadoLabel.setText("Resultado: " + resultado);
            }
        });

        subtracaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(valor1Field.getText());
                double valor2 = Double.parseDouble(valor2Field.getText());
                double resultado = valor1 - valor2;
                resultadoLabel.setText("Resultado: " + resultado);
            }
        });

        multiplicacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(valor1Field.getText());
                double valor2 = Double.parseDouble(valor2Field.getText());
                double resultado = valor1 * valor2;
                resultadoLabel.setText("Resultado: " + resultado);
            }
        });

        divisaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(valor1Field.getText());
                double valor2 = Double.parseDouble(valor2Field.getText());
                if (valor2 != 0) {
                    double resultado = valor1 / valor2;
                    resultadoLabel.setText("Resultado: " + resultado);
                } else {
                    resultadoLabel.setText("Erro: Divisão por zero.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Valor 1: "));
        panel.add(valor1Field);
        panel.add(new JLabel("Valor 2: "));
        panel.add(valor2Field);
        panel.add(somaButton);
        panel.add(subtracaoButton);
        panel.add(multiplicacaoButton);
        panel.add(divisaoButton);
        panel.add(resultadoLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
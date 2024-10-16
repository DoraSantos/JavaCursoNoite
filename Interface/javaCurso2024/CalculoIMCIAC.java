package javaCurso2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoIMCIAC extends JFrame {
    private JTextField campoPeso, campoAltura, campoQuadril;
    private JLabel labelResultadoIMC, labelResultadoIAC;

    public CalculoIMCIAC() {
        // Configurações da janela
        super("Calculadora de IMC e IAC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 5, 5)); // Layout de grade com 6 linhas e 2 colunas

        // Campos de entrada
        JLabel labelPeso = new JLabel("Peso (kg):");
        campoPeso = new JTextField();

        JLabel labelAltura = new JLabel("Altura (m):");
        campoAltura = new JTextField();

        JLabel labelQuadril = new JLabel("Circunferência do Quadril (cm):");
        campoQuadril = new JTextField();

        // Labels para exibir os resultados
        labelResultadoIMC = new JLabel("IMC: ");
        labelResultadoIAC = new JLabel("IAC: ");

        // Botão para calcular
        JButton botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMCIAC();
            }
        });

        // Adicionar componentes à janela
        add(labelPeso);
        add(campoPeso);
        add(labelAltura);
        add(campoAltura);
        add(labelQuadril);
        add(campoQuadril);
        add(botaoCalcular);
        add(new JLabel()); // Placeholder vazio
        add(labelResultadoIMC);
        add(labelResultadoIAC);
    }

    // Método para calcular e exibir o IMC e o IAC
    private void calcularIMCIAC() {
        try {
            // Obtém os valores dos campos
            double peso = Double.parseDouble(campoPeso.getText());
            double altura = Double.parseDouble(campoAltura.getText());
            double quadril = Double.parseDouble(campoQuadril.getText());

            // Cálculo do IMC
            double imc = peso / (altura * altura);

            // Cálculo do IAC
            double iac = (quadril / (altura * Math.sqrt(altura))) - 18;

            // Exibe os resultados
            labelResultadoIMC.setText(String.format("IMC: %.2f", imc));
            labelResultadoIAC.setText(String.format("IAC: %.2f", iac));
        } catch (NumberFormatException ex) {
            // Se houver erro de entrada, mostra uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Criar e exibir a janela
        CalculoIMCIAC frame = new CalculoIMCIAC();
        frame.setVisible(true);
    }
}

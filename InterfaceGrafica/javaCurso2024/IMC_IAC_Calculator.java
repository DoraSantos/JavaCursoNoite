package javaCurso2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC_IAC_Calculator extends JFrame {

    // Campos de texto para entrada de dados
    private JTextField alturaField;
    private JTextField pesoField;
    private JTextField circunferenciaField;
    private JTextArea resultadoArea;

    public IMC_IAC_Calculator() {
        // Configurações da janela
        setTitle("Calculadora de IMC e IAC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Criação dos componentes
        alturaField = new JTextField(10);
        pesoField = new JTextField(10);
        circunferenciaField = new JTextField(10);
        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);

        // Botões de ação
        JButton calcularIMCButton = new JButton("Calcular IMC");
        JButton calcularIACButton = new JButton("Calcular IAC");

        // Painel para organização dos componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        // Adicionando componentes ao painel
        panel.add(new JLabel("Altura (em metros):"));
        panel.add(alturaField);
        panel.add(new JLabel("Peso (em kg):"));
        panel.add(pesoField);
        panel.add(new JLabel("Circunferência (em cm):"));
        panel.add(circunferenciaField);
        panel.add(calcularIMCButton);
        panel.add(calcularIACButton);
        panel.add(new JLabel("Resultados:"));
        panel.add(new JScrollPane(resultadoArea));

        // Ações dos botões
        calcularIMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });

        calcularIACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIAC();
            }
        });

        // Adicionar o painel à janela
        add(panel);
    }

    private void calcularIMC() {
        try {
            double altura = Double.parseDouble(alturaField.getText());
            double peso = Double.parseDouble(pesoField.getText());
            double imc = peso / (altura * altura);
            resultadoArea.setText("IMC: " + String.format("%.2f", imc));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularIAC() {
        try {
            double altura = Double.parseDouble(alturaField.getText());
            double circunferencia = Double.parseDouble(circunferenciaField.getText());
            double iac = (circunferencia / altura) - 18;
            resultadoArea.setText("IAC: " + String.format("%.2f", iac));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new IMC_IAC_Calculator().setVisible(true);
        });
    }
}   		
    			

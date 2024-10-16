package javaCurso2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadorBasico extends JFrame {
    private JTextField campoNumero1; // Campo de texto para o primeiro número
    private JTextField campoNumero2; // Campo de texto para o segundo número
    private JButton botaoSomar;      // Botão para realizar a soma
    private JLabel labelResultado;   // Label que exibirá o resultado

    public CalculadorBasico() {
        // Configurações da janela
        super("Calculadora Básica");
        setSize(300, 200); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLayout(null); // Usa layout absoluto para posicionamento manual dos componentes

        // Inicializando os componentes
        JLabel labelNumero1 = new JLabel("Número 1:");
        campoNumero1 = new JTextField();
        JLabel labelNumero2 = new JLabel("Número 2:");
        campoNumero2 = new JTextField();
        botaoSomar = new JButton("Somar");
        labelResultado = new JLabel("Resultado: ");

        // Definindo as posições e tamanhos dos componentes
        labelNumero1.setBounds(30, 30, 80, 20);
        campoNumero1.setBounds(120, 30, 100, 20);
        labelNumero2.setBounds(30, 60, 80, 20);
        campoNumero2.setBounds(120, 60, 100, 20);
        botaoSomar.setBounds(120, 90, 100, 30);
        labelResultado.setBounds(30, 130, 200, 20);

        // Adicionando o ActionListener ao botão
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém os valores dos campos de texto e converte para double
                    double numero1 = Double.parseDouble(campoNumero1.getText());
                    double numero2 = Double.parseDouble(campoNumero2.getText());

                    // Realiza a soma
                    double resultado = numero1 + numero2;

                    // Atualiza o JLabel com o resultado
                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    // Caso ocorra um erro na conversão, exibe uma mensagem de erro
                    labelResultado.setText("Por favor, insira números válidos.");
                }
            }
        });

        // Adicionando os componentes à janela
        add(labelNumero1);
        add(campoNumero1);
        add(labelNumero2);
        add(campoNumero2);
        add(botaoSomar);
        add(labelResultado);
    }

    public static void main(String[] args) {
        // Criar e exibir a janela
        CalculadorBasico frame = new CalculadorBasico();
        frame.setVisible(true); // Torna a janela visível
    }
}

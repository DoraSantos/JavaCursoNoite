package javaCurso2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioSimples extends JFrame {
    private JTextField campoNome;  // Campo de texto para o nome
    private JTextField campoIdade; // Campo de texto para a idade
    private JButton botaoExibir;   // Botão para exibir as informações

    public FormularioSimples() {
        // Configurações da janela
        super("Formulário Simples");
        setSize(300, 200);  // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLayout(null); // Usa layout absoluto para posicionamento manual dos componentes

        // Inicializando os campos de texto e o botão
        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField();
        JLabel labelIdade = new JLabel("Idade:");
        campoIdade = new JTextField();
        botaoExibir = new JButton("Exibir");

        // Definindo as posições e tamanhos dos componentes
        labelNome.setBounds(50, 30, 100, 20);
        campoNome.setBounds(100, 30, 120, 20);
        labelIdade.setBounds(50, 60, 100, 20);
        campoIdade.setBounds(100, 60, 120, 20);
        botaoExibir.setBounds(100, 100, 120, 30);

        // Adicionando o ActionListener ao botão
        botaoExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém os valores dos campos de texto
                String nome = campoNome.getText();
                String idade = campoIdade.getText();

                // Exibe as informações em um JOptionPane
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
            }
        });

        // Adicionando os componentes à janela
        add(labelNome);
        add(campoNome);
        add(labelIdade);
        add(campoIdade);
        add(botaoExibir);
    }

    public static void main(String[] args) {
        // Criar e exibir a janela
        FormularioSimples frame = new FormularioSimples();
        frame.setVisible(true); // Torna a janela visível
    }

	}

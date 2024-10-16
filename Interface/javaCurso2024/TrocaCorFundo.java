package javaCurso2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrocaCorFundo extends JFrame {
    private JPanel painel; // Painel onde a cor de fundo será alterada

    public TrocaCorFundo() {
        // Configurações da janela
        super("Troca de Cor de Fundo");
        setSize(400, 200); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLayout(new BorderLayout()); // Usa um layout de Border para posicionar os componentes

        // Inicializa o painel onde a cor de fundo será alterada
        painel = new JPanel();
        painel.setBackground(Color.WHITE); // Cor de fundo inicial branca

        // Criação dos botões
        JButton botaoVermelho = new JButton("Vermelho");
        JButton botaoAzul = new JButton("Azul");
        JButton botaoVerde = new JButton("Verde");
  
        // Painel para organizar os botões horizontalmente
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoVermelho);
        painelBotoes.add(botaoAzul);
        painelBotoes.add(botaoVerde);

        // Adiciona o painel e os botões à janela
        add(painel, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        // ActionListener para o botão Vermelho
        botaoVermelho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.RED); // Muda a cor de fundo para vermelho
            }
        });

        // ActionListener para o botão Azul
        botaoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.BLUE); // Muda a cor de fundo para azul
            }
        });

        // ActionListener para o botão Verde
        botaoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.GREEN); // Muda a cor de fundo para verde
            }
        });
    }

    public static void main(String[] args) {
        // Criar e exibir a janela
        TrocaCorFundo frame = new TrocaCorFundo();
        frame.setVisible(true); // Torna a janela visível
    }
}


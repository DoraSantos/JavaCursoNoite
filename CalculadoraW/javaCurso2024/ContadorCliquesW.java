package javaCurso2024;

	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class ContadorCliquesW {

	    private int contador = 0;  // Variável para armazenar o número de cliques

	    public ContadorCliquesW() {
	        // Criar a janela (JFrame)
	        JFrame frame = new JFrame("Contador de Cliques");
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);

	        // Criar o botão (JButton)
	        JButton botao = new JButton("Clique em mim!");
	        botao.setBounds(80, 50, 140, 30);  // Definir posição e tamanho

	        // Criar o rótulo (JLabel) para mostrar o contador
	        JLabel label = new JLabel("Cliques: 0");
	        label.setBounds(110, 100, 100, 30);  // Definir posição e tamanho

	        // Adicionar um ActionListener ao botão
	        botao.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                contador++;  // Incrementar o contador
	                label.setText("Cliques: " + contador);  // Atualizar o texto do JLabel
	            }
	        });

	        // Adicionar componentes ao JFrame
	        frame.add(botao);
	        frame.add(label);

	        // Tornar a janela visível
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        // Executar o programa
	        new ContadorCliquesW();
	    }
	


	}

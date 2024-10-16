package javaCurso2024;

		import javax.swing.*;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;

		public class ContadorCliques extends JFrame {
		    private int contador = 0; // Variável para armazenar o número de cliques
		    private JLabel label;     // Label que mostrará o número de cliques
		    private JButton botao;    // Botão que será clicado

		    public ContadorCliques() {
		        // Configurações da janela
		        super("Contador de Cliques");
		        setSize(300, 150);  // Define o tamanho da janela
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
		        setLayout(null); // Usa layout absoluto para posicionamento manual dos componentes

		        // Inicializando componentes
		        label = new JLabel("Cliques: 0");
		        botao = new JButton("Clique aqui");

		        // Definindo as posições e tamanhos dos componentes
		        label.setBounds(100, 30, 100, 20);
		        botao.setBounds(100, 60, 100, 30);

		        // Adicionando o ActionListener ao botão para tratar o clique
		        botao.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                contador++; // Incrementa o contador
		                label.setText("Cliques: " + contador); // Atualiza o texto do JLabel
		            }
		        });

		        // Adicionando os componentes à janela
		        add(label);
		        add(botao);
		    }

		    public static void main(String[] args) {
		        // Criar e exibir a janela
		        ContadorCliques frame = new ContadorCliques();
		        frame.setVisible(true); // Torna a janela visível
		    }

	}
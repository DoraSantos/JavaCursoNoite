package javaCurso2024;
	import javax.swing.*;
	import java.awt.event.*;
	import java.io.*;

	public class EditorDeTexto {

	    // Elementos da interface gráfica
	    private JFrame frame;
	    private JTextArea textArea;
	    private JMenuBar menuBar;
	    private JMenu menuArquivo;
	    private JMenuItem abrir, salvar, sair;

	    public EditorDeTexto() {
	        // Criar a janela principal
	        frame = new JFrame("Editor de Texto");
	        frame.setSize(600, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Criar a área de texto
	        textArea = new JTextArea();
	        frame.add(new JScrollPane(textArea));  // Permitir rolagem

	        // Criar a barra de menu
	        menuBar = new JMenuBar();

	        // Criar o menu "Arquivo"
	        menuArquivo = new JMenu("Arquivo");

	        // Opção para abrir um arquivo
	        abrir = new JMenuItem("Abrir");
	        abrir.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                abrirArquivo();
	            }
	        });

	        // Opção para salvar o arquivo
	        salvar = new JMenuItem("Salvar");
	        salvar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                salvarArquivo();
	            }
	        });

	        // Opção para sair
	        sair = new JMenuItem("Sair");
	        sair.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);  // Fechar o programa
	            }
	        });

	        // Adicionar itens ao menu "Arquivo"
	        menuArquivo.add(abrir);
	        menuArquivo.add(salvar);
	        menuArquivo.addSeparator();  // Separador visual
	        menuArquivo.add(sair);

	        // Adicionar o menu "Arquivo" à barra de menu
	        menuBar.add(menuArquivo);

	        // Adicionar a barra de menu à janela
	        frame.setJMenuBar(menuBar);

	        // Tornar a janela visível
	        frame.setVisible(true);
	    }

	    // Método para abrir um arquivo
	    private void abrirArquivo() {
	        JFileChooser fileChooser = new JFileChooser();
	        int resultado = fileChooser.showOpenDialog(frame);
	        if (resultado == JFileChooser.APPROVE_OPTION) {
	            File arquivo = fileChooser.getSelectedFile();
	            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
	                textArea.read(reader, null);  // Ler o conteúdo do arquivo para a área de texto
	            } catch (IOException ex) {
	                JOptionPane.showMessageDialog(frame, "Erro ao abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }

	    // Método para salvar um arquivo
	    private void salvarArquivo() {
	        JFileChooser fileChooser = new JFileChooser();
	        int resultado = fileChooser.showSaveDialog(frame);
	        if (resultado == JFileChooser.APPROVE_OPTION) {
	            File arquivo = fileChooser.getSelectedFile();
	            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
	                textArea.write(writer);  // Salvar o conteúdo da área de texto no arquivo
	            } catch (IOException ex) {
	                JOptionPane.showMessageDialog(frame, "Erro ao salvar o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new EditorDeTexto();  // Inicializar o editor de texto
	            }
	        });
	    }



	}

package javaCurso2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
		public class OlaMundoGUI extends JFrame {
			
			public OlaMundoGUI() {
				//Configurando a Tela:
				setTitle("Olá Mundo em JAVA");//Titulo da janela
				setSize(350, 250); //Definindo tamanho da tela.
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Criando um botão
				//JButton botao = new JButton("Clique em Mim");
				JButton botao = new JButton("<html><body style='text-align: center;border: solid;padding: 10px; font-size: 16px;'>Clique em Mim</body></html>"); 
				
				//Adicionar um Action Listener ao botão:
				botao.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						//Exibir um popup com a mensagem "Olá Mundo":
						JOptionPane.showMessageDialog(null, "Olá Mundo!");
								}
		});
				//Adicionar o botão na janela:
				add(botao); 
				//Torna a janela visivel:
				setVisible(true);
				}
			public static void main(String[]args) {
				//Executar a interface gráfica:
				new OlaMundoGUI();
	}

}

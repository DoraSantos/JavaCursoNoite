package javaCurso2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EncurtadorURL{
	
    // Método para encurtar a URL usando a API do TinyURL
    public static String encurtarURL(String urlOriginal) {
        String urlEncurtada = "";
        try {
            // URL da API do TinyURL com o parâmetro da URL original
            String tinyUrlApi = "http://tinyurl.com/api-create.php?url=" + urlOriginal;

            // Criar uma conexão HTTP para a API
            URL url = new URL(tinyUrlApi);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            // Ler a resposta da API
            BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String inputLine;
            StringBuilder resposta = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                resposta.append(inputLine);
            }
            in.close();

            // A resposta será a URL encurtada
            urlEncurtada = resposta.toString();
        } catch (Exception e) {
            e.printStackTrace();
            urlEncurtada = "Erro ao encurtar a URL";
        }

        return urlEncurtada;
    }

    public static void main(String[] args) {
        // Criar a janela
        JFrame janela = new JFrame("Encurtador de URL");
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        // Texto explicativo
        JLabel label = new JLabel("Insira a URL que deseja encurtar:");
        label.setBounds(20, 20, 350, 30);
        janela.add(label);

        // Campo de entrada de texto para a URL
        JTextField entradaUrl = new JTextField();
        entradaUrl.setBounds(20, 50, 350, 30);
        janela.add(entradaUrl);

        // Botão para encurtar a URL
        JButton botaoEncurtar = new JButton("Encurtar URL");
        botaoEncurtar.setBounds(20, 90, 150, 30);
        janela.add(botaoEncurtar);

        // Label para mostrar o resultado da URL encurtada
        JLabel resultadoUrl = new JLabel("");
        resultadoUrl.setBounds(20, 130, 350, 30);
        janela.add(resultadoUrl);

        // Ação ao clicar no botão
        botaoEncurtar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String urlOriginal = entradaUrl.getText();
                if (!urlOriginal.isEmpty()) {
                    // Chamar o método que encurta a URL
                    String urlEncurtada = encurtarURL(urlOriginal);
                    resultadoUrl.setText("URL Encurtada: " + urlEncurtada);
                } else {
                    resultadoUrl.setText("Por favor, insira uma URL válida.");
                }
            }
        });

        // Tornar a janela visível
        janela.setVisible(true);
    }
}

	
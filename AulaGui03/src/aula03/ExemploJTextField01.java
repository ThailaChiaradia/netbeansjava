package aula03;
import javax.swing.*;

public class ExemploJTextField01 {
    public static void main(String[] args)
    {
        JFrame janela = new JFrame("Exemplo 01 TextField"); // criou objeto da janela
        
        JTextField texto1, texto2; // declarou as variaveis de textfield
        
        texto1 = new JTextField("Nome: "); // criou objeto de texto 1 com mensagem para o usuario
        texto1.setSize(200, 30); // definiu o tamanho da caixa 
        texto1.setLocation(50, 100);
        
        texto2 = new JTextField("E-mail: ");
        texto2.setSize(200, 30);
        texto2.setLocation(50, 150);
        
        janela.add(texto1);
        janela.add(texto2);
        
        janela.setSize(400, 400);
        janela.setLayout(null);
        janela.setVisible(true);
    }
    
}

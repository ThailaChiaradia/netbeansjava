package aula03;
import java.awt.*;
import javax.swing.*;

public class ExemploTextField02 {
    public static void main(String[] args)
    {
        JFrame janela = new JFrame("Exemplo 02 de TextField");
        JTextField texto1, texto2, texto3, texto4;
        
        texto1 = new JTextField("Exemplo com cores e fontes"); 
        texto1.setFont(new Font("Serif", Font.BOLD, 18));
        texto1.setForeground(Color.WHITE);
        texto1.setBackground(Color.BLUE);
        texto1.setSize(300, 40);
        texto1.setLocation(50, 100);
        
        texto2 = new JTextField("Caixa de texto sem nenhuma edição");
        texto2.setBounds(50, 150, 250, 30);
        texto2.setEditable(false);
        
        texto3 = new JTextField("Texto da caixa centralizado");
        texto3.setBounds(50, 200, 200, 30);
        texto3.setHorizontalAlignment(JTextField.CENTER);
        
        texto4 = new JTextField("Destacar texto selecionado");
        texto4.setSelectionColor(Color.MAGENTA);
        texto4.setSelectedTextColor(Color.CYAN);
        texto4.setBounds(50, 250, 200, 30);
        
        janela.add(texto1);
        janela.add(texto2);
        janela.add(texto3);
        janela.add(texto4);
        
        janela.setSize(400, 400);
        janela.setLayout(null);
        janela.setVisible(true);
        
    }
}

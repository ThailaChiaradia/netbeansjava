package aula03;
import javax.swing.*;

public class ExemploTextArea {
    ExemploTextArea()
    {
        JFrame janela = new JFrame("Exemplo TextArea");
        
        JTextArea texto = new JTextArea("Java Swing: TextArea");
        
        texto.setBounds(35, 20, 200, 200);
        
        janela.add(texto);
        janela.setSize(300, 300);
        janela.setLayout(null);
        janela.setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        new ExemploTextArea();
    }
}

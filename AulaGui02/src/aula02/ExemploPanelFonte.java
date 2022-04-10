package aula02;
import java.awt.*;
import javax.swing.*;

public class ExemploPanelFonte {
    public static void main(String args[])
    {
        JFrame janela = new JFrame("Exemplo de fontes");
        
        JLabel label1;
        label1 = new JLabel("verdana");
        label1.setBounds(10, 10, 100, 30);
        label1.setFont(new Font("Verdana", Font.PLAIN, 20));
        label1.setForeground(Color.GREEN);
        
        JLabel label2;
        label2 = new JLabel ("Arial");
        label2.setBounds(10, 50, 100, 30);
        label2.setFont(new Font("Arial", Font.PLAIN, 25));
        label2.setForeground(Color.YELLOW);
        
        janela.add(label1);
        janela.add(label2);
        janela.setSize(400, 400);
        janela.setLayout(null);
        janela.setVisible(true);
        
    }
    
}

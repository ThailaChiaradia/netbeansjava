package aula01;
import javax.swing.*;

public class ExemploBoxLayout {
    public static void main (String args[]) {

        JPanel c = new JPanel();
        c.setLayout(new BoxLayout (c, BoxLayout.Y_AXIS)); // criou um layout de botoes em coluna no caso com o Y
        
        c.add(new JButton ("Um"));
        c.add(new JButton ("Dois"));
        c.add(new JButton ("Três"));
        c.add(new JButton ("Quatro"));
        
        
        JFrame janela = new JFrame ("Janela BoxLayout");
        janela.add(c);
        janela.setVisible (true);
        janela.setSize (200, 200);
        janela.setLocationRelativeTo (null);
        janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
}
}
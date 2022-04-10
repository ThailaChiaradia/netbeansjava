package aula02;
import java.awt.*;
import javax.swing.*;

public class ExemploLabelImage extends JFrame
{
    public ExemploLabelImage() throws HeadlessException
    {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Icon icone = new ImageIcon(getClass().getResource("java.png"));
        JLabel label1 = new JLabel(icone);
        
        getContentPane().add(label1);
    }
    
    public static void main(String[] args)
    {
        new ExemploLabelImage().setVisible(true);
    }
}

package calculadora;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame{
    
    public Principal()
    {
        super("Calculadora - Thaila");
        this.setSize(400, 400);
        
        Container c = getContentPane();
        Calculadora janela = new Calculadora();
        c.add(janela);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new Principal();
    }
}

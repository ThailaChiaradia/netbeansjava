package aula01;

import java.awt.*;
import javax.swing.*;

public class ExemploCardGridLayout extends JFrame {
    public ExemploCardGridLayout (){
        
        JPanel p = new JPanel(); // criou painel
        p.setLayout (new GridBagLayout());  // definiu layout do painel

        
        GridBagConstraints c = new GridBagConstraints();   //cria um objeto GridBagConstraints
        c.insets = new Insets(2, 2, 2, 2);
        c.gridx = 0; // coluna 0
        c.gridy = 0; // linha 0
        c.ipadx = 5; // aumenta a largura dos componentes em 10 pixels
        c.ipady = 5; // aumenta a altura dos componentes em 10 pixels
        
        p.add (new JButton("Java"), c);
        c.gridx = 1; // coluna 1
        c.ipadx = 0; // largura // resets the pad to 0 
        c.ipady = 0; // altura
        
        p.add (new JButton ("PHP"), c);
        c.gridx = 0; // coluna 0
        c.gridy = 1; // linha 1
        c.gridwidth = 2;
        
        p.add (new JButton(" Python"), c);
        c.gridx = 1; // coluna 1
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(p);
        
        
    }
    
    public static void main(String[] args ){
        ExemploCardGridLayout frm = new ExemploCardGridLayout();
        frm.setTitle("Exemplo GridBagLayout");
        frm.setSize (400,200);
        frm.setVisible(true); 
 
    }
}

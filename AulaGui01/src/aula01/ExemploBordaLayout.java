package aula01;
import java.awt.BorderLayout;
import javax.swing.*;
    
public class ExemploBordaLayout {
        public static void main (String args[]) {

            JPanel c = new JPanel(new BorderLayout());  // criou painel
            
            JButton b1 = new JButton ("1"); // criou botão 1
            c.add (b1,BorderLayout.NORTH);  // adicionou botão 1
            
            JButton b2 = new JButton ("2"); // criou botão 2
            c.add (b2, BorderLayout.EAST);  // adicionou botão 2
            
            JButton b3 = new JButton ("3"); // criou botão 3
            c.add (b3, BorderLayout.SOUTH); // adicionou botão 3
            
            JButton b4 = new JButton ("4"); // criou botão 4
            c.add (b4, BorderLayout.WEST);  // adicionou botão 4
            
            JButton b5 = new JButton ("5"); // criou botão 5
            c.add (b5, BorderLayout.CENTER);// adicionou botão 5
            
            
            JFrame janela = new JFrame("Janela BorderLayout"); // criou janela
            janela.add (c);  //adicionou a janela
            janela.setVisible (true); // fez ficar visivel a janela
            janela.setBounds (50, 100, 400,150); // define a posição e tamanho da janela
            janela.setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);  // permite fechar a janela
}
}
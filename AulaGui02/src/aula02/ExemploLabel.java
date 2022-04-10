package aula02;
import javax.swing.*;  

public class ExemploLabel {
	public static void main(String args[]) 
        {
            
	    JFrame janelalb = new JFrame("Exemplo Label");  
            
	    JLabel l1,l2;  
            
	    l1 = new JLabel("Primeira Label");  
	    l1.setBounds(50, 50, 100, 30);  
            
	    l2 = new JLabel("Segunda Label");  
	    l2.setBounds(50, 100, 100, 30);  
            
	    janelalb.add(l1); 
            janelalb.add(l2);  
            
	    janelalb.setSize(300,300);  
	    janelalb.setLayout(null);  
	    janelalb.setVisible(true);  
        } 
}
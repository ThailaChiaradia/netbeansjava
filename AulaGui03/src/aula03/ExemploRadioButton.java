package aula03;
import javax.swing.*;

public class ExemploRadioButton {
    
    JFrame janela;
    
    ExemploRadioButton()
    {
        janela = new JFrame("Exemplo RadioButon");
        
        JRadioButton r1 = new JRadioButton("Primavera");
        JRadioButton r2 = new JRadioButton("Verão");
        JRadioButton r3 = new JRadioButton("Outono");
        JRadioButton r4 = new JRadioButton("Inverno");
        
        r1.setBounds(80, 30, 100, 30);
        r2.setBounds(80, 60, 100, 30);
        r3.setBounds(80, 90, 100, 30);
        r4.setBounds(80, 120, 100, 30);
        
        ButtonGroup bg = new ButtonGroup(); // para que o usuário so possaselecionar uma opção
        
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        
        janela.add(r1);
        janela.add(r2);
        janela.add(r3);
        janela.add(r4);
        
        janela.setSize(300, 300);
        janela.setLayout(null);
        janela.setVisible(true);
               
    }
    
    public static void main(String[] args)
    {
        new ExemploRadioButton();
    }
}

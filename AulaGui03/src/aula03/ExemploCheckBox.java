package aula03;
import javax.swing.*;

public class ExemploCheckBox {
    
    ExemploCheckBox()
    {
        JFrame janela = new JFrame("Exemplo de checkbox");
        
        JCheckBox caixa1 = new JCheckBox("C++");
        caixa1.setBounds(100, 50, 200, 50);
        
        JCheckBox caixa2 = new JCheckBox("Java", true);
        caixa2.setBounds(100, 100, 200, 50);
        
        janela.add(caixa1);
        janela.add(caixa2);
        janela.setSize(300,300);
        janela.setLayout(null);
        janela.setVisible(true);
                 
    }
    
    public static void main(String[] args)
    {
        new ExemploCheckBox();
    }
}

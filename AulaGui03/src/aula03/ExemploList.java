package aula03;
import javax.swing.*;

public class ExemploList {
 
    ExemploList()
    {
        JFrame janela = new JFrame("Exemplo Lista");
        
        DefaultListModel<String> l1 = new DefaultListModel<>();
        
        l1.addElement("Acerola");
        l1.addElement("Banana");
        l1.addElement("Maçã");
        l1.addElement("Laranja");
        l1.addElement("Pera");
        
        JList<String> lista = new JList<>(l1);
        lista.setBounds(50, 30, 100, 100);
        
        janela.add(lista);
        janela.setSize(300, 300);
        janela.setLayout(null);
        janela.setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        new ExemploList();
    }
}

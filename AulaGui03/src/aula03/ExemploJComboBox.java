package aula03;
import javax.swing.*;

public class ExemploJComboBox {

    JFrame janela;
    
    ExemploJComboBox()
    {
        janela = new JFrame("Exemplo JComboBox");
        
        String semana[] = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};
        
        JComboBox caixa = new JComboBox(semana);
        
        caixa.setBounds(60, 30, 150, 20);
        
        janela.add(caixa);
        janela.setSize(300, 300);
        janela.setLayout(null);
        janela.setVisible(true);
    }
    
    public static void main(String[] args){
        
        new ExemploJComboBox();
    }
}

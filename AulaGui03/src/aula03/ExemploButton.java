package aula03;
import javax.swing.*;

public class ExemploButton {
    public static void main(String[] args)
    {
        JFrame janela = new JFrame("Exemplo JButton");
        
        JButton botao = new JButton("Clique aqui");
        botao.setBounds(100, 100, 150, 30);
        
        janela.add(botao);
        janela.setSize(400, 300);
        janela.setLayout(null);
        janela.setVisible(true);
        
                
        
    }    
}

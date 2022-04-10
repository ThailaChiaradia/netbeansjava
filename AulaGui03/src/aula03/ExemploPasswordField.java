package aula03;
import javax.swing.*;

public class ExemploPasswordField {
    public static void main(String[] args)
    {
    
    JFrame janela = new JFrame("Exemplo PasswordField");
    
    JPasswordField senha = new JPasswordField();
    senha.setEchoChar('$');
    
    JLabel l1 = new JLabel("Senha:");
    l1.setBounds(20,100, 80,30); 
    
    senha.setBounds(70, 100, 100, 30);
    
    janela.add(senha);
    janela.add(l1);
    janela.setSize(300, 300);
    janela.setLayout(null);
    janela.setVisible(true);
    
    }
}

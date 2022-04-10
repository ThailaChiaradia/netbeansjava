package aula01;

import javax.swing.*;

public class ExemploFrame {
    public static void main(String s[]) {
        
        JFrame frame = new JFrame("Exemplo criação de um Frame");
        
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
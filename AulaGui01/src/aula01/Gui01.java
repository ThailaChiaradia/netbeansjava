package aula01;
import javax.swing.*;

public class Gui01 {
public static void main (String[] args) {
    
    JFrame frame = new JFrame("Meu primeiro GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,350);
    
    JButton button = new JButton("Clique");
    frame.getContentPane().add(button);
    frame.setVisible(true);
}
}
package media;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame {

    public Principal() {
        super("Média Simples");
        this.setSize(300, 200);

        Container c = getContentPane();
        MediaCalcula janela = new MediaCalcula();
        c.add(janela);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Principal();
    }
}

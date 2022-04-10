package aula03;

import java.awt.*;
import javax.swing.*;

public class ExemploJButtonIcon {
	public static void main(String args[]) {

	    JFrame frame = new JFrame("Botões com Ícones");

	    frame.setLayout(new GridLayout(1,2));
	    
	    Icon saveIcon = new ImageIcon("save.png");
	    JButton buttonSave = new JButton("salvar", saveIcon);
	    
	    Icon delIcon = new ImageIcon("trash.png");
	    JButton buttonDelete = new JButton("excluir", delIcon);
	    
	    frame.add(buttonSave);
	    frame.add(buttonDelete);
	    frame.setSize(300, 200);
	    frame.setVisible(true);
	}
}
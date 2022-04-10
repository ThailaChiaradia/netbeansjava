package aula04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo04 {
    
	private JFrame janela;
	private JLabel header;
	private JLabel status;
	private JPanel controle;

	public Exemplo04()
        {
	      prepareGUI();
	}
        
	private void prepareGUI()
        {
	      janela = new JFrame("Exemplo SWING Listener");
	      janela.setSize(400,400);
	      janela.setLayout(new GridLayout(3, 1));

	      header = new JLabel("",JLabel.CENTER );
	      status = new JLabel("",JLabel.CENTER);        
	      status.setSize(350,100);
              
	      controle = new JPanel();
	      controle.setLayout(new FlowLayout());
              
              
	      janela.addWindowListener(new WindowAdapter() 
              {
	         public void windowClosing(WindowEvent windowEvent)
                 {
	            System.exit(0);
	         }        
	      });
              
	      janela.add(header);
	      janela.add(controle);
	      janela.add(status);
	      janela.setVisible(true);  
	   }
        
	   private void showMouseListenerDemo()
           {
	      header.setText("Listener em Ação: MouseListener");      

	      JPanel panel = new JPanel();      
	      panel.setBackground(Color.yellow);
	      panel.setLayout(new FlowLayout());        
	      panel.addMouseListener(new CustomMouseListener());

	      JLabel mensagem = new JLabel("Orientação a Objetos: JAVA",JLabel.CENTER);        
	      panel.add(mensagem);

	      mensagem.addMouseListener(new CustomMouseListener());
	      panel.add(mensagem);

	      controle.add(panel);
	      janela.setVisible(true);  
	   }
           
	   class CustomMouseListener implements MouseListener 
           {
                public void mouseClicked(MouseEvent e) 
                {
                   status.setText("Posição do Clique (X,Y): ("+e.getX()+", "+e.getY() +")");
                }

                public void mousePressed(MouseEvent e) // Chamado quando um botão do mouse é pressionado em um componente.
                {
                }

                public void mouseReleased(MouseEvent e)  // Chamado quando um botão do mouse é liberado em um componente
                {
                }

                public void mouseEntered(MouseEvent e)  // Chamado quando o mouse entra em um componente.
                {
                }

                public void mouseExited(MouseEvent e)  // Chamado quando o mouse sai de um componente.
                {
                }
	   }
           
	   public static void main(String[] args)
           {
                Exemplo04 swingListenerDemo = new Exemplo04();  
                swingListenerDemo.showMouseListenerDemo();
	   }
}

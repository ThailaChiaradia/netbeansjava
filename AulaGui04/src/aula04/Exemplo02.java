package aula04;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo02 {
    
    private JFrame janela;
    private JLabel header;
    private JLabel status;
    private JPanel controle;
    
    public Exemplo02()
    {
        prepareGUI();
    }
    
    private void prepareGUI()
    {
        janela = new JFrame("Exemplo Eventos Botoões");
        janela.setSize(400, 400);
        janela.setLayout(new GridLayout(3, 1)); // 3 colunas 1 linha
        
        header = new JLabel("", JLabel.CENTER);
        
        status = new JLabel("", JLabel.CENTER);
        status.setSize(350, 100);
        
        janela.addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });
        
        
        controle = new JPanel();
        controle.setLayout(new FlowLayout());
        
        janela.add(header);
        janela.add(controle);
        janela.add(status);
        janela.setVisible(true);
    }
    
    private void showEventDemo()
    {
        
        header.setText("Controle em ação: Botão");
        
        JButton ok = new JButton("OK");
        JButton enviar = new JButton("ENVIAR");
        JButton cancelar = new JButton("CANCELAR");
        
        ok.setActionCommand("OK");
        enviar.setActionCommand("ENVIAR");
        cancelar.setActionCommand("CANCELAR");
        
        ok.addActionListener(new ButtonClickListener()); 
        enviar.addActionListener(new ButtonClickListener()); 
        cancelar.addActionListener(new ButtonClickListener()); 
        
        controle.add(ok);
        controle.add(enviar);
        controle.add(cancelar);
        
        janela.setVisible(true);
    }
    
    private class ButtonClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String comando = e.getActionCommand();
            
            if(comando.equals("OK"))
            {
                status.setText("OK clicado");
            }
            else if(comando.equals("ENVIAR"))
            {
                status.setText("ENVIAR clicaco");
            }
            else
            {
                status.setText("CANCELAR clicado");
            }
        }
    
    
    }
    
    public static void main(String[] args)
    {
        Exemplo02 swingControlDemo = new Exemplo02();
        
        swingControlDemo.showEventDemo();
    }
}
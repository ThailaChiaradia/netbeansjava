package aula04;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exemplo01 {
    private static void createWindow()      // fun~ção criar janela
    {
        JFrame janela = new JFrame("Exemplo Eventos");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        createUI(janela); // função interface usuario
        janela.setLocationRelativeTo(null);
        janela.setSize(500, 200);
        janela.setVisible(true);        
    }
    
    public static void createUI(final JFrame janela)
    {
        JPanel panel = new JPanel(); // criou o painel que vai ficar o botao                
        LayoutManager layout = new FlowLayout(); // layout        
        panel.setLayout(layout);
        
        JButton ok = new JButton("OK"); // criou botao ok
        
        JButton enviar = new JButton("ENVIAR"); //criou botao enviar
        
        ok.addActionListener(new ActionListener() // criou o metodo para "ouvir" o evento ao clicar o botão 
        {
            public void actionPerformed(ActionEvent e) // acionado quando uma ação ocorre
            {
                JOptionPane.showMessageDialog(janela, "Botão OK clicado"); //JOPtionPane... criou caixa de dialogo que aparece a mensagem ao clicar
            }
        });
        
        enviar.addActionListener(new ActionListener() // criou o metodo para "ouvir" o evento ao clicar o botão 
        {
            public void actionPerformed(ActionEvent e) // acionado quando uma ação ocorre
            {
                JOptionPane.showMessageDialog(janela, "Botão ENVIAR clicado"); //JOPtionPane... criou caixa de dialogo que aparece a mensagem ao clicar
            }
        });
        
        //janela.getRootPane().setDefaultButton(enviar); -> não sei pq a sora botou isso, eu tirei e não faz diferença
        
        panel.add(ok);
        panel.add(enviar);
        
        janela.getContentPane().add(panel, BorderLayout.CENTER);
          
    }
    
    public static void main(String[] args){
        createWindow();
    }
}

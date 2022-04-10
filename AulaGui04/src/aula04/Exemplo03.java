package aula04;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo03 {
    
    private JFrame janela;
    private JLabel header;
    private JLabel status;
    private JPanel controle;
    
    public Exemplo03()
    {
        prepareGUI();
    }
    
    private void prepareGUI()
    {
        janela = new JFrame("Exemplo ItemListener");
        janela.setSize(400, 400);
        janela.setLayout(new GridLayout(3, 1)); // 3 colunas 1 linha
        
        header = new JLabel("", JLabel.CENTER);
        
        status = new JLabel("",JLabel.CENTER);
        status.setSize(350, 100);
        
        controle = new JPanel();
        controle.setLayout(new FlowLayout());
        
        
        janela.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent windowEvent) //acionado quando o usuário tentar fechar uma janela através do system menu
            {
                System.exit(0);
            }
        });      
        
        
        janela.add(header);
        janela.add(controle);
        janela.add(status);
        janela.setVisible(true);        
    }
    
    private void showItemListenerDemo()
    {
        header.setText("Listener em Ação: ItemListener"); // declarou o que será mostrado no cabeçalho
        
        JCheckBox morango = new JCheckBox("Morango"); // criando a checkbox (caixa de marcar) de morango
        JCheckBox maca = new JCheckBox("Maça");  // criando a checkbox (caixa de marcar) de maça
        JCheckBox pera = new JCheckBox("Pera");  // criando a checkbox (caixa de marcar) de pera
        
        morango.addItemListener(new CustomItemListener());
        maca.addItemListener(new CustomItemListener());
        pera.addItemListener(new CustomItemListener());
        
        controle.add(morango);
        controle.add(maca);
        controle.add(pera);
        janela.setVisible(true);
    }
    
    class CustomItemListener implements ItemListener 
    {
        public void itemStateChanged(ItemEvent e)
        {
            status.setText(((JCheckBox)e.getItem()).getText() + " Checkbox: " 
            + (e.getStateChange() == 1 ? "checked" : "unchecked"));
                
        }
    }
    
    public static void main(String[] args)
    {
        Exemplo03 ex = new Exemplo03();
        
        ex.showItemListenerDemo();
    }
}

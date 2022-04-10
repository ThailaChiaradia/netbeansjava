package aula01;

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
    public static void main (String args[]) {
        int i;
        
        JFrame janela = new JFrame("Teste FlowLayout do panel");
        janela.setBounds(100, 100, 400, 250);
        janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        FlowLayout flow = new FlowLayout(FlowLayout.LEFT); //Define o layout do container
        Container caixa = janela.getContentPane(); // Define o container
        caixa.setLayout (flow); // Seta layout do container
        
        
        
        for (i =1; i <=8; i ++)
        {
            caixa.add(new JButton (("APERTE "+ i)));
            janela.setVisible(true);
        }
        
        JLabel label = new JLabel("Exemplo de texto:"); // define o objeto de texto
        caixa.add(label);   // adiciona o texto
        
        JTextField campo = new JTextField(15); //criando uma caixa para escrever
        caixa.add(campo);   // adiciona a caixa 
        
        janela.pack(); // alinha os componentes um ao lado do outro
    }
}
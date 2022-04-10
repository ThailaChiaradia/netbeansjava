package aula01;
import java.awt.*;
import javax.swing.*;

public class ExemploGridLayout {
    public static void main (String args[]) {
        
        JPanel c = new JPanel();  // Criou painel
        c.setLayout(new GridLayout (2, 2));  // definiu layout tipo grid
        
        c.add (new JButton ("um")); // criou botão com nome 1
        c.add (new JTextField (5)); // caixa de texto para escrever
        c.add (new JButton ("dois"));
        c.add (new JButton ("três"));
        
        JFrame janela = new JFrame ("Teste GridLayout"); // criou a janela do programa
        janela.add (c);  // aidicionou a janela
        janela.setVisible (true);  // faz a janela ficar visivel
        janela.setBounds (50, 100, 400,150);  // define posição e tamanho da janela
        janela.setDefaultCloseOperation ( JFrame. EXIT_ON_CLOSE);  // define o que ira acontecer se o usuario tentar fechar a janela
}
}
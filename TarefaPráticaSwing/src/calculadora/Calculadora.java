//faça uma calculadora onde o usuário informe 2 valores e escolha a operação que deseja efetuar. Exiba o resultado da operação ao final.

package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JPanel{
    
    private JTextField textV1, textV2, textResultado;
    private JLabel labelV1, labelV2, labelResultado;
    private JButton btMais, btMenos, btDividir, btVezes, btLimpa;
    
    public Calculadora()
    {
        this.setLayout(new GridLayout(6, 4, 3, 1));
        
        
        labelV1 = new JLabel("Valor 1:", JTextField.CENTER); // Objeto caixa VALOR VALOR 1
        labelV1.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(labelV1);
        
        textV1 = new JTextField(); // objeto descrição VALOR 1
        this.add(textV1);
        
    // ------------------------------------------------------------------------------------- //
        
        labelV2 = new JLabel("Valor 2: ", JTextField.CENTER);  // Objeto caixa VALOR 2
        labelV2.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(labelV2);
        
        textV2 = new JTextField(); // Objeto descrição VALOR 2
        this.add(textV2);
       
    // ------------------------------------------------------------------------------------- // 
    
        btMais = new JButton("+");
        btMais.setFont(new Font("Arial", Font.BOLD, 40));
        btMais.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                CalcularSoma();
            }
        });        
        this.add(btMais);
        
        
    // ------------------------------------------------------------------------------------- //     

        btMenos = new JButton("-");
        btMenos.setFont(new Font("Arial", Font.BOLD, 40));
        btMenos.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CalcularSubtracao();
            }
        });
        this.add(btMenos);
        
    // ------------------------------------------------------------------------------------- // 
        
        btDividir = new JButton("/");
        btDividir.setFont(new Font("Arial", Font.BOLD, 35));
        btDividir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CalcularDivisao();
            }
        });
        this.add(btDividir);
        
    // ------------------------------------------------------------------------------------- //     
        
        btVezes = new JButton("X");
        btVezes.setFont(new Font("Arial", Font.BOLD, 27));
        btVezes.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CalcularMultiplicacao();
            }
        });
        this.add(btVezes);
        
    // ------------------------------------------------------------------------------------- // 
    
        labelResultado = new JLabel("Resultado", JTextField.CENTER);
        labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(labelResultado);
    
        textResultado = new JTextField();
        this.add(textResultado);
        
    // ------------------------------------------------------------------------------------- // 
      
    
        btLimpa = new JButton("LIMPA");
        btLimpa.setFont(new Font("Arial", Font.BOLD, 20));
        btLimpa.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent event) {
                textV1.setText("");
                textV2.setText("");
                textResultado.setText("");
            }
        });
        this.add(btLimpa);
    }
    
    public void CalcularSoma()
    {
        double val1, val2, resultado;
        val1 = Double.parseDouble(textV1.getText());
        val2 = Double.parseDouble(textV2.getText());
        resultado = (val1 + val2);
        textResultado.setText(String.format("%.2f", resultado));
    }

// ------------------------------------------------------------------------------------- //     
    
    public void CalcularSubtracao()
    {
        double val1, val2, resultado;
        val1 = Double.parseDouble(textV1.getText());
        val2 = Double.parseDouble(textV2.getText());
        resultado = (val1 - val2);
        textResultado.setText(String.format("%.2f", resultado));    
    }
    
 // ------------------------------------------------------------------------------------- //  
    
    public void CalcularDivisao()
    {
        double val1, val2, resultado;
        val1 = Double.parseDouble(textV1.getText());
        val2 = Double.parseDouble(textV2.getText());
        resultado = (val1 / val2);
        textResultado.setText(String.format("%.2f", resultado));
    }
    
// ------------------------------------------------------------------------------------- //    
    
    public void CalcularMultiplicacao()
    {
        double val1, val2, resultado;
        val1 = Double.parseDouble(textV1.getText());
        val2 = Double.parseDouble(textV2.getText());
        resultado = (val1 * val2);
        textResultado.setText(String.format("%.2f", resultado));
    }
}

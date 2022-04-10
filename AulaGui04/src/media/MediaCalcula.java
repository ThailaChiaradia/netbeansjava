package media;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MediaCalcula extends JPanel{
    
    private JTextField tv1, tv2, tresultado;
    private JLabel lv1, lv2, lresultado;
    private JButton bcalcular, blimpar;
    
    public MediaCalcula()
    {
        this.setLayout(new GridLayout(4, 2, 5, 5));
        
        lv1 = new JLabel("Valor 1");  // objeto para adescrição da caixa de V1  
        this.add(lv1);
        
        tv1 = new JTextField();  // objeto para a caixa de texto de V1
        this.add(tv1);
        
    // ------------------------------------------------------------------------------------- // 
        
        lv2 = new JLabel("Valor 2"); // objeto para adescrição da caixa de V1 
        this.add(lv2);  
        
        tv2 = new JTextField();  // objeto para a caixa de texto de V1
        this.add(tv2);
        
    // ------------------------------------------------------------------------------------- //     
    
        blimpar = new JButton("LIMPA");
        blimpar.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent event) {
                tv1.setText("");
                tv2.setText("");
                tresultado.setText("");
            }
        });
        this.add(blimpar);
        
    // ------------------------------------------------------------------------------------- //    
    
        bcalcular = new JButton("Calcular");
        bcalcular.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                CalculaMedia();
            }
        });        
        this.add(bcalcular);
        
    // ------------------------------------------------------------------------------------- //     
    
        lresultado = new JLabel("Resultado");
        this.add(lresultado);
        
        tresultado = new JTextField();
        this.add(tresultado);
    // ------------------------------------------------------------------------------------- // 
    }
    
    public void CalculaMedia()
    {
        double val1, val2, resultado;
        val1 = Double.parseDouble(tv1.getText());
        val2 = Double.parseDouble(tv2.getText());
        resultado = (val1 + val2)/2.0;
        tresultado.setText(String.format("%.2f", resultado));
    }
}

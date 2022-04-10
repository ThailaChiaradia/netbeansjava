package imc;

import java.util.Scanner;

public class ImcLeitura extends Imc{
    
    Scanner teclado;
    
    public ImcLeitura(double peso, double altura) {
        super(peso, altura);
        teclado = new Scanner(System.in);
    }
    
    public ImcLeitura()
    {
        super(49, 1.58);
        teclado = new Scanner(System.in);
    }
    
    public double lerDouble(String texto)
    {
        boolean continuarLeitura = true;
        double valor = 0;
        
        while(continuarLeitura)
        {
            System.out.print(texto);  
            
            try 
            {
                valor = Double.parseDouble(teclado.nextLine());
                continuarLeitura = false;
            } catch(NumberFormatException e)
              {
                  System.out.println("Entrada com valor invalido");
              }
        }
        
        return valor;
    }
    
    public void lerPeso()
    {
        this.setPeso(this.lerDouble("Digite o peso: "));
    }
    
    public void lerAltura()
    {
        this.setAltura(this.lerDouble("Digite a altura: "));
    }
}


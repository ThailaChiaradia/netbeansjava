package maisprat01;

import java.math.BigDecimal;

public class Maisprat01 
{

    public static void main(String[] args) 
    {

        BigDecimal valor1 = new BigDecimal(10);
        BigDecimal valor2 = new BigDecimal(10);
        
        if(valor1.equals(valor2))
        {
            System.out.println("Os números são iguais");
        }
        else
        {
            System.out.println("Os números são diferentes");
        }
            
    }
    
}

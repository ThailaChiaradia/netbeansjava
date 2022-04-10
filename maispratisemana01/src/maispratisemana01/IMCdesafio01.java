package maispratisemana01;

import java.util.Scanner;

public class IMCdesafio01 {
    
    public static void calculoimc(float peso, float altura)
    {
        int i = 0;
        
        double[] pesoimc = {18.9, 24.9, 29.9, 29.9, 39.9, 9000};
        String[] classificacaoimc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Severa"};
        
        float imc = peso/(altura*altura);
        System.out.println("\nO IMC é: " + imc);
        
       
        while(imc > pesoimc[i])
        {
            i++;
        }
        
        System.out.println("A classificação é: " + classificacaoimc[i]);

    }
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int continua = 1;
        
        while(continua == 1)
        {
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.print("Digite o peso: ");
            float peso = teclado.nextFloat();
        
            System.out.print("Difgite a altura em metros: ");
            float altura = teclado.nextFloat();
            
            calculoimc(peso, altura);
           
            System.out.println("\n------------------------------------------------------------------------------------------------");
            System.out.print("1 - Calcula mais um imc \n2 - Para o calculo \nResposta: ");
            
            continua = teclado.nextInt();
            
            while(continua != 2 && continua != 1)
            {
               System.out.println("Atenção número errado, digite novamente: ");
               continua = teclado.nextInt();
            }
                    
            
        }
        
    }
}

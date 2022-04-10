package maispratisemana01;

import java.util.Scanner;

public class IMCvetores 
{
    public static void calculoImc(float peso, float altura)
    {
        int i= 0;
        
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
        Scanner teclado  = new Scanner(System.in);
        System.out.print("Digite o peso: ");
        float peso = teclado.nextFloat();
        
        System.out.print("Digite a altura em metros: ");
        float altura = teclado.nextFloat();
        calculoImc(peso, altura);
    }
}

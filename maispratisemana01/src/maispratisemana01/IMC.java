package maispratisemana01;

import java.util.Scanner;

public class IMC {

    public static void main(String[] agrs)
    {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite o peso: ");
        float peso = teclado.nextFloat();
        
        System.out.print("Digite a altura em metros: ");
        float altura = teclado.nextFloat();
        
        float imc = peso/ (altura * altura);
        
        String classificacao = "";
        
        if(imc < 18.5){
            classificacao = "magreza";
        }
        else if(imc < 24.9)
        {
            classificacao = "normal";
        }
        else if(imc < 29.9)
        {
            classificacao = "sobrepeso";
        }
        else if(imc < 39.9)
        {   
            classificacao = "obesidade";
        }
        else
        {   
            classificacao = "obesidade grave";
        }
        
        System.out.println("\nO IMC é: "+ imc);
        
        System.out.println("A classificação é: " +classificacao);
        teclado.close();
    }
}

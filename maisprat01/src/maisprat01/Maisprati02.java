package maisprat01;

import java.util.Scanner;

public class Maisprati02 {
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("DIgite o primeiro número: ");
        int entrada1 = teclado.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int entrada2 = teclado.nextInt();
        
        System.out.println("O número um é: " + entrada1 + "\nO número dois é: "+ entrada2);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        System.out.println("\n--------------------\n");
       
        
        String[] nomes = {"João", "Maria", "José", "sla"};
        
        int i = 0;
        
        for(i = 0; i < nomes.length; i++)
        {
            System.out.println(i+1 + " " + nomes[i]);
        }
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n--------------------\n");
        
        
        int n = 5;
        int vet[] = new int[n];

        for(i = 0; i < n; i++)
        {
           System.out.printf("Informe o valor de vet[%1d]: ", i);
           vet[i] = teclado.nextInt();
        }
        
        
        teclado.close();
    }
}

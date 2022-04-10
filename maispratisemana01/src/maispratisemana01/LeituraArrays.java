package maispratisemana01;

import java.util.Scanner;

public class LeituraArrays {
    public static void main(String[] args)
    {   
        int i;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número de posições do vetor: ");
        int posicao = teclado.nextInt();
        
        int[] vet = new int[posicao];
        
        for(i = 0; i < vet.length; i++)
        {
            System.out.printf("Digite o número de vet[%1d]: ", i);
            vet[i] = teclado.nextInt();
        }
        
        System.out.println("\n---------------------------------------------------------------------------------------");
        
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Listar em ordem");
        System.out.println("2 - Listar invertido");
        System.out.println("3 - Exibir apenas números menores que 5");
        System.out.println("4 - Exibir até o primeiro número menor que 5");
        System.out.print("RESPOSTA: ");
        int resposta = teclado.nextInt();
        
        switch(resposta)
        {
            case 1:
                for(i = 0; i < vet.length; i++)
                {
                    if (i > 0) 
                    {
                        if (vet[i] < vet[i-1]) 
                        {
                            continue;
                        }
                    }
                    System.out.println(vet[i]);
                }
                
                break;
        ///////////////////////////////////////////////////        
            case 2:
                for(i = vet.length - 1; i>=0; i--)
                {
                    System.out.println(vet[i]);
                }
                break;
        ///////////////////////////////////////////////////        
            case 3: 
                for(i = 0; i < vet.length; i++)
                {
                    if(vet[i] >= 5)
                    {
                        continue; // volta pro inicio do for
                    }
                    System.out.println(vet[i]);
                }
                break;
        ///////////////////////////////////////////////////        
            case 4:
                for(i = 0; i < vet.length; i++)
                {
                    if(vet[i] >=5)
                    {
                        break;
                    }
                    System.out.println(vet[i]);
                }
                break;
        ///////////////////////////////////////////////////    
            default:
                System.out.println("O comando é inválido");
        }            
    }
        
}

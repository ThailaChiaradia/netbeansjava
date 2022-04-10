// Aluna: Rafaela Flôres Jardim
// Crie um programa que leia dois números e imprima o menor.

package javaapplication13;

import java.util.Scanner;
public class JavaApplication13 {
    public static void main(String args[]) {
        Scanner recebe = new Scanner(System.in);
        int x, y, num_menor;
        System.out.println("Digite dois números inteiros: ");
        x = recebe.nextInt();
        y = recebe.nextInt();
        num_menor = x;
            if (y < x)
            {
                num_menor = y;
            }
        System.out.printf("O MENOR número é %d", num_menor);
    }
}


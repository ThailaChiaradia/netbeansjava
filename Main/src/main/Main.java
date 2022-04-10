package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int dia = entrada.nextInt();

        if (dia>7 || dia<1) {
            System.out.println("O número digitado precisa ser maior que 1 e menor que 7.");
        }

        switch (dia) {
            case 1:
                System.out.println("O número digitado corresponde à Domingo: " + dia + " = Domingo.");
                break;
            case 2:
                System.out.println("O número digitado corresponde à Segunda-Feira: " + dia + " = Segunda-Feira.");
                break;
            case 3:
                System.out.println("O número digitado corresponde à Terça-Feira: " + dia + " = Terça-Feira.");
                break;
            case 4:
                System.out.println("O número digitado corresponde à Quarta-Feira: " + dia + " = Quarta-Feira.");
                break;
            case 5:
                System.out.println("O número digitado corresponde à Quinta-Feira: " + dia + " = Quinta-Feira.");
                break;
            case 6:
                System.out.println("O número digitado corresponde à Sexta-Feira: " + dia + " = Sexta-Feira.");
                break;
            case 7:
                System.out.println("O número digitado corresponde à Sábado: " + dia + " = Sábado.");
                break;
        }

    }
}
package semana.pkg4.jogo;

import java.util.Scanner;

public class Semana4Jogo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); // criar teclado
        
        Cenario mapa = new Cenario();
        
        boolean continuarPartida = true;        
        String entrada;

        while(continuarPartida)
        {
            System.out.println("Digite as posições x e y no formato X,Y: ");
            entrada = teclado.nextLine();
            
            String[] numeros = entrada.split(",");
            int x = Integer.parseInt(numeros[0]);
            int y = Integer.parseInt(numeros[1]);
            System.out.println("X: " + x + "\nY: " + y);
            
            if(entrada.equals("FIM")) break;
            
            continuarPartida = mapa.disparo(x,y);
            mapa.desenhaCenario();
            
        }
        
        
    }
}

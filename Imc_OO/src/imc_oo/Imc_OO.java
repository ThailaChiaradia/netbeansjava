package imc_oo;

import imc.Imc;
import imc.ImcLeitura;
import imc.ImcNovo;

public class Imc_OO {

    public static void main(String[] args) {
        
        Imc imc1 = new Imc(87,1.85);
        System.out.println("A classificação do imc é: " + imc1.classificacao());
        
        ImcNovo imc2 = new ImcNovo(87,1.85);
        System.out.println("A classificação do imc é: " + imc2.classificacao());
        
        ImcLeitura imc3 = new ImcLeitura();
        imc3.lerPeso();
        imc3.lerAltura();
        System.out.println("A classificação do imc é: " + imc3.classificacao());
        
        
    }
}

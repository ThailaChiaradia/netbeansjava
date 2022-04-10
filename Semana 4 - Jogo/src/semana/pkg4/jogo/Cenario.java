package semana.pkg4.jogo;

public class Cenario {
    
    int i;
    int[][] mapa;    
    String[] desenhos;    
    Pecas[] inimigos;
    int pecasRestantes;
    int tirosRestantes;
    
    
    public Cenario(){
        this.pecasRestantes = 5;
        this.tirosRestantes = 25;
        this.mapa = new int[10][10];    
        this.desenhos = new String[] {".", "x", "*"};
        this.inimigos = new Pecas[this.pecasRestantes];
        
        for(i = 0; i < this.pecasRestantes; i++)
        {
            this.inimigos[i] = new Pecas();
        }
    }

    
    public void desenhaLinha(int[] linha)
    {
        String strLinha = "";
        
        for(int celula: linha)
        {
            strLinha += this.desenhos[celula] + "  ";
        }
        System.out.println(strLinha);
    }
    
    public void desenhaCenario()
    {
        for(int[] linha: this.mapa)
        {
            this.desenhaLinha(linha);
        }
        System.out.println("Peças Restantes: "+ this.pecasRestantes);
        System.out.println("Tiros Restantes: "+ this.tirosRestantes);
        System.out.println("-----------------------------------------");
    }
    
    
    public boolean disparo(int x, int y)
    {   
        this.tirosRestantes --;
        double distancia = 100;
        double d1 = 0;
        
        for(Pecas p: inimigos)
        {
            if(p.isVivo())
            {
                d1 = p.disparo(x,y);
                if(d1 == 0)
                {
                    this.pecasRestantes --;
                }
                distancia = (d1 < distancia)?d1:distancia; 
                // se d1 for menor que a distancia, d1 = distancia
            } 
        }
        System.out.println("========================");
        System.out.println("Distancia: " + distancia);
        System.out.println("========================");
              
        this.mapa[y][x] = (distancia>0)?1:2;
        //se distancia > 0 é 1, se não é 2
        
        return((this.pecasRestantes > 0) && (this.tirosRestantes > 0));
    }
}
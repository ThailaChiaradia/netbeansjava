package ultraemojicombat;
import java.util.Random;

public class Luta {
    
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2)
    {   //equals é tipo == para string de classe
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)
        {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else
        {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar()
    {
        if(this.aprovada == true)
        {
            System.out.println("\n==================== DESAFIADO ======================");
            this.desafiado.apresentar();
            System.out.println("\n==================== DESAFIANTE =====================");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // resultados 0, 1 ou 2
            
            switch(vencedor)
            {
                case 0: // empatar
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("\n\n +++++++++++++++ RESULTADO +++++++++++++++++");
                    System.out.println("Empatou!");
                    break;
                
                case 1: //Desafiado ganhou
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("\n\n +++++++++++++++ RESULTADO +++++++++++++++++");
                    System.out.println("O vencedor é: " + this.desafiado.getNome());
                    break;
                
                case 2: //Desafiante ganhou
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("\n\n +++++++++++++++ RESULTADO +++++++++++++++++");
                    System.out.println("O vencedor é: " + this.desafiante.getNome());
                    break;
                    
            }
        }
        else
        {
            System.out.println("\nA luta não pode acontecer!!");
        }
    }
    
    //Métodos especiais

    public Lutador getDesafiado() 
    {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) 
    {
        this.desafiado = desafiado;
    }
    

    public Lutador getDesafiante() 
    {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) 
    {
        this.desafiante = desafiante;
    }

    
    public int getRounds() 
    {
        return rounds;
    }

    public void setRounds(int rounds) 
    {
        this.rounds = rounds;
    }
    

    public boolean isAprovada() 
    {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) 
    {
        this.aprovada = aprovada;
    }
    
}

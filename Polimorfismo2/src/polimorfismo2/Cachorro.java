package polimorfismo2;
public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom()
    {
    System.out.println("AU AU AU");
    }
    
    public void reagir(String frase)
    {
        if(frase.equals("Oiii") || frase.equals("cheguei"))
        {
           System.out.println("Abanando o rabo");
        }
        else 
        { 
            System.out.println("Rosnar");
        }
        
    }
    
    public void reagir(int hora, int min)
    {
        if(hora <12)
        {
            System.out.println("Abanando rabo");
        }
        else if (hora >= 18)
        {
            System.out.println("Ignorando você");
        }
        else
        {
            System.out.println("Abanando o rabo e latindo");
        }
        
    }
    
    public void reagir(boolean dono)
    {
        if(dono == true)
        {
            System.out.println("Abanando o rabo e laindo");
        }
        else
        {
            System.out.println("Rosnando");
        }
        
    }
    
    public void reagir(int idade, float peso)
    {
        if(idade < 5)
        {
            if (peso<10)
            {
                System.out.println("Abanar o rabo");
            }
            else
            {
                System.out.println("Latir");
            }
        }
        else
        {
            if(peso<10)
            {
                System.out.println("Rosnar");
            }
            else
            {
                System.out.println("Ignorar");
            }
        }
            
    }
        
}

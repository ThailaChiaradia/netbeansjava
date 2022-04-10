package polimorfismo;
public class Mamifero extends Animal{

    private String corPelo;
    
    @Override
    public void locomover() 
    {
        System.out.println("Correndo");
    }

    @Override
    public void aliementar() 
    {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de mamifero");
    }

    
    //getters e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}

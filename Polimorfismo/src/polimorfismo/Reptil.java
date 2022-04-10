package polimorfismo;
public class Reptil extends Animal{

    private String corEscama;
    
    @Override
    public void locomover() 
    {
        System.out.println("andando");
    }

    @Override
    public void aliementar() 
    {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de reptil");
    }

    
    //getters e setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}

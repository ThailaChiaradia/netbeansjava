package polimorfismo;
public class Cachorro extends Mamifero{
    
    @Override 
    public void emitirSom()
    {
        System.out.println("AU AU AU");
    }
    
    public void enterrarOssos()
    {
        System.out.println("Enterrando um osso");
    }
}

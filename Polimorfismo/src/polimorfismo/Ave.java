package polimorfismo;
public class Ave extends Animal{

    //Atributos
    private String corPena;
    
    //Metodos sobrepostos de Animal
    @Override
    public void locomover() 
    {
        System.out.println("Voando");
    }

    @Override
    public void aliementar() 
    {
        System.out.println("COmendo Frutas");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Piando");
    }
    
    //metodos da classe Ave
    public void fazerNinho()
    {
        System.out.println("Construindo um ninho");
    }
    
}

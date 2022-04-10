package polimorfismo;
public class Peixe extends Animal {
    
    // atributos
    private String corEscama;

    // metodos sobrepostos da classe animal
    @Override
    public void locomover() 
    {
        System.out.println("Nadando");
    }

    @Override
    public void aliementar() 
    {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("peixe não faz som");
    }
    
    // metodos da classe peixe
    public void soltarBolha()
    {
        System.out.println("Soltando uma bolha");
    }

    
    //getters e setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
    
}

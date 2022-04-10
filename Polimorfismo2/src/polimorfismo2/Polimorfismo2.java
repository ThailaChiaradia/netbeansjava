package polimorfismo2;
public class Polimorfismo2 {
    public static void main(String[] args) {
        
        Mamifero x = new Mamifero();
        
        Lobo l= new Lobo();
        Cachorro c = new Cachorro();
        

        c.emitirSom();
        c.reagir("cheguei");
        c.reagir(true);
        c.reagir(false);
        c.reagir(12, 7);
        c.reagir(16, 59);
        
        
       
    }
    
}

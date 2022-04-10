// classes Aula12 
package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();
        
        m1.locomover();
        r1.locomover();
        p1.locomover();
        a1.locomover();
        
        System.out.println("\n===================");
        
        canguru.locomover();
        cachorro.locomover();
        cachorro.emitirSom();
        cobra.locomover();
        tartaruga.locomover();
        goldfish.locomover();
        arara.locomover();
        
        
        
        
    }
}

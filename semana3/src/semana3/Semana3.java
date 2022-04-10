package semana3;

public class Semana3 {
    public static void main(String[] args) {

    Objetos.setValor2(300);
    
    Objetos obj1 = new Objetos(10);
    obj1.setValor1(20);
    System.out.println("Valores são \nValor 1: " + obj1.getValor1() + " \nValor 2: " + obj1.calcula());
        
      
    
    Objetos obj2 = new Objetos(11);
    obj2.setValor1(21);
    System.out.println("\nValores são \nValor 1: " + obj2.getValor1() + " \nValor 2: " + obj2.calcula());


    
    Objetos.setValor2(30);
    System.out.println("\n--------------------------------------");
    System.out.println("\nValores são \nValor 1: " + obj1.getValor1() + " \nValor 2: " + obj1.calcula());
    System.out.println("\nValores são \nValor 1: " + obj2.getValor1() + " \nValor 2: " + obj2.calcula());

    
    System.out.println("\nEste objeto é: " + obj1);
    System.out.println("Este objeto é: " + obj2);
    
    }
}

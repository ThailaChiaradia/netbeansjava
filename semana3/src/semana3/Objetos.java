package semana3;

public class Objetos {
    
    int valor1;
    static int valor2;

    public Objetos(int valor1) {
        this.valor1 = valor1;
    }

    
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    
    public static int getValor2() {
        return valor2;
    }

    public static void setValor2(int valor2) {
        Objetos.valor2 = valor2;
    }

    public int calcula()
    {
        return valor1 * Objetos.valor2;
    }
    
    
    public String toString()
    {
        return "o valor 1 é " + this.valor1 + " e o valor esatico valor2 é: " + Objetos.valor2;
    }
}

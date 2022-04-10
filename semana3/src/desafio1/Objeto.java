package desafio1;

public class Objeto {
    
    protected int v1;
    protected int v2;

    public Objeto(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
    
    public String toString()
    {
        return "(" + this.v1 + ", " + this.v2 + ")";
    }
        
    public void exibe()
    {
        System.out.println(this);
    }
            
}


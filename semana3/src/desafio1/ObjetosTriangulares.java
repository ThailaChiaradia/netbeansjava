package desafio1;

public class ObjetosTriangulares extends Objeto{
    
    public int v3;

    public ObjetosTriangulares(int v3, int v1, int v2) {
        super(v1, v2);
        this.v3 = v3;
    }
    
    public String toString()
    {
        return "(" + this.v3 + ", " + this.v1 + ", " + this.v2 + ")";
    }
    

}

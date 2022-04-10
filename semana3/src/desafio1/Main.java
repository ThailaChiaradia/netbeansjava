package desafio1;

public class Main {
    public static void main(String[] args)
    {
        
        Objeto[] arrayObjeto = new Objeto[4];
        arrayObjeto[0] = new ObjetosTriangulares(10, 20, 30);
        arrayObjeto[1] = new Objeto(40, 50);
        arrayObjeto[2] = new ObjetosTriangulares(60, 70, 80);
        arrayObjeto[3] = new Objeto(90, 100);

        
        for(Objeto elemento: arrayObjeto)
        {
           elemento.exibe();
            
        }
        
        
        
    }
}
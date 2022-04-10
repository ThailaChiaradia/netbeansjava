package maispratisemana01;

import java.util.Scanner;

public class TestesSimulado {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int x = 0, a = 0, b = 0;
          
        x = a + b + 1; //1
        x++; //2
        x+= x; //4
        a = x; //4
        x = a + b; //4
        
        System.out.println("x: "+ x);
        
        ///////////////////////////////////////////////////////////////////////////////////////////
        String c;
        c = teclado.next(); 
        
        if ("x".equals(c)) 
        {
            if ("y".equals(c)) 
            {
                System.out.println(1);
            }
            else if ("z".equals(c)) 
            {
                System.out.println(1);
            }
        } 
        else
        {
            System.out.println(1);
        }
        
        ///////////////////////////////////////////////
        
        int l = 0;
        int m = 1;
    }
    
    public static boolean f(int l,int m)
    {   
        
        
        if (l==0) return true;
        if (m==1) return false;
        return (l>m);

    }
}

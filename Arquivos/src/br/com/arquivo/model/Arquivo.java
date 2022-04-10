package br.com.arquivo.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arquivo {
    //arquivos de entrada
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    
    //arquivos de saida
    private OutputStream os;
    private OutputStreamWriter osw;
    private BufferedWriter bw;
    
    private String linha;
    
    private ArrayList<String> nomes_usuario;
    private ArrayList<Integer> idades;
    private ArrayList<String> sexos;
    private ArrayList<String> cargos;
    
    // método construtor
    public Arquivo()
    {
        nomes_usuario = new ArrayList<String>();
        idades = new ArrayList<Integer>();
        sexos = new ArrayList<String>();
        cargos = new ArrayList<String>();
        
        try 
        {
            is = new FileInputStream("cadastro_usuarios.txt");//informando o endereço do arquivo, onde ele está            
            isr = new InputStreamReader(is);//preparando para ler o arquivo
            br = new BufferedReader(isr);//começa a ler linha por linha
            try 
            {
                linha = br.readLine();
                linha = br.readLine();
                int cont = 0;
                char c;
                String valor;
                while(linha != null)
                {
                    //System.out.println(linha);
                    valor = "";
                    for(int i=0; i<linha.length(); i++)
                    {
                        c = linha.charAt(i);
                        
                        if(c != ',')
                        {
                            valor += c;
                        }
                        else if(c == ',' && cont == 0)
                        {
                            nomes_usuario.add(valor);
                            valor = "";
                            cont++;
                        }
                        else if(c == ',' && cont == 1)
                        {
                            idades.add(Integer.parseInt(valor));
                            valor = "";
                            cont++;
                        }
                        else if(c == ',' && cont == 2)
                        {
                            sexos.add(valor);
                            valor = "";
                            cont ++;
                        }
                        else if(c == ',' && cont == 3)
                        {
                            cargos.add(valor);
                            valor = "";
                            cont = 0;
                            i = linha.length();
                        }
                    } 
                    
                    linha = br.readLine();
                
            }
                
            for(int i = 0; i<nomes_usuario.size(); i++)
            
            
            System.out.println(nomes_usuario.get(i));

            br.close();
            isr.close();
            is.close();

            /*
            os = new FileOutputStream("cadastro_usuarios.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("\nConsegui escrever uma linha!");

            bw.close();
            osw.close();
            os.close();
            */
            
            catch (IOException ex) 
            {
                System.out.println("Não consegui ler a linha!");
            }
        
        } 
        catch (FileNotFoundException ex) 
        {
            try 
            {
                os = new FileOutputStream("cadastro_usuarios.txt", true);
                osw = new OutputStreamWriter(os);
                bw = new BufferedWriter(osw);
                
                try 
                {
                    bw.write("---------- Nome de usuários ----------");
                    bw.newLine();
                    
                    bw.close();
                    osw.close();
                    os.close();
                } 
                catch (IOException ex1) 
                {
                    System.out.println("Não consegui escrever!");
                }
            } 
            catch (FileNotFoundException ex1) 
            {
                System.out.println("Não consegui criar o arquivo!");
            }
            
        }
      
          
    };
    
    
    public static void main(String[] args)
    {
        Arquivo a = new Arquivo();
    } 
    
}
    
    


package com.LinkCorp.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
	
	private String file;
	
	public Save(){
		
		file = "rankN.txt";
	
	}
	
	public void saveInfo(int pontos, boolean delet){
        String info =  pontos + "\n";
        
        if(delet) {
        	
        	try{
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write(info);
                bw.close();
            }
            catch (IOException e2){
                System.out.println("Erro ao tentar gravar dados no arquivo \"" + file + "\": " + e2.getMessage());
            }
        	
        }
        else{
	        
	        try{
	            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
	            bw.write(info);
	            bw.close();
	            
	        }
	        catch (IOException e){
	            try{
	                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	                bw.write(info);
	                bw.close();
	            }
	            catch (IOException e2){
	                System.out.println("Erro ao tentar gravar dados no arquivo \"" + file + "\": " + e2.getMessage());
	            }
	        }
        }
    }
    
    public int readInfo()
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String curLine = br.readLine();
            
            br.close();
            return Integer.parseInt(curLine);
        }
        catch (IOException e){
            System.out.println("Erro ao tentar ler dados do arquivo \"" + file + "\": " + e.getMessage());
        }
        
        return -1;
    }  
}

package com.LinkCorp.menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.LinkCorp.main.Game;

public class Jogar {

	public static BufferedImage menuI = Game.menuImage.getSprite(0, 0, 410, 220); 
	
	public static boolean select = false;
	
	public String[] options  = {"Normal","Forever","PvP","Voltar"};
	
	public int currentOption = 0;
	public int maxOption = options.length - 1;
	
	public boolean up, down;
	
	public Jogar() {
	
	}
	
	//realiza as funções de jogar
	public void tick() {
		
		//muda para a opção a cima
		if(up) {
			up = false;
			currentOption--;
			if(currentOption < 0) {
				currentOption = maxOption;
			}
		
		// muda para a opção a baixo
		}if(down) {
			down = false;
			currentOption++;
			if(currentOption > maxOption ) {
				currentOption = 0;
			}
		}
		
		//muda o  estado do jogo de acordo com a seleção
		if(select){	
			if(options[currentOption] == "Normal" ) {
				Game.gameState = "NORMAL";
				select = false;
			}
			else if(options[currentOption] == "Forever" ) {
				Game.gameState = "FOREVER";
				select = false;
			}
			else if(options[currentOption] == "PvP" ) {
				Game.gameState = "PvP";
				select = false;
			}
			else if(options[currentOption] == "Voltar") {
				Game.gameState = "MENU";
				select = false;
			}
		}
	}
	
	public void render(Graphics g) {
		
		//reseta os graficos
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE);
		
		g.drawImage(menuI, 0,0,Game.WIDTH, Game.HEIGHT, null);
		
		//define a fonte e a cor
		g.setFont(new Font("arial", Font.CENTER_BASELINE, 15));
		g.setColor(Color.WHITE);
		
		//escreve as opções
		g.drawString("Solo", Game.WIDTH/2 - 17, 140);
		g.drawString("Infinito", Game.WIDTH/2 - 25, 160);
		g.drawString("PvP", Game.WIDTH/2 - 15, 180);
		g.drawString("Voltar", Game.WIDTH/2 - 22, 200);
		
		int sizeW = 60, sizeH = 20;
		
		//gera um retangulo preto de baixa opacidade por cima da opção
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color (0,0,0,200));
		
		if(options[currentOption] == "Normal") {
			g.fillRect(Game.WIDTH/2 - 30, 125 , sizeW, sizeH);
		}
		if(options[currentOption] == "Forever") {
			g.fillRect(Game.WIDTH/2 - 30, 145, sizeW, sizeH);
		}
		if(options[currentOption] == "PvP") {
			g.fillRect( Game.WIDTH/2 - 30, 165, sizeW, sizeH);
		}
		if(options[currentOption] == "Voltar") {
			g.fillRect( Game.WIDTH/2 - 30, 185, sizeW, sizeH);
		}
	}
}



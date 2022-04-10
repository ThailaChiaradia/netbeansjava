package com.LinkCorp.menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import com.LinkCorp.main.Game;

public class GameOver {
	
	public static boolean select = false;
	
	public String[] options  = {"Voltar","Rank"};
	
	public int currentOption = 0;
	public int maxOption = options.length - 1;
	
	public boolean save = true;
	
	public boolean up, down;
	
	public char exState;
	
	public GameOver() {
		
	}
	
	//realiza as funções do menu
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
				if(options[currentOption] == "Voltar" ) {
					Game.gameState = "MENU";
					select = false;
				}
				else if(options[currentOption] == "Rank" ) {
					Game.gameState = "RANK";
					select = false;
				}
			}
			
			if(this.exState == 'N') {
				if(this.save) {
					if(Game.points.pPoint > Game.save.readInfo()) {
						Game.save.saveInfo(Game.points.pPoint,true);
					}	
					this.save = false;
				}
			}

			
			if(this.exState == 'F') {
				if(this.save) {
					if(Game.points.pPoint > Game.save2.readInfo()) {
						Game.save2.saveInfo(Game.points.pPoint,true);
					}	
					this.save = false;
				}
			}
		}
	
	public void render(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE);
		
		//define a fonte e a cor
		g.setFont(new Font("arial", Font.CENTER_BASELINE, 15));
		g.setColor(Color.WHITE);
		
		//escreve as opções
		g.drawString("Voltar", Game.WIDTH/2 - 20, 140);
		g.drawString("Rank", Game.WIDTH/2 - 18, 180);
		
		int sizeW = 60, sizeH = 20;
		
		//gera um retangulo preto de baixa opacidade por cima da opção
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color (0,0,0,200));
		
		if(options[currentOption] == "Voltar") {
			g.fillRect(Game.WIDTH/2 - 30, 125 , sizeW, sizeH);
		}
		if(options[currentOption] == "Rank") {
			g.fillRect( Game.WIDTH/2 - 30, 165, sizeW, sizeH);
		}
		
		
		//configurações expecificas
		
		//define a fonte e a cor
		g.setFont(new Font("arial", Font.CENTER_BASELINE, 20));
		g.setColor(Color.WHITE);
		
		if(this.exState == 'N') {
			g.drawString("Pontuação: "+Game.points.pPoint, Game.WIDTH/3 + 10, 50);
		}
		if(this.exState == 'F') {
			g.drawString("Pontuação: "+Game.points.pPoint, Game.WIDTH/3 + 10, 50);
		}
		if(this.exState == 'P') {
			g.drawString("Pontuação1: "+Game.points.pPoint, Game.WIDTH/3 + 10, 50);
			g.drawString("Pontuação2: "+Game.points.p2Point, Game.WIDTH/3 + 10, 75);
		}
	}
}

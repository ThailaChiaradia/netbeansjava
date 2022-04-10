package com.LinkCorp.entities;

import java.awt.Color;
import java.awt.Graphics;

import com.LinkCorp.main.Game;

public class Enemy {
	
	public double x,y;
	public int sizeW, sizeH;
	
	public Enemy(int x, int y) {
		
		//localização do inimigo
		this.x = x;
		this.y = y;
		
		//tamanho do inimigo
		this.sizeW = 13;
		this.sizeH = 60;
	}
	
	//funções do inimigo
	public void tick() {
		
		//IA do inimigo: ele busca ficar sempre centralizado com o eixo y da bola
		if(Game.gameState == "NORMAL") {
			y += ((Game.ball.y - y) - this.sizeH/2) * 0.05;
		}
		if(Game.gameState == "FOREVER") {
			y += ((Game.ball.y - y) - this.sizeH/2);
		}
		
		
		
		//impede o inimigo de sair da tela
		if(y+sizeH > Game.HEIGHT) {
			y = Game.HEIGHT - sizeH;
		}
		else if(y < 0){
			y = 0;
		}
		
	}
	
	
	//renderiza o inimigo
	public void render(Graphics g) {
		//gera o retangulo laranja referente ao inimigo
		if(Game.gameState == "NORMAL") {
			g.setColor(new Color(255,150,10));
		}
		if(Game.gameState == "FOREVER") {
			g.setColor(new Color(255,10,150));
		}
		
		
		g.fillRect((int)x, (int)y, sizeW, sizeH);
	}
}

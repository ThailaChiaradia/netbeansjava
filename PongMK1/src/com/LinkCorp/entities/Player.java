package com.LinkCorp.entities;

import java.awt.Color;
import java.awt.Graphics;

import com.LinkCorp.main.Game;

public class Player {
	
	public boolean up, down;
	
	public int x, y;
	public int sizeW, sizeH;
	
	public Player(int x, int y){
		
		//localizaçã do jogador
		this.x = x;
		this.y = y;
		
		//tamanho do jogador
		this.sizeW = 13;
		this.sizeH = 60;
	}
	
	//funções do jogador
	public void tick() {
		//movimentação com base nas teclas
		if(up) {
			y-=2;
		}
		else if(down) {
			y+=2;
		}
		
		//impete que o jogador saia da tela
		if(y+sizeH > Game.HEIGHT) {
			y = Game.HEIGHT - sizeH;
		}
		else if(y < 0){
			y = 0;
		}
		
	}
	
	//renderiza o jogador
	public void render(Graphics g) {
		//gera o retangulo azul referente ao player
		
		if(Game.gameState == "NORMAL") {
			g.setColor(new Color(10,150,255));
		}
		if(Game.gameState == "FOREVER") {
			g.setColor(new Color(150,10,255));
		}
		if(Game.gameState == "PvP") {
			g.setColor(new Color(150,250,10));
		}
		
		
		g.fillRect(x, y, sizeW, sizeH);
		
	}
	
	
	
}

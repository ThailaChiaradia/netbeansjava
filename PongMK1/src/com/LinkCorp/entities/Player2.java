package com.LinkCorp.entities;

import java.awt.Color;
import java.awt.Graphics;

import com.LinkCorp.main.Game;

public class Player2 {
public boolean up, down;
	
	public int x, y;
	public int sizeW, sizeH;
	
	public Player2(int x, int y){
		
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
		g.setColor(new Color(10,255,150));
		g.fillRect(x, y, sizeW, sizeH);
		
	}
	
	
	
}

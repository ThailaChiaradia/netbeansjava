package com.LinkCorp.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.LinkCorp.main.Game;

public class Ball {
	
	public double x,y;
	public int sizeW, sizeH;
	
	public double dx,dy;
	public double speed = 2;
	
	public int hit = 0;
	
	public Ball(int x, int y) {
		
		//posição da bola
		this.x = x;
		this.y = y;
		
		//tamanho da bola
		this.sizeW = 9;
		this.sizeH = 9;
		
		//direção em que a bola vai, gera valores aleatórios que definem para onde a bola irá
		int angle = new Random().nextInt(240 - 120) + 120 + 1;
		this.dx = Math.cos(Math.toRadians(angle));
		this.dy = Math.sin(Math.toRadians(angle));
	}
	
	public void tick() {
		
		//impede a bola de atravessar o limites horizontais da tela
		//e rebate ela invertendo a direção de y
		if(y+(dy*speed) + sizeH >= Game.HEIGHT) {
			dy*=-1;
		}else if(y+(dy*speed) <= 0) {
			dy*=-1;
		}
		
		//sistema de pontos
		if(x >= Game.WIDTH) {
			//ponto do inimigo
		}
		else if(x <= 0) {
			//ponto do jogador
		}
		
		//sistema simplificado de colisões ultilizando uma classe nativa do java "Rectangle"
		//HitBox da bola
		Rectangle bounds = new Rectangle((int)(x+(dx*speed)),(int)(y+(dy*speed)),sizeW,sizeH);
		
		//HitBox do player e do inimigo
		Rectangle boundsPlayer = new Rectangle(Game.player.x,Game.player.y,Game.player.sizeW,Game.player.sizeH);
		Rectangle boundsPlayer2 = new Rectangle(Game.player2.x,Game.player2.y,Game.player2.sizeW,Game.player2.sizeH);
		Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x,(int)Game.enemy.y,Game.enemy.sizeW,Game.enemy.sizeH);
		
		
		//faz a bola  ser rebatida pelo jogador ou pelo inimigo, aleatoizando a direção da bola
		//e garantindo que a mesma vá na direção oposta
		if(bounds.intersects(boundsPlayer)) {
			int angle = new Random().nextInt(240 - 120) + 120 + 1;
			this.dx = Math.cos(Math.toRadians(angle));
			this.dy = Math.sin(Math.toRadians(angle));
			if(dx < 0) 
				dx*=-1;
			hit++;
			if(Game.gameState == "FOREVER") {
				Game.points.pPoint++;
			}
		}
		else if(bounds.intersects(boundsEnemy)) {
			int angle = new Random().nextInt(240 - 120) + 120 + 1;
			this.dx = Math.cos(Math.toRadians(angle));
			this.dy = Math.sin(Math.toRadians(angle));
			if(dx > 0)
				dx*=-1;
		}
		else if(bounds.intersects(boundsPlayer2)) {
			int angle = new Random().nextInt(240 - 120) + 120 + 1;
			this.dx = Math.cos(Math.toRadians(angle));
			this.dy = Math.sin(Math.toRadians(angle));
			if(dx > 0)
				dx*=-1;
		}
		
		if(Game.gameState == "NORMAL") {
			if(hit >= 3) {
				hit=0;
				this.speed+=0.5;
			}
		}
		
		if(Game.gameState == "FOREVER") {
			if(hit >= 3) {
				hit=0;
				this.speed+=0.25;
			}
		}
		if(Game.gameState == "PvP") {
			if(hit >= 3) {
				hit=0;
				this.speed+=0.5;
			}
		}
		
		//faz a bola se mover
		x+=dx*speed;
		y+=dy*speed;
	}
	
	//renderiza a bola
	public void render(Graphics g) {
		
		//gera a esfera branca referente a bola
		g.setColor(new Color(255,255,255));
		g.fillOval((int)x, (int)y, sizeW, sizeH);
	}

}

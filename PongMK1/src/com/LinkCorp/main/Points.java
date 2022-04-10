package com.LinkCorp.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Points {
	
	public int giveBack = 0;
	public int ePoint = 0;
	public int pPoint = 0;
	public int p2Point = 0;
	
	public Points() {
		
	}
	
	public void tick() {
		
		if(Game.gameState == "NORMAL") {
			
			if(Game.ball.x <= 0) {
				//ponto do inimigo
				ePoint++;
			}
			else if(Game.ball.x >= Game.WIDTH) {
				//ponto do player
				pPoint++;
			
			}
			if(Game.ball.x <= 0 || Game.ball.x >= Game.WIDTH) {
				
				Game.ball.speed = 2;
				Game.ball.x = Game.WIDTH/2 -3;
				Game.ball.y = Game.HEIGHT/2 -3;
				
				int angle = new Random().nextInt(240 - 120) + 120 + 1;
				Game.ball.dx = Math.cos(Math.toRadians(angle));
				Game.ball.dy = Math.sin(Math.toRadians(angle));
			}
		}
		else if(Game.gameState == "FOREVER") {
			
			if(Game.ball.x <= 0) {
				//ponto do inimigo
				ePoint++;
				Game.ball.speed = 2;
				Game.ball.x = Game.WIDTH/2 -3;
				Game.ball.y = Game.HEIGHT/2 -3;
			}
			else{
				//ponto do player
				
			}
		}
		if(Game.gameState == "PvP") {
			
			if(Game.ball.x <= 0) {
				//ponto do inimigo
				p2Point++;
			}
			else if(Game.ball.x >= Game.WIDTH) {
				//ponto do player
				pPoint++;
			
			}
			if(Game.ball.x <= 0 || Game.ball.x >= Game.WIDTH) {
				
				Game.ball.speed = 2;
				Game.ball.x = Game.WIDTH/2 -3;
				Game.ball.y = Game.HEIGHT/2 -3;
				
				int angle = new Random().nextInt(240 - 120) + 120 + 1;
				Game.ball.dx = Math.cos(Math.toRadians(angle));
				Game.ball.dy = Math.sin(Math.toRadians(angle));
			}
		}
	}
	
	public void render(Graphics g) {
		
		if(Game.gameState == "NORMAL") {
			
			g.setFont(new Font("arial", Font.CENTER_BASELINE, 25));
			g.setColor(new Color(220,220,220));
			
			g.drawString(""+(int)(ePoint), Game.WIDTH/2 + 19, Game.HEIGHT/2);
			g.drawString(""+(int)(pPoint), Game.WIDTH/2 - 25 - 7, Game.HEIGHT/2);
			
		}	
		
		if(Game.gameState == "FOREVER") {
			
			g.setFont(new Font("arial", Font.CENTER_BASELINE, 25));
			g.setColor(new Color(220,220,220));
			
			g.drawString(""+(int)(pPoint), Game.WIDTH/2/2, Game.HEIGHT/2);
			
		}
		if(Game.gameState == "PvP") {
			
			g.setFont(new Font("arial", Font.CENTER_BASELINE, 25));
			g.setColor(new Color(220,220,220));
			
			g.drawString(""+(int)(p2Point), Game.WIDTH/2 + 19, Game.HEIGHT/2);
			g.drawString(""+(int)(pPoint), Game.WIDTH/2 - 25 - 7, Game.HEIGHT/2);
		}
	}
}

package com.LinkCorp.menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import com.LinkCorp.main.Game;

public class Tutorial {
	
	public static boolean select = false;
	
	private int frames = 0, maxFrames = 1;
	
	private int bX = 47, bY = 125;
	
	private boolean right = true;
	
	public Tutorial() {
		
	}
	
	public void tick() {
		
		//faz com que o botão voltar funcione
		if(Tutorial.select) {
			select = false;
			Game.gameState = "MENU";
		}
		
		//roda os frames da animação
		frames++;
		if(frames == maxFrames) {
			frames = 0;
			
			if(right) 
				bX++;
			else
				bX--;
		}
		
		if(bX <= 47) {
			right = true;
		}
		else if(bX >= Game.WIDTH - 47 - 9)
			right = false;
	}
	
	public void render(Graphics g) {
		
		
		//rederiza o botão de voltar
		g.setFont(new Font("arial", Font.CENTER_BASELINE, 15));
		g.setColor(Color.WHITE);
		
		g.drawString("Voltar", Game.WIDTH/2 - 20, Game.HEIGHT - 13);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color (0,0,0,180));
		g.fillRect(Game.WIDTH/2 - 20, Game.HEIGHT - 26, 41, 15);
		
		//escreve as explicações
		g.setFont(new Font("arial", Font.CENTER_BASELINE, 10));
		g.setColor(Color.WHITE);
		
		g.drawString("Solo: Use W S e/ou UP DOWN para se movimentar e fazer pontos", 45, 30);
		g.drawString("Infito: Use W S e/ou UP DOWN para impedir a bola de passar ", 45, 45);
		g.drawString("PvP: Use W S ou UP DOWN para tentar pontuar no seu adversário ", 45, 60);
		
		
		//imagen abaixo de texto
		g.setColor(new Color(10,150,255));
		g.fillRect(35, 100, 13, 60);
		
		g.setColor(new Color(255,150,10));
		g.fillRect(Game.WIDTH - 35 - 13, 100, 13, 60);
		
		//a bolinha que se move de acordo com a taxa de frames
		g.setColor(new Color(255,255,255));
		g.fillOval(bX, bY, 9, 9);
	}
}

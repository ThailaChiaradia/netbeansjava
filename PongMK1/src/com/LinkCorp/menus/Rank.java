package com.LinkCorp.menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import com.LinkCorp.main.Game;

public class Rank {
	
	public static boolean select;
	
	public Rank(){
		
	}
	
	public void tick() {
		
		//da funcionalidade ao botão voltar
		if(Rank.select) {
			select = false;
			Game.gameState = "MENU";
		}
	
	}
	
	public void render(Graphics g) {
		
		//faz o botão de Voltar
		g.setFont(new Font("arial", Font.CENTER_BASELINE, 15));
		g.setColor(Color.WHITE);
		
		g.drawString("Voltar", Game.WIDTH/2 - 20, Game.HEIGHT - 13);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color (0,0,0,180));
		g.fillRect(Game.WIDTH/2 - 20, Game.HEIGHT - 26, 41, 15);
		
		//renderiza o rank
		g.setFont(new Font("arial", Font.CENTER_BASELINE, 15));
		g.setColor(Color.WHITE);
		
		g.drawString("Melhor pontuação SOLO: "+Game.save.readInfo() , 90, 80);
		g.drawString("Melhor pontuação INFINITO: "+Game.save2.readInfo() , 90, 130);
		
		
		
	}
	
	
}

package com.LinkCorp.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Maps {
	
	private BufferedImage mapN;
	private BufferedImage mapF;
	private BufferedImage mapP;
	
	public Maps() {
		
		//recortando a imgaen q contem os mapas
		mapN = Game.mapsImage.getSprite(410 * 0, 0, Game.WIDTH, Game.HEIGHT);
		mapP = Game.mapsImage.getSprite(410 * 1, 0, Game.WIDTH, Game.HEIGHT);
		mapF = Game.mapsImage.getSprite(410 * 2, 0, Game.WIDTH, Game.HEIGHT);
		
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
		if(Game.gameState == "NORMAL") {
			g.drawImage(mapN,0,0,Game.WIDTH,Game.HEIGHT,null);
		}
		if(Game.gameState == "FOREVER") {
			g.drawImage(mapF,0,0,Game.WIDTH,Game.HEIGHT,null);
		}
		if(Game.gameState == "PvP") {
			g.drawImage(mapP,0,0,Game.WIDTH,Game.HEIGHT,null);
		}
	}
	
	
}

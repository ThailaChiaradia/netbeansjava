package com.LinkCorp.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MenuImage {
private BufferedImage menuI;
	
	public MenuImage(String path) 
	{
		try {
			menuI = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage getSprite(int x, int y, int width, int height){
		return menuI.getSubimage(x, y, width, height);
	}
}

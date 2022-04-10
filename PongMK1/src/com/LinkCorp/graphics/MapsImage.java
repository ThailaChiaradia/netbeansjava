package com.LinkCorp.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MapsImage {
private BufferedImage mapsI;
	
	public MapsImage(String path) 
	{
		try {
			mapsI = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage getSprite(int x, int y, int width, int height){
		return mapsI.getSubimage(x, y, width, height);
	}
}


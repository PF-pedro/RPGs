package view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Background extends JPanel{
	private Image image;
	public Background(Image image) {
		this.image = image;
	}
	public void paintComponent(Graphics g){                
	   g.drawImage(image,0,0,null);
	  } 
}

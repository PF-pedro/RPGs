package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.ImageIcon;

public class CharacterePicture extends JPanel{
	public CharacterePicture() {
		    this.setBackground(Color.BLACK);
		    this.setPreferredSize(new Dimension(110,110));
		    // pour un fond d'�cran je suis en manque d'id�e
			/*BorderLayout leLayout = new BorderLayout();
			this.setLayout(leLayout);
			Image theBackground = new ImageIcon("pogba.png").getImage();
			Background newBackground = new Background(theBackground);
		    this.add(newBackground );*/
	}
}

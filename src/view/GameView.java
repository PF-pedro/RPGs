package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import moteurDeJeu.Graphique;
import moteurDeJeu.Personnage;
import moteurDeJeu.ReadTextFiles;

import javax.swing.Box;
import javax.swing.ImageIcon;

public class GameView extends JPanel{
	private ReadTextFiles Map1 ;
	public GameView(Personnage P1) {
		this.setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(880,750));
		BorderLayout leLayout = new BorderLayout();
		this.setLayout(leLayout);
		Map1 = new ReadTextFiles("Map2.txt");
		Map1.position(P1);
		Graphique map = new Graphique(Map1,800,780);
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.add(map);
		this.add(panel);
		
	}
	
	public int[][] getTab(){
		return Map1.getTab();
	}
	public void setTab(int x,int y,int value){
	}
}

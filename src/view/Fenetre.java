package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import moteurDeJeu.Personnage;

import javax.swing.Box;
import javax.swing.ImageIcon;

public class Fenetre extends JFrame implements KeyListener{
	private GameView gameView;
	private int i=10;

	public Fenetre(){
		this.setTitle("RPG");
		this.setSize(1280,960);
		this.setBackground(Color.darkGray);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
			Box left = Box.createVerticalBox();
				left.add(Box.createVerticalStrut(23));
				Personnage P1 = new Personnage(i, 5);
				gameView = new GameView(P1);
				left.add(gameView);
			    left.add(Box.createVerticalStrut(25));
			    Box container1 = Box.createHorizontalBox();
			    	AbilitiesView abilitiesView = new AbilitiesView();
			    	container1.add(abilitiesView);
			    	container1.add(Box.createHorizontalStrut(15));
			    	GoldView goldView = new GoldView();
			    	container1.add(goldView);
			    left.add(container1);
			    left.add(Box.createVerticalStrut(25));
		    
		    
		    
		    Box right = Box.createVerticalBox();
			    right.add(Box.createVerticalStrut(25));
			    Box container = Box.createHorizontalBox();
				    XpBar xpBar = new XpBar();
					 container.add(xpBar);
					 container.add(Box.createHorizontalStrut(15));
					CharacterePicture characterePicture = new CharacterePicture();
					container.add(characterePicture);
					container.add(Box.createHorizontalStrut(25));
					 StatView statView = new StatView();
					 container.add(statView);
			    right.add(container);
			    right.add(Box.createVerticalStrut(40));
			    HpBar hpBar = new HpBar();
			    right.add(hpBar);
			    right.add(Box.createVerticalStrut(25));
			    ManaBar manaBar = new ManaBar();
			    right.add(manaBar);
			    right.add(Box.createVerticalStrut(60));
				MiniMap miniMap = new MiniMap();
			    right.add(miniMap);
			    right.add(Box.createVerticalStrut(50));
			    InventoryView inventoryView = new InventoryView();
			    right.add(inventoryView);
			    right.add(Box.createVerticalStrut(25));
		    
		    
		    
		    
		    Box hiddenContainer = Box.createHorizontalBox();
		    hiddenContainer.add(Box.createHorizontalStrut(50));
		    hiddenContainer.add(left);
		    hiddenContainer.add(Box.createHorizontalStrut(70));
		    hiddenContainer.add(right);
		    hiddenContainer.add(Box.createHorizontalStrut(50));
		    
		    hiddenContainer.setOpaque(false);
		    
		    // pour un fond d'écran je suis en manque d'idée
			/*BorderLayout leLayout = new BorderLayout();
			this.setLayout(leLayout);
			
			Image theBackground = new ImageIcon("Donjon2.jpg").getImage();
			Background newBackground = new Background(theBackground);
			newBackground.add(hiddenContainer);*/  
		this.addKeyListener(this);    
		this.setContentPane(hiddenContainer);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	  }
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int action = e.getKeyCode();
		switch(action)
		{
		case KeyEvent.VK_Z:
			//Personnage P1 = new Personnage(7, 5);
			//gameView = new GameView(P1);
			System.out.println("INDICE="+i);
			i=i+1;
			this.setVisible(true);
			this.repaint();
			break;
		case KeyEvent.VK_Q:
			System.out.println("gauche");
			break;
		case KeyEvent.VK_S :
			System.out.println("bas");
			break;
		case KeyEvent.VK_D :
			System.out.println("droite");
			break;
			default:
				System.out.println(e.getKeyCode());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}  
}











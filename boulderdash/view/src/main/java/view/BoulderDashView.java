package view;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class BoulderDashView extends JFrame{


		
		public static BoulderDashView  boulderdashview;
{
			
			// creation de la fenetre pour l'application
			JFrame fenetre = new JFrame(" BuilderDash"); //on donne un nom a la fenetre
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // si on clique sur la croix rouge on ferme la fenetre 
			fenetre.setSize(500, 500);// on initialise la taille de la fenetre 
			fenetre.setLocationRelativeTo(null); // on centre la fenetre sur l'ecran 
			fenetre.setResizable(false);//on interdie la redimention de la fenetre 
			fenetre.setAlwaysOnTop(true);// pour que la fenetre soit devant toutes les autres
			
			//Instanciation de l'objet scene
			boulderdashview = new BoulderDashView();
					
				fenetre.setContentPane(boulderdashview);// on associe la scene à la fenetre de l'application
				fenetre.setVisible(true);

		}

		public void addKeyListener(KeyListener Clavier) {
			// TODO Auto-generated method stub
			
		}
	
	
		
		
	    /*
	     * (non-Javadoc)
	     * @see view.IView#displayMessage(java.lang.String)
	     */
	    public final void displayMessage(final String message) {
	        JOptionPane.showMessageDialog(null, message);
	    }

	}




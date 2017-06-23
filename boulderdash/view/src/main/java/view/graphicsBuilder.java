package view;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




@SuppressWarnings("serial")
public class graphicsBuilder extends JPanel{
	
	public ImageIcon icofond;
   	public Image imgfond;
   	public ImageIcon icohero;
   	public Image imghero;
   	private static int xPos;
   	private static int yPos;
	public int compteur;
	private boolean marche;
   	
   	
   	// **** GETTERS ***


   	public static int getxPos() {return xPos;}
	public static int getyPos() {return yPos;}
	public boolean isMarche() {return marche;}
	
   	
   	// **** SETTERS ****
   	
	public static void setyPos(int yPos) {graphicsBuilder.yPos = yPos;}
	public static void setxPos(int xPos) {graphicsBuilder.xPos = xPos;}
	public void setMarche(boolean marche) {this.marche = marche;}




	    /**
	     * Instantiates a new view facade.
	     */
   	
   			// ***Constructeur ***
	    public graphicsBuilder() {
	        super();
	       
	    	
	    	this.icofond = new ImageIcon(getClass().getResource("/image/Decor_Monstre.png"));
	    	this.imgfond = this.icofond.getImage(); 
	    	
	    	this.icohero = new ImageIcon(getClass().getResource("/image/Hero.png"));
	    	this.imghero = this.icohero.getImage(); 
	    }

		public void paintComponent (Graphics g){
	for(int i = 0; i < 500; i += 32){
		for(int u = 0; u < 500; u +=32)
			//g.drawImage(this.imgfond,this.getxPos(), this.getyPos(),null);
			g.drawImage(this.imgfond, i, u ,i +32, u +32,32,0,48,16,null); // (position en x du sprite + 1) * 16
			
		
		repaint();
	
		}
	
	g.drawImage(this.imghero, getxPos(), getyPos(), getxPos() + 32,getyPos() + 32, 48, 0, 64, 16,null );
	
	repaint();
		
	
		
			
		}
		
		
	    /*
	     * (non-Javadoc)
	     * @see view.IView#displayMessage(java.lang.String)
	     */
	    public final void displayMessage(final String message) {
	        JOptionPane.showMessageDialog(null, message);
	    }

	}




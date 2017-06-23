package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import view.graphicsBuilder;

 

public abstract class Keyboard implements KeyListener{
	
	
	
	public void  keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			System.out.println("ok");
			graphicsBuilder.setxPos (graphicsBuilder.getxPos() +16);
			
			//g.drawImage(this.imghero, getxPos(), getyPos(), getxPos() + 32,getyPos() + 32, 16, 0, 32, 32,null );
			//g.drawImage(this.imghero, getxPos(), getyPos(), getxPos() + 32,getyPos() + 32, 16, 0, 16, 32,null );
			
			
			
		}//else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			//g.drawImage(this.imghero, getxPos(), getyPos(), getxPos() + 32,getyPos() + 32, 16, 0, 32, 64,null );
			//g.drawImage(this.imghero, getxPos(), getyPos(), getxPos() + 32,getyPos() + 32, 16, 0, 16, 64,null );
				
			
		//}
		
		//else if(e.getKeyCode() == KeyEvent.VK_UP){
		
		//}
		
		//else if(e.getKeyCode() == KeyEvent.VK_DOWN){
		
		//}
		
	
		
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	public void keyTyped(KeyEvent e) {	
	}
	
}



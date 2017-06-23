package model.element.Falling;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import java.awt.Point;
/**FallingElement
 * 
 * @author user
 *
 */
public abstract class FallingElement extends Element implements IFalling {
	
	/** FallingEement
	 * 
	 * @param sprite
	 * @param permeability
	 */
	public FallingElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
	/** getX
	 * 
	 * @return
	 */
	public int getX(){
		
		return 0;
	}
	/** setX
	 * 
	 * @param X
	 */
	public void setX(int X){
		return ;
	}
	/**getY
	 * 
	 * @return
	 */
	public int getY(){
		
		return 0;
	}
	/** SetY
	 * 
	 * @param Y
	 */
	public void setY(int Y){
		return ;
	}
	/** getPosition
	 * 
	 * @return
	 */
	public Point getPosition(){
		
		return null;
	}
	/**setPosition
	 * 
	 * @param position
	 * @return
	 */
	public Point setPosition(Point position){
		return null;
	}
	/** moveDown
	 * 
	 */
	public void moveDown(){
		return;
	}
	/** moveLeft
	 * 
	 */
	public void moveLeft(){
		return;
	}
	/** moveRight
	 * 
	 */
	public void moveRight(){
		return;
	}
}

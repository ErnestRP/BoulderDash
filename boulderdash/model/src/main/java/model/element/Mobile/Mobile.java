package model.element.Mobile;

import java.awt.Point;

import model.ILevel;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import model.BoulderDashModel;
/**Mobile
 * 
 * @author Alexis
 *
 */
public abstract class Mobile extends Element implements IMobile {
	/**position
	 * 
	 */
	private Point position;
	/**alive
	 * 
	 */
	private Boolean alive = true;
	/**Mobile
	 * 
	 * @param sprite
	 * @param level
	 * @param permeability
	 */
	public Mobile(final Sprite sprite, final ILevel level, final Permeability permeability) {
        super(sprite, permeability);
        this.setLevel(level);
        this.position = new Point();    
	}
	/**Mobile
	 * 
	 * @param x
	 * @param y
	 * @param sprite
	 * @param level
	 * @param permeability
	 * initialise the position of a mobile element
	 */
	Mobile(final int x, final int y, final Sprite sprite, final ILevel level, final Permeability permeability ){
		this(sprite, level, permeability);
		this.setX(x);
		this.setY(y);
	
}
	/**getx
	 * 
	 */
	public final int getX() {
        return this.getPosition().x;
    }
	/**setX
	 * 
	 * @param x
	 */
	public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isDead()) {
            this.die();
        }
    }
	/**getY
	 * 
	 */
	public final int getY() {
        return this.getPosition().y;
    }
	/**setY
	 * 
	 * @param y
	 */
	 public final void setY(final int y) {
	        this.getPosition().y = y ;
	        if (this.isDead()) {
	            this.die();
	        }
	    }
	 /**isAlive
	  * 
	  */
	 public Boolean isAlive() {
	        return this.alive;
	    }
	 /**die
	  * If the methods Alive = false, the element doesn't move
	  */
	 protected void die() {
	        this.alive = false;
	        this.setHasMoved();
	    }
	 
	 /**getPosition
	  * 
	  */
	 public Point getPosition() {
	        return this.position;
	    }
	 /**setPosition
	  * 
	  * @param position
	  */
	 public void setPosition(final Point position) {
	        this.position = position;
	    }
	 /** setHasMoved
	  * After the movement of an element
	  */
	 private void setHasMoved() {
	        this.getLevel().setMobileHasChanged();
	    }
	 /**doNothing
	  * If the element doesn,t move, set the method setHasMoved
	  */
	 public void doNothing() {
	        this.setHasMoved();
	    }
}
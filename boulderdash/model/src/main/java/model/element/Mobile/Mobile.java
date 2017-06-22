package model.element.Mobile;

import java.awt.Point;

import model.ILevel;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import model.BoulderDashModel;

public abstract class Mobile extends Element implements IMobile {
	
	private Point position;
	
	private Boolean alive = true;
	
	public Mobile(final Sprite sprite, final ILevel level, final Permeability permeability) {
        super(sprite, permeability);
        this.setLevel(level);
        this.position = new Point();    
	}
	
	Mobile(final int x, final int y, final Sprite sprite, final ILevel level, final Permeability permeability ){
		this(sprite, level, permeability);
		this.setX(x);
		this.setY(y);
	
}
	public final int getX() {
        return this.getPosition().x;
    }
	
	public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isDead()) {
            this.die();
        }
    }
	
	public final int getY() {
        return this.getPosition().y;
    }
	
	 public final void setY(final int y) {
	        this.getPosition().y = y ;
	        if (this.isCrashed()) {
	            this.die();
	        }
	    }
	 
	 public Boolean isAlive() {
	        return this.alive;
	    }
	 
	 protected void die() {
	        this.alive = false;
	        this.setHasMoved();
	    }
	 
	 
	 public Point getPosition() {
	        return this.position;
	    }
	 
	 public void setPosition(final Point position) {
	        this.position = position;
	    }
	 
	 private void setHasMoved() {
	        this.getLevel().setMobileHasChanged();
	    }
	 
	 public void doNothing() {
	        this.setHasMoved();
	    }
}
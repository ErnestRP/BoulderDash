package model.element.Mobile;

import java.io.IOException;
import java.awt.Image;
import javax.swing.ImageIcon;

import model.element.Permeability;
import model.element.Sprite;
/**Hero
 * 
 * @author Alexis
 *
 */
public class Hero extends Mobile{
	/**spriteStatic
	 * 
	 */
	private static final Sprite spriteStatic = new Sprite('1',"Static.png");
	/**spriteUp
	 * 
	 */
	private static final Sprite spriteUp = new Sprite('2',"Up.png");
	/**spriteDown
	 * 
	 */
	private static final Sprite spriteDown = new Sprite('3',"Down.png");
	/**spriteLeft
	 * 
	 */
	private static final Sprite spriteLeft = new Sprite('4',"Left.png");
	/**spriteRight
	 * 
	 */
	private static final Sprite spriteRight = new Sprite('5',"Right.png");
	/**SpriteDeath
	 * 
	 */
	private static final Sprite spriteDeath = new Sprite('6', "Death.png");
 
	/** Hero
	 * 
	 * @param x
	 * @param y
	 * @throws IOException
	 */
	public Hero(final int x, final int y) throws IOException {
        super(x, y, spriteStatic, Permeability.BLOCKING);
        spriteUp.loadImage();
        spriteDown.loadImage();
        spriteLeft.loadImage();
        spriteRight.loadImage();
        spriteDeath.loadImage();
    }
	
	/**moveleft
	 * set the sprite Left
	 */
	public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteLeft);
    }
	/**moveUp
	 * set the spriteUp
	 */
	public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteUp);
    }
	/**
	 * set the sprite Down
	 */
	public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteDown);
    }
	/**moveRight
	 * set the Sprite Right
	 */
	public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteRight);
              
    }
	/**die
	 * Set the sprite death
	 */
	public final void die() {
        super.die();
        this.setSprite(spriteDeath);
    }
	/**doNothing
	 * set the sprite static
	 */
	public final void doNothing() {
        super.doNothing();
        this.setSprite(spriteStatic);
    }


	@Override
	public Boolean isDead() {
		
		return null;
	}
	
	
}

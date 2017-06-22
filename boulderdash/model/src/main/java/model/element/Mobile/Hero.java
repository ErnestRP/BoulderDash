package model.element.Mobile;

import java.io.IOException;

import model.element.Permeability;
import model.element.Sprite;

public class Hero extends Mobile{
	
	private static final Sprite spriteStatic = new Sprite('2');
	
	private static final Sprite spriteUp = new Sprite('5');
	
	private static final Sprite spriteDown = new Sprite('4');
	
	private static final Sprite spriteLeft = new Sprite('6');

	private static final Sprite spriteRight = new Sprite('9');

	private static final Sprite spriteDeath = new Sprite('3');

	
	public Hero(final int x, final int y) throws IOException {
        super(x, y, spriteStatic, Permeability.BLOCKING);
        spriteUp.loadImage();
        spriteDown.loadImage();
        spriteLeft.loadImage();
        spriteRight.loadImage();
        spriteDeath.loadImage();
    }
	
	
	public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteLeft);
    }
	
	public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteUp);
    }
	
	public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteDown);
    }
	
	public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteRight);
              
    }
	
	public final void die() {
        super.die();
        this.setSprite(spriteDeath);
    }
	
	public final void doNothing() {
        super.doNothing();
        this.setSprite(spriteStatic);
    }


	@Override
	public Boolean isDead() {
		
		return null;
	}
	
	
}

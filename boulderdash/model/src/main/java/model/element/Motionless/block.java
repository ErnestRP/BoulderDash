package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;

class block extends MotionlessElement {
	
	private final static Sprite SPRITE = new Sprite ('5', "Block.jpg");
	
	block(){
		super(SPRITE, Permeability.BLOCKING);
	}
}

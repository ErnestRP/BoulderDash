package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;

 class exit extends MotionlessElement {
	
	 private final static Sprite SPRITE = new Sprite ('4', "exit.jpg");
	
	 public exit(){
		super( SPRITE, Permeability.EXIT);
	}
}

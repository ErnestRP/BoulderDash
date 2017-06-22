package model.element.Falling;

import model.element.Permeability;
import model.element.Sprite;

 class Diamond extends FallingElement {
		
	private final static Sprite SPRITE = new Sprite('1', "moi.jpg");
		
	Diamond(){
		super(SPRITE, Permeability.PUSH);
		}

}

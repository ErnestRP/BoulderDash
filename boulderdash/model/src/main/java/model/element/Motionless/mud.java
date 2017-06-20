package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;

class mud extends MotionlessElement {
	

	private final static Sprite SPRITE = new Sprite ('1', "mud.jpg");
	
	mud(){
		super( SPRITE, Permeability.DESTROY);
	}
}


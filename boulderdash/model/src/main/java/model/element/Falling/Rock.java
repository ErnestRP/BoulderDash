package model.element.Falling;

import model.element.Permeability;
import model.element.Sprite;

public class Rock extends FallingElement {
	
	private final static Sprite SPRITE = new Sprite('1', "moi.jpg");
	
	Rock(){
		super(SPRITE, Permeability.PUSH);
	}
}

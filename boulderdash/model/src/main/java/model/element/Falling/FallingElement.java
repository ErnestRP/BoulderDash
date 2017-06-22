package model.element.Falling;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class FallingElement extends Element implements IFalling {
	
	
	public FallingElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
	
	
}

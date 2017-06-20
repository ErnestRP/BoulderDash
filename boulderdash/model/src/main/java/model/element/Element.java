package model.element;

import java.awt.Image;

public abstract class Element implements IElement {
		
	private Sprite sprite;
	
	private Permeability permeability;
	
	
	public Element(Sprite sprite, Permeability permeability){
		this.setPermeability(permeability);
		this.setSprite(sprite);
	}


	public Sprite getSprite() {
		return this.sprite;
	}


	protected final void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}


	public Permeability getPermeability() {
		return permeability;
	}


	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public final Image getImage() {
        return this.getSprite().getImage();
    }
	
}

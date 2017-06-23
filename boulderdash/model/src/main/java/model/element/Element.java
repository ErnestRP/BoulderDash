package model.element;

import java.awt.Image;
/**element
 * 
 * @author alexis
 *
 */
public abstract class Element implements IElement {
	/**sprite
	 * 	
	 */
	private Sprite sprite;
	/**permeability
	 * 
	 */
	private Permeability permeability;
	
	/**Element
	 * 
	 * @param sprite
	 * @param permeability
	 */
	public Element(Sprite sprite, Permeability permeability){
		this.setPermeability(permeability);
		this.setSprite(sprite);
	}

	/**getSprite
	 * 
	 */
	public Sprite getSprite() {
		return this.sprite;
	}

	/**setSprite
	 * 
	 * @param sprite
	 */
	protected final void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	/**getPermeability
	 * 
	 */
	public Permeability getPermeability() {
		return permeability;
	}

	/**setPermeability
	 * 
	 * @param permeability
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	/**getImage
	 * 
	 */
	public final Image getImage() {
        return this.getSprite().getImage();
    }
	
}

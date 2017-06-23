package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/**Sprite
 * 
 * @author Alexis
 *
 */
public class Sprite {
	/**image
	 * 
	 */
	private Image image;
	/**imageName
	 * 
	 */
	private String imageName;
	/**consoleImage
	 * 
	 */
	private char consoleImage;
	/**imageLoaded
	 * 
	 */
	private boolean imageLoaded;
	
	
	/**Sprite
	 * 
	 * @param character
	 * @param imageName
	 */
	public Sprite(final char character, final String imageName) {
        this.setConsoleImage(character);
        this.setImageName(imageName);
    }
	/**Sprite
	 * 
	 * @param character
	 */
	public Sprite(final char character){
		this(character, "oui.jpg");
	}
	/**loadImage
	 * 
	 * @throws IOException
	 */
	public final void loadImage() throws IOException {
        this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
    }
	/**getImage
	 * 
	 * @return
	 */
	public Image getImage() {
		return image;
	}
	
	/**detImage
	 * 
	 * @param image
	 */
	public void setImage(Image image) {
		this.image = image;
	}


	/**getImageName
	 * 
	 * @return
	 */
	public String getImageName() {
		return imageName;
	}


	/**setImageName
	 * 
	 * @param imageName
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	/**getImageImage
	 * 
	 * @return
	 */
	public char getConsoleImage() {
		return consoleImage;
	}


	/**setCOnsoleImage
	 * 
	 * @param consoleImage
	 */
	public void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}


	/**isImageLoaded
	 * 
	 * @return
	 */
	public boolean isImageLoaded() {
		return imageLoaded;
	}


	/**setImageLoaded
	 * 
	 * @param imageLoaded
	 */
	public void setImageLoaded(boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}
}

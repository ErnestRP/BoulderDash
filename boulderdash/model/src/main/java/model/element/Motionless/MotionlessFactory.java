package model.element.Motionless;
/**MotionlessElementFactory
 * 
 * @author Alexis
 *
 */
public abstract class MotionlessFactory {
	/**block
	 * 
	 */
	private static final block		BLOCK     =  new block();
	/**dig
	 * 
	 */
	private static final dig		DIG	      =  new dig();
	/**mud
	 * 
	 */
	private static final mud		MUD       =  new mud();
	/**exit
	 * 
	 */
	private static final exit		EXIT   	  =  new exit();
	/**MotionlessElement
	 * instantiate new motionless elements
	 */
	private static MotionlessElement[] motionlessElements = { BLOCK, DIG, MUD, EXIT };
	
	/**cretaeblock
	 * 
	 * @return
	 */
	public static MotionlessElement createBlock(){
		return BLOCK;
	}
	/**createdig
	 * 
	 * @return
	 */
	public static MotionlessElement createDig(){
		return DIG;
	}
	/**createmud
	 * 
	 * @return
	 */
	public static MotionlessElement createMud(){
		return MUD;
	}
	/**createexit
	 * 
	 * @return
	 */
	public static MotionlessElement createExit(){
		return EXIT;
	}
	/**getFromFileSymbol
	 * assign a character to a sprite
	 * @param fileSymbol
	 * @return
	 */
	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return DIG;
    }



}

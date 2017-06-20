package model.element.Motionless;

public abstract class MotionlessFactory {
	
	private static final block		BLOCK     =  new block();
	
	private static final dig		DIG	      =  new dig();
	
	private static final mud		MUD       =  new mud();
	
	private static final exit		EXIT   	  =  new exit();
	
	private static MotionlessElement[] motionlessElements = { BLOCK, DIG, MUD, EXIT };
	
	
	public static MotionlessElement createBlock(){
		return BLOCK;
	}
	
	public static MotionlessElement createDig(){
		return DIG;
	}
	
	public static MotionlessElement createMud(){
		return MUD;
	}
	
	public static MotionlessElement createExit(){
		return EXIT;
	}
	
	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return DIG;
    }



}

package model.element.Mobile;

import java.awt.Point;

import model.element.IElement;

public interface IMobile extends IElement {

    void moveUp();

    void moveLeft();

    void moveDown();

    void moveRight();

    void doNothing();
    
    int getX();

    int getY();

    Boolean isAlive();
    
    Boolean isDead();

    Point getPosition();

}

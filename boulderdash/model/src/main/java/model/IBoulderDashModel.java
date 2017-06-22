package model;

import model.element.Mobile.IMobile;

public interface IBoulderDashModel {
	
	ILevel getLevel();
	
	IMobile getHero();
	
	IMobile getMonster();
}

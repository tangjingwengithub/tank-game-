package tank.entity;

import tank.ImageManager;

public class Blink extends Cell{
	
	public Blink(int x,int y){
		 this.horizon = x;
		 this.vertical = y;
		 img = ImageManager.getInstance().getBlink();
	}
}

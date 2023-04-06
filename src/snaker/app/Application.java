package snaker.app;

import snaker.entities.Food;
import snaker.entities.Position;
import snaker.entities.Snake;

public class Application {

	public static void main(String[] args) {
		
		Snake snaker = new Snake(new Position(2, 2));
		Food food = new Food(new Position(0, 0));
		
		System.out.println("Snaker: "+snaker);
		System.out.println("Food: "+food.getPosition());
		
	}

}

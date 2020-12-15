package chap5;

public class AnimalEx {
	public static void main(String[] args) {
		Animal an = new Animal();
		Pig pig = new Pig();
		Bird bird = new Bird();
		Fish fish = new Fish();
		
		Animal[] animal = {pig,bird,fish};
		for (Animal ani:animal) {
			ani.move();
			if(ani instanceof Bird) {
				Bird bird1 = (Bird)ani;
				bird1.eat();
			}
		}
	}
}

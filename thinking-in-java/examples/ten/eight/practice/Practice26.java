/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月25日 上午11:40:17
 */
package ten.eight.practice;

/**
 * @author Administrator
 *
 */
public class Practice26 {
	class SmallDog extends Animal.Dog{
		public SmallDog(Animal animal, String s) {
			animal.super(s);
			System.out.println("Practice26.SmallDog().s = " + s);
		}
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Practice26 practice26 = new Practice26();
		SmallDog smallDog = practice26.new SmallDog(animal, "SmallDog");
	}
}

class Animal{
	class Dog{
		public Dog(String s) {
			System.out.println("Animal.Dog().s = "+s);
		}
	}
}

class Animal {
	void sound() {
		System.out.println("Animla makes a sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

public class staticAndDynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog(); // upcasting
		animal.sound(); // static binding
	}

}

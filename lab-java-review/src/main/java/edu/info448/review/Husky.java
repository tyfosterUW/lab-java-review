package edu.info448.review;

public class Husky extends Dog implements Huggable {
	
	public Husky(String name) {
		super(name, "Husky");
	}

	public Husky() {
		super("Dubs", "Husky");
	}

	public void pullSled() {
		System.out.println(this+" pulls the sled");
	}

	public void bark() {
		System.out.println(this+ " says: Woof! like a husky");
	}

	public void hug() {
		System.out.println(this+ " gives you the best hug a doggo can give.");
	}
}
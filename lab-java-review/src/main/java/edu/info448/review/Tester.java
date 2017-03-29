package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Dog[] pups = dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		Dog v1 = new Husky();
		// Husky v2 = new Dog();
		// Huggable v3 = new Husky();
		// Huggable v4 = new TeddyBear();
		v1.bark();

		ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		hugList.add(new Husky()); //a Husky is Huggable
		hugList.add(new TeddyBear()); //so are Teddybears!

		for(Huggable thing : hugList) {
		    thing.hug();
		}

		GiftBox<Dog> g1 = new GiftBox<Dog>(v1);

		// Animal a1 = new Animal(); Abstract, can't be done.

		// Husky v4 = new TeddyBear(); doesn't work
	}
}
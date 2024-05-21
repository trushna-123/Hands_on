package com.assignment;

 class Animals
{
	 public void move() {
		    System.out.println("Animal moves");
		  }

		  public void makeSound() {
		    System.out.println("Animal makes a sound");
		  }
}
class Bird extends Animals {
	  @Override
	  public void move() {
	    System.out.println("Bird flies");
	  }

	  @Override
	  public void makeSound() {
	    System.out.println("Bird chirps");
	  }
	}
class Panthera extends Animals {
	  @Override
	  public void move() {
	    System.out.println("Panthera walks");
	  }

	  @Override
	  public void makeSound() {
	    System.out.println("Panthera roars");
	  }
}
public class Animal{
	  public static void main(String[] args) {
		    Animals bird = new Bird();
		    Animals panthera = new Panthera();

		    performAction(bird);
		    performAction(panthera);
		  }
		  public static void performAction(Animals animal) {
		    animal.move();
		    animal.makeSound();
		  }
		}

		

package com.assignment;

public class Sports 
{
	 public void play() 
	    {
	        System.out.println("Sports name - ");
	    }
}
class Football extends Sports 
{
    @Override
    public void play() {
        System.out.println("football.");
    }
}
class Basketball extends Sports 
{
    @Override
    public void play()
    {
        System.out.println("basketball.");
    }
}
class Rugby extends Sports
{
    @Override
    public void play()
    {
        System.out.println("rugby.");
    }
public static void main(String[] args)
{
    Sports sports = new Sports();
    Football football = new Football();
    Basketball basketball = new Basketball();
    Rugby rugby = new Rugby();

    sports.play();
    football.play();
    basketball.play();
    rugby.play();
}
}
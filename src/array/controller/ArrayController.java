package array.controller;

import array.model.Hipster;
//import array.view.HipsterFrame;
public class ArrayController
{
//	private HipsterFrame appFame;
	private int[] numbers;
	private String [] words;
	private Hipster [] hipsters;
	
	
	public ArrayController()
	{
		numbers = new int [20];
		words = new String [4];
		hipsters = new Hipster[6];
	}
	
	public void start()
	{
		for(Hipster currentHipster : hipsters)
		{
			System.out.print(currentHipster + ", ");
		}
		System.out.println("Next");
		for(String currentWord : words)
		{
			System.out.print(currentWord + ", ");
		}
		System.out.println("Next");
		for(int tempInt : numbers)
		{
			System.out.print(tempInt + ", ");
		}
	}

}

package array.controller;

import array.model.Hipster;
//import array.view.HipsterFrame;
public class ArrayController
{
//	private HipsterFrame appFame;
	private int[] numbers;
	private String [] words = {"This ","is the ","second hiptser ","level: ","initialization ","lists"};
	private Hipster [] hipsters;
	
	
	public ArrayController()
	{
		numbers = new int [20];
		
		hipsters = new Hipster[6];
	}
	
	public void start()
	{
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("hipster # " + index);
		}
		
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

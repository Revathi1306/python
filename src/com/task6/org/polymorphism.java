package com.task6.org;

public class polymorphism {

	public void Biriyani()
	   {
		System.out.println("Ambur biriyani");
	     }
	public void Biriyani(int a)
	   {
		System.out.println("Arcot biriyani");
	    }
	public void Biriyani(char r)
	   {
         System.out.println("Selam R.R biriyani");
		}
	public void Biriyani(int b,char c)
	{
		System.out.println("Jam Jam biriyani");
	}
	public static void main(String[] args)
	{
		polymorphism obj=new polymorphism();
		obj.Biriyani();
		obj.Biriyani('a');
		obj.Biriyani(7);
		obj.Biriyani(6,'r');
		
	}
}

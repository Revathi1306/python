package com.task6.org;

public class Abstract2 extends Abstract1{
	@Override
	void hero() {
		System.out.println("Dhanush");
		}
	@Override
	void heroine() {
		System.out.println("Shrutihasan");
		
	}
	@Override
	void comedian() {
		System.out.println("Sivakarthikeyan");
		
	}
	 public void movie()
	 {
		 super.movie();
		 System.out.println("3");
	 }
	public static void main(String[] args)
	{
		Abstract2 obj=new Abstract2();
		obj.hero();
		obj.heroine();
		obj.comedian();
		obj.movie();
	}

}

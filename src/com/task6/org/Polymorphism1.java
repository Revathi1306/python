package com.task6.org;

public class Polymorphism1 extends polymorphism {
     @Override
    public void Biriyani() {
  
    	super.Biriyani();
    	System.out.println("Thalapakatti biriyani");
    }
     @Override
    public void Biriyani(char r)
     {
    	
    	super.Biriyani(r);
    	System.out.println("Hydrabad biriyani");
    }
     @Override
    public void Biriyani(int b, char c) {
    	
    	super.Biriyani(b, c);
    	System.out.println("Chettinad biriyani");
    }
     public static void main(String[] args)
     {
    	 Polymorphism1 obj=new Polymorphism1();
		obj.Biriyani();
		obj.Biriyani('r');
		obj.Biriyani(6);
		obj.Biriyani(7,'a');
    	 
     }
   
}

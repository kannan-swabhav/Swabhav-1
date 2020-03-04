package com.techlabs.thispointer;

public class ApplicationsOfThisPointer {
	private int a;
	private int b;

	public ApplicationsOfThisPointer(int a, int b) {
		this.a = a; 
        this.b = b; 
        System.out.println("Inside constructor no. 1 \n");
	}
	
	public void display() 
    { 
        System.out.println("a = " + a + "  b = " + b); 
    } 
	
	public ApplicationsOfThisPointer() {
		 this(10, 20); 
	        System.out.println("Inside constructor no. 2 \n"); 
	}
	
	public ApplicationsOfThisPointer get() {
		return this;
		
	}
	
	public void display(ApplicationsOfThisPointer obj) {
		System.out.println("a = " + a + "  b = " + b); 
	}
	
	public void getThis() {
		display(this);
	}
	
	public void show() { 
        System.out.println("Inside show funcion"); 
    } 
	
	void displayUsingThis() 
    {  
        this.show(); 
       System.out.println("Inside display function"); 
    } 

}


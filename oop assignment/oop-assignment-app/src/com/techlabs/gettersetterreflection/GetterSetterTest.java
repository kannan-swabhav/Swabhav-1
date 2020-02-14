package com.techlabs.gettersetterreflection;

public class GetterSetterTest {
	public static void main(String[] args) {
		GetterSetterTest object=new GetterSetterTest();
		object.setName("Tejashree");
		System.out.println(object.getName());
	}
	private String name;

	  public String getName() {
	    return name;
	  }

	  public void setName(String newName) {
	    this.name = newName;
	  }
}





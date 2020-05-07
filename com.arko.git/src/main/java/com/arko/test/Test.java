package com.arko.test;



interface TouchScreenLaptop{
	void scroll();
	void click();
}
abstract class HP implements TouchScreenLaptop{

	public void scroll() {
		System.out.println("Hp implementions");
		
	}
	
}
abstract class DELL implements TouchScreenLaptop{

	public void scroll() {
		System.out.println("DELL implementions");
		
	}
	
}
class HPNotebook extends HP{

	public void click() {
		System.out.println("HP Click implemetion");
		
	}
	
}
class DELLNotebook extends HP{

	public void click() {
		System.out.println("DELL Click implemetion");
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		TouchScreenLaptop obj1 = new HPNotebook();
		TouchScreenLaptop obj2 = new DELLNotebook();
		obj1.click();
		obj2.click();
	}
}



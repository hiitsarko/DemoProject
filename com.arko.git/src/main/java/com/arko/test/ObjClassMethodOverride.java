package com.arko.test;

class ElectricityBill{
	int meterNo;
	String name;
	String address;
	
	ElectricityBill(int a, String b,String c) {
		this.meterNo = a;
		this.name = b;
		this.address = c;
	}
	
	public String toString() {
		return String.format(meterNo+"   "+name+"   "+address);
	}
	public boolean equals(Object o) {
		ElectricityBill temp = (ElectricityBill)o;
		if(this.meterNo == temp.meterNo) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		return this.meterNo;
	}
	
}
public class ObjClassMethodOverride {

	public static void main(String[] args) {
		ElectricityBill ob1 = new ElectricityBill(10, "Arko", "Suri");
		ElectricityBill ob2 = new ElectricityBill(10, "Mou", "Bolpur");
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());

	}

}

package com.arko.test;

class Patient {
	private int id;
	private String name;
	private String ssn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
public class Test{
	public static void main(String[] args) {
		Patient ob = new Patient();
		ob.setId(10);
		ob.setName("Demo");
		ob.setSsn("456789");
		
		System.out.println(ob.getId()+"    "+ob.getName()+"   "+ob.getSsn());
	}
}

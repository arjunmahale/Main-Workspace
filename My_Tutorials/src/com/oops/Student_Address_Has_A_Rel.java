package com.oops;

class Address{
	String city;
	String state;
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}


}
class Student3{
	int id;
	String name;
	Address Add;
	public Student3(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		Add = add;
	}
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", Add=" + Add + "]";
	}

}
public class Student_Address_Has_A_Rel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address("nashik", "mah");
		Student3 s3=new Student3(1, "Arjun", ad);
		System.out.println(s3);
	}

}

package javaSecondWeek;

public class Personel {
private String name;
private String phone;
private String address;
private double salary;
public Personel() {
	
}
public Personel(String name, String phone, String address, double salary) {
	this.name = name;
	this.phone = phone;
	this.address = address;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

	

}

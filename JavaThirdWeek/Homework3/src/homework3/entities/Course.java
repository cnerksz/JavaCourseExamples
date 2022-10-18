package homework3.entities;

public class Course extends Base {
private double price;
public Course(int id,String name,double price) {
super(id,name);
this.setPrice(price);
}
public void setPrice(double price) {
	this.price = price;
}
public double getPrice() {
	return price;
}

}

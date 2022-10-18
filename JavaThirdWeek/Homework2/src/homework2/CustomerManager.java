package homework2;
public class CustomerManager {
IEatable iEatable;
IWorkable iWorkable;
public CustomerManager(IEatable iEatable,IWorkable iWorkable){
	this.iEatable=iEatable;
	this.iWorkable=iWorkable;
	
}
public void add() {
	iEatable.eat();
	iWorkable.work();
}
}

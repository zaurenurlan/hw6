package hw6;

public abstract class Employee { //creating abstract class employee for hierarchy
	protected String name;	//field with name of the employee
	protected int salary;	//field with salary of the employee
	
	
	public Employee(String n, int s){	//constructor
		this.name = n;
		this.salary = s;
	}
	public String getName(){	//getter for name
		return name;
	}
	public int getSalary(){ 	//getter for salary
		return salary;
	}
	
	
}

package hw6;

public class Mobile extends Employee implements Work{ //creation of child class of employee and it implements interface
	
	public Mobile(String n, int s) {//constructor
		super(n, s);
	}

	public void work() {
		writeMobile();
	}
	private void writeMobile(){//clarifies the role of this employee
		System.out.println("Mobile developer creates your app for smartphones.");
	}
}

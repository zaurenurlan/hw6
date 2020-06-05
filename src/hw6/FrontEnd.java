package hw6;

public class FrontEnd extends Employee implements Work {//creation of child class of employee and it implements interface
	
	
	public FrontEnd(String n, int s) { //constructor
		super(n, s);
	}
	public void work() {	
		writeFront();	
	}
	private void writeFront(){	//clarifies the role of this employee
		System.out.println("Front end developer creates design for your app.");
	}
}

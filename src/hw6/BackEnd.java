package hw6;

public class BackEnd extends Employee implements Work {//creation of child class of employee and it implements interface
	public BackEnd(String n, int s) {//constructor
		super(n, s);
	}

	public void work() {
		writeBack();
	}
	private void writeBack(){//clarifies the role of this employee
		System.out.println("Back end developer writes code for your app.");
	}
}

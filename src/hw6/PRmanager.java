package hw6;

public class PRmanager extends Employee implements Work {//creation of child class of employee and it implements interface

	public PRmanager(String n, int s) {//constructor
		super(n, s);
	}

	public void work() {
		promote();
	}
	private void promote(){//clarifies the role of this employee
		System.out.println("PR manager promotes your app in order to find more users.");
	}
}

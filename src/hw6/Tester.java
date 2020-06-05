package hw6;

public class Tester extends Employee implements Work {//creation of child class of employee and it implements interface

	public Tester(String n, int s) {//constructor
		super(n, s);
	}

	public void work() {
		test();
	}
	private void test(){//clarifies the role of this employee
		System.out.println("Tester checks your app for errors.");
	}
}

package day1.lab;

public class UseSingletionConstructor {

	public static void main(String[] args) {
		TestSingletonConstructor t1 = TestSingletonConstructor.getObject();
		TestSingletonConstructor t2 = TestSingletonConstructor.getObject();
		
		System.out.println("Value of t1.i = " + t1.i);
		t1.i += 10;


		System.out.println("Value of t1.i after increment = " + t1.i);
		System.out.println("Value of t2.i = " + t2.i);
	}

}

package day1.lab;

public class TestSingletonConstructor {

	static TestSingletonConstructor sobj = null;
	public int i = 10;
	private TestSingletonConstructor() {
		i = 10;
	}
	static TestSingletonConstructor getObject() {
		if (sobj == null) {
			sobj = new TestSingletonConstructor();
		}
		return sobj;
		
	}
}

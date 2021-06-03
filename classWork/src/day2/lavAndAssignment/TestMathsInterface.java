package day2.lavAndAssignment;

public class TestMathsInterface {

	public static void main(String[] args) {
		
		  UseCompute useC = new UseCompute();
		  
		  useC.useCom(new AdditionInterface(), 8, 2);
		  
		  useC.useCom(new SubtractionInterface(), 8, 2);
		  
		  useC.useCom(new MultiplicationInterface(), 8, 2);
		  
		  useC.useCom(new DivisionInterface(), 8, 2);
		 
		
	}

}

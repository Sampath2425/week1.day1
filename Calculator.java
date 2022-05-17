package week1.day1;

public class Calculator {
	
	public int add(int a, int b) {
		
		int sum = a+b;
		return sum;
		
	}	
	public int sub(int a, int b) {
		
		int subtraction;
		if(a>b) {
			subtraction = a-b;
		}
		else subtraction = b-a;
		return subtraction;
		
	}
	public int mul(int a, int b) {
		
		int multiply = a*b;
		return multiply;
	}
	public int div(int a, int b) {
		int divide = a/b;
		return divide;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		int add = cal.add(5, 10);
		int sub = cal.sub(10, 5);
		int mul = cal.mul(5, 5);
		int div = cal.div(10, 5);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);

	}

}

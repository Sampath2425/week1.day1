package week1.day1;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 0, secNum = 1, sum, i, range = 8;
		System.out.println(firstNum +" " + secNum);
		for(i=1;i<= 8;++i) {
			sum = firstNum + secNum;
			System.out.println(" " + sum);
			firstNum = secNum;
			secNum = sum;
		}
			

	}

}
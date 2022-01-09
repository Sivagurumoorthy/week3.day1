package week3.day1;

public class Calc {

	public int add(int num1, int num2) {
		return num1+num2;
	}	
		public int add(int num1, int num2, int num3) {
			return num1+num2+num3;
		
	}
		public double multiply(int num1, double num2) {
			return num1*num2;
		
	}		public double multiply(int num1, double num2, double num3) {
		return num1*num2*num3;
	}
		public int subtract(int num1, int num2) {
			return num1-num2;
		}
		public double subtract1(int num1, double num2) {
			return num1-num2;
		}
		public double divide(double num1, int num2) {
			return num1/num2;
		}
public static void main(String[] args) {
		Calc calc = new Calc();
		int add = calc.add(10,80);
		int add1 = calc.add(12,23);
		double multiply = calc.multiply(25,278.989099);
		double multiply1 = calc.multiply(24,4787654.89765);
		int subtract  = calc.subtract(900, 343);
		double subtract1 = calc.subtract1(243,123.432);
		double divide  = calc.divide(24.360,12);
		System.out.println(add);
		System.out.println(add1);
		System.out.println(multiply);
		System.out.println(multiply1);
		System.out.println(subtract);
		System.out.println(subtract1);
		System.out.println(divide);
		
}}

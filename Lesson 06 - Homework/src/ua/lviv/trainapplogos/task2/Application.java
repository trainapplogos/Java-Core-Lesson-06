package ua.lviv.trainapplogos.task2;

import com.lgs.lab.interface2.MyCalculator;

public class Application {
	public static void main(String[] args) {
		double arg1 = 23;
		double arg2 = 53.5;
		
		MyCalculator calc = new MyCalculator();
		
		MyCalculator calc2 = new MyCalculator(arg1, arg2);
		
		System.out.println("5 + 2 = " + calc.plus(5, 2));
		System.out.println("15 - 4 = " + calc.minus(15, 4));
		System.out.println("26 * 12 = " + calc.multiply(26, 12));
		System.out.println("26 / 2 = " + calc.divide(26, 2));
		
		System.out.println();
		
		System.out.println(arg1 + " + " + arg2 + " = " + calc2.plus());
		System.out.println(arg1 + " - " + arg2 + " = " + calc2.minus());
		System.out.println(arg1 + " * " + arg2 + " = " + calc2.multiply());
		System.out.println(arg1 + " / " + arg2 + " = " + calc2.divide());
	}
}




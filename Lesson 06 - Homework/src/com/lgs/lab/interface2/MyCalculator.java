package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	private double arg1;
	private double arg2;
	
	public MyCalculator() {}
	
	public MyCalculator(double arg1, double arg2) {
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	@Override // "+"
	public double plus() {
		return this.arg1 + this.arg2;
	}
	
	@Override
	public double plus(double arg1, double arg2) {
		return arg1 + arg2;
	}
	
	@Override // "-"
	public double minus() {
		return this.arg1 - this.arg2;
	}

	@Override
	public double minus(double arg1, double arg2) {
		return arg1 - arg2;
	}
	
	
	@Override // "*"
	public double multiply() {
		return this.arg1 * this.arg2;
	}	
	
	@Override
	public double multiply(double arg1, double arg2) {
		return arg1 * arg2;
	}


	@Override // "/"
	public double divide() {
		return this.arg1 / this.arg2;
	}
	
	@Override 
	public double divide(double arg1, double arg2) {
		return arg1 / arg2;
	}
}

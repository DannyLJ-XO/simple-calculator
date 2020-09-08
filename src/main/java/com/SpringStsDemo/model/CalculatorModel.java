package com.SpringStsDemo.model;

public class CalculatorModel {
	public double num1;
	public double num2;
	public String operation;
	
	
	public CalculatorModel() {
	}
	public CalculatorModel(double num1, double num2, String operation) {
		this.num1 = num1;
		this.num2 = num2;
		this.operation = operation;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
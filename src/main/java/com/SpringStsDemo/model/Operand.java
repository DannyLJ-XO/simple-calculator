package com.SpringStsDemo.model;

public class Operand {
	private double operand1;
	private String operand2;
	private double operand3;
	private double operand4;
	
	
	public Operand() {
	}

	public Operand(double operand1, String operand2, double operand3, double operand4) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operand3 = operand3;
		this.operand4 = operand4;
	}

	public double getOperand1() {
		return operand1;
	}

	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public String getOperand2() {
		return operand2;
	}

	public void setOperand2(String operand2) {
		this.operand2 = operand2;
	}

	public double getOperand3() {
		return operand3;
	}

	public void setOperand3(double operand3) {
		this.operand3 = operand3;
	}

	public double getOperand4() {
		return operand4;
	}

	public void setOperand4(double operand4) {
		this.operand4 = operand4;
	}

	@Override
	public String toString() {
		return "Operand [operand1=" + operand1 + ", operand2=" + operand2 + ", operand3=" + operand3 + ", operand4="
				+ operand4 + "]";
	}
		
}

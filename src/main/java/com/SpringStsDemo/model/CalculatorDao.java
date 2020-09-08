package com.SpringStsDemo.model;

import java.util.List;

public interface CalculatorDao {
	Operand findByOperand1(Double operand1);
    
    Operand findByOperand2(String operand2);
     
    void saveResult(Operand operand);
     
    void updateResult(Operand operand);
     
    void deleteResultByoperand1(Double operand1);
 
    List<Operand> findAllResults(); 
     
    void deleteAllResults();
     

}

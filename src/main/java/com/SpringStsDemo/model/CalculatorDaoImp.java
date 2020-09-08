//package com.SpringStsDemo.model;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
// 
//import org.springframework.stereotype.Service;
//
// 
//@Service("operationService")
//public class CalculatorDaoImp implements CalculatorDao{
//	 private static final AtomicLong counter = new AtomicLong();
//     
//	    private static List<Operand> operations;
//	     
//	    static{
//	        operations= populateDummyUsers();
//	    }
//	 
//	    public List<Operand> findAllResults(){
//	        return operations;
//	    }
//	     
//	    public Operand findByOperand1(Double operand1) {
//	        for(Operand operand : operations){
//	            if(operand.getOperand1() == operand1){
//	                return operand;
//	            }
//	        }
//	        return null;
//	    }
//	     
//	    public Operand findByOperand2(String operand2) {
//	        for(Operand operand : operations){
//	            if(operand.getOperand2().equalsIgnoreCase(operand2)){
//	                return operand;
//	            }
//	        }
//	        return null;
//	    }
//	     
//	    public void saveResult(Operand operand) {
//	        operand.setOperand1(operand1);(counter.incrementAndGet());
//	        operations.add(operand);
//	    }
//	 
//	    public void updateUser(Operand user) {
//	        int index = operations.indexOf(user);
//	        operations.set(index, user);
//	    }
//	 
//	    public void deleteUserById(long id) {
//	         
//	        for (Iterator<Operand> iterator = operations.iterator(); iterator.hasNext(); ) {
//	        	Operand user = iterator.next();
//	            if (user.getId() == id) {
//	                iterator.remove();
//	            }
//	        }
//	    }
//	 
//	    public boolean isUserExist(Operand user) {
//	        return findByName(user.getName())!=null;
//	    }
//	 
//	    private static List<Operand> populateDummyUsers(){
//	        List<Operand> users = new ArrayList<Operand>();
//	        users.add(new Operand(counter.incrementAndGet(),"Sam",30, 70000));
//	        users.add(new Operand(counter.incrementAndGet(),"Tom",40, 50000));
//	        users.add(new Operand(counter.incrementAndGet(),"Jerome",45, 30000));
//	        users.add(new Operand(counter.incrementAndGet(),"Silvia",50, 40000));
//	        return users;
//	    }
//	 
//	    public void deleteAllUsers() {
//	        operations.clear();
//	    }
//
//		@Override
//		public Operand findByOperand1(Double operand1) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public Operand findByOperand2(String operand2) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public void saveResult(Operand operand) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void updateResult(Operand operand) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void deleteResultByoperand1(Double operand1) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public List<Operand> findAllResults() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public void deleteAllResults() {
//			// TODO Auto-generated method stub
//			
//		}
//
//}

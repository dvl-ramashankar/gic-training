package com.example.demo.dailytraining;

//Encapsulation and Exception
class Demo{
	    private int id;
	    private String empName;
	    private int empAge;

	    //Getter and Setter methods
	    public int getEmpid(){
	        return id;
	    }

	    public String getEmpName(){
	        return empName;
	    }

	    public int getEmpAge(){
	        return empAge;
	    }

	    public void setEmpAge(int newValue){
	        empAge = newValue;
	    }

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }

	    public void setEmpid(int newValue){
	        id = newValue;
	    }
	}
	public class  Day6part2 {
	    public static void main(String args[]){
	        Demo obj = new Demo();
	        try
	        {
	         obj.setEmpName("RK");
	         obj.setEmpAge(23);
	         obj.setEmpid(1);
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Enter the wrong format");
	        }
	        finally
	        {
	        	System.out.println("Finally block is executing...");
	        }
	        
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee id: " + obj.getEmpid());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 
	}


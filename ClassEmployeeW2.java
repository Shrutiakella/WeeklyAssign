package com.prodapt.WeeklyAssign;

public class ClassEmployeeW2 {
	String EmpName;
	int Age;
	String Designation;
	ClassEmployeeW2(String  a,int b,String c){
		EmpName=a;
		Age=b;
		Designation=c;
		
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "ClassEmployeeW2 [EmpName=" + EmpName + ", Age=" + Age + ", Designation=" + Designation + "]";
	}
	
	

}

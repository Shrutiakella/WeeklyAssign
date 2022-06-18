package com.prodapt.WeeklyAssign;

public class HRmanager {
	String a;
	int b;
	String c;
	public ClassEmployeeW2 Record_process(ClassEmployeeW2 EMP) {
		a = EMP.getEmpName();
		b = EMP.getAge();
		c = EMP.getDesignation();
		
		System.out.println();
		System.out.println("NAME -  " + a);
		System.out.println("AGE -  " + b);
		System.out.println("DESIGNATION -   " + c);
		
		return EMP;
		}
	




}

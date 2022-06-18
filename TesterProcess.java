package com.prodapt.WeeklyAssign;

public class TesterProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("These are details of employees");
		ClassEmployeeW2 emp = new ClassEmployeeW2("Shruti", 24,"Full Stack Developer");
		ClassEmployeeW2 emp1 = new ClassEmployeeW2("Plakki",26,"Web Designer");
		ClassEmployeeW2 emp2 = new ClassEmployeeW2("Navya",23,"Full Stack Developer");
		ClassEmployeeW2 emp3 =  new ClassEmployeeW2("Kagura",27,"Assistant Manager");
		ClassEmployeeW2 emp4 = new ClassEmployeeW2("Rikka",26,"Project Manager");
		HRmanager HR = new HRmanager();
		
		emp = HR.Record_process(emp);
		emp1 = HR.Record_process(emp1);
		emp2 = HR.Record_process(emp2);
		emp3 = HR.Record_process(emp3);
		emp4 = HR.Record_process(emp4);
		System.out.println("These are processed employee records");
		
	}

}

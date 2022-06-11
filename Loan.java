package com.prodapt.WeeklyAssign;

public class Loan {
	//static variables
	static int  Principalamount;
	static int Rate;
	static int Time;
	static int SimpleInterest;
	//method
	static void LoanDetails(int p,int t,int r) {
		 Principalamount = p;
		 Rate = r;
		 Time = t;
		 SimpleInterest = (p*t*r)/100;
		 System.out.println("The simple interest to be paid is " + SimpleInterest);
		 
		
		
		
	}

}

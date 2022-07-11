package com.codingassignment5;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BusinessLogic {
	 void insertdata() {
	        Session s = Helper.setUp();
	        ElectricShop a = new ElectricShop(1, "Bulb", 26);
	        ElectricShop b = new ElectricShop(2, "Tester", 15);
	        ElectricShop c = new ElectricShop(3, "Plug", 30);
	        ElectricShop d = new ElectricShop(4, "Switch", 55);
	        ElectricShop e = new ElectricShop(5, "LED Light", 150);
	        s.save(a);
	        s.save(b);
	        s.save(c);
	        s.save(d);
	        s.save(e);
	        System.out.println("Data Inserted!!!");
	        s.close();
	    }

	    void readdata() {
	        Session s = Helper.setUp();
	        Query q = s.createQuery("from ElectricShop");
	        List list = q.list();
	        ArrayList<ElectricShop> list1 = (ArrayList<ElectricShop>) q.list();
	        for (ElectricShop o : list1) {
	            System.out.println(o);
	        }
	        System.out.println("Products in Shop.......");
	    }

	    void updatedata() {
	        Session s = Helper.setUp();
	        Transaction t = s.beginTransaction();
	        Query q = s.createQuery("update ElectricShop set price=:p1 where id=:p2");
	        q.setParameter("p1", 100);
	        q.setParameter("p2", 5);
	        int status = q.executeUpdate();
	        System.out.println(status);
	        t.commit();
	        System.out.println("Data Updated!!!");
	        s.close();

	    }

	    void deletedata() {
	        Session s = Helper.setUp();
	        Transaction t = s.beginTransaction();
	        Query q = s.createQuery("delete ElectricShop where id=:p1");
	        q.setParameter("p1", 5);
	        int status = q.executeUpdate();
	        System.out.println(status);
	        t.commit();
	        System.out.println("Data Deleted!!!");
	        s.close();

	    }

	}



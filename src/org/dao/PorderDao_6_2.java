package org.dao;

import org.DBconn.DBConn_6_2;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Member_6_2;
import org.model.Porder_6_2;

public class PorderDao_6_2 {
	public static void add(Porder_6_2 p) {
		Session s=DBConn_6_2.getSession();
		Transaction tx=s.beginTransaction();
		s.save(p);
		tx.commit();
	}
	public static void main(String[] args) {
		Porder_6_2 p=new Porder_6_2("a", "A",2);
		PorderDao_6_2.add(p);
	}
}

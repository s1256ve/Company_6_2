package org.DBconn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConn_6_2 {
	public static Session getSession() {
		Configuration c=new Configuration().configure();
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		return s;
	}
	public static void main(String[] args) {
		System.out.println(DBConn_6_2.getSession());
	}
}

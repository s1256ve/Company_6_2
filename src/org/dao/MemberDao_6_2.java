package org.dao;

import java.util.List;

import org.DBconn.DBConn_6_2;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Member_6_2;

public class MemberDao_6_2 {
	public static Member_6_2 check(String name,String password) {
		String sql="Select * from member";
		Session s=DBConn_6_2.getSession();
		SQLQuery qry=s.createSQLQuery(sql);
		Member_6_2 m;
		qry.addEntity(Member_6_2.class);
		List list=qry.list();
		for(Object o:list) {
			m=(Member_6_2)o;
			System.out.println(m.getName()+","+m.getPassword());
			if(m.getName().equals(name)&&m.getPassword().equals(password)) {
				return m;
			}
		}
		return null;
	}
	public static void add(Member_6_2 m) {
		Session s=DBConn_6_2.getSession();
		Transaction tx=s.beginTransaction();
		s.save(m);
		tx.commit();
	}
	public static boolean checkId(String name,String password)
	{
		Session se=DBConn_6_2.getSession();
		
		String sql="select * from member where name='"+name+"' and password='"+password+"'";
		SQLQuery q=se.createSQLQuery(sql);
		
		q.addEntity("m", Member_6_2.class);
		List li=q.list();
		
		boolean b;
		
		
		if(li.size()!=0)
		{
			b=true;
			
			
		}
		else
		{
			b=false;
		}
		
		
		return b;
		
		
	}
	
	public static boolean checkId(String name)
	{
		Session se=DBConn_6_2.getSession();
		
		String sql="select * from member where name='"+name+"'";
		SQLQuery q=se.createSQLQuery(sql);
		
		q.addEntity("m", Member_6_2.class);
		List li=q.list();
		
		boolean b;
		
		
		if(li.size()!=0)
		{
			b=true;
			
			
		}
		else
		{
			b=false;
		}
		
		
		return b;
		
		
	}
	public static void main(String[] args) {
		Member_6_2 m=new Member_6_2("a", "a");
		MemberDao_6_2.add(m);
	}
}

package org.action;

import org.dao.MemberDao_6_2;
import org.model.Member_6_2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddMemberAction_6_2 extends ActionSupport{
	private String name,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String execute() throws Exception {
		MemberDao_6_2 md=(MemberDao_6_2)new ClassPathXmlApplicationContext("applicationContext.xml").getBean("MD");
		
		if(!md.checkId(name)) {
		Member_6_2 m=new Member_6_2(name, password);
		if(m!=null) {
			MemberDao_6_2.add(m);
			ActionContext.getContext().getSession().put("m", m);
			return "success";
		}
		}
		return "fail";
		
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

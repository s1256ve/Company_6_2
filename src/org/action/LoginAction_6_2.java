package org.action;

import org.dao.MemberDao_6_2;
import org.model.Member_6_2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction_6_2 extends ActionSupport{
	private String name,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String execute() throws Exception {
		Member_6_2 m=MemberDao_6_2.check(name, password);
		if(m!=null) {
			//MemberDao_6_2.add(m);
			ActionContext.getContext().getSession().put("m", m);
			return "success";
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

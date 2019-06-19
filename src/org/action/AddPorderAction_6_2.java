package org.action;

import org.dao.MemberDao_6_2;
import org.dao.PorderDao_6_2;
import org.model.Member_6_2;
import org.model.Porder_6_2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddPorderAction_6_2 extends ActionSupport{
	private String product;
	private Integer amount;

	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String execute() throws Exception {
		Member_6_2 m=(Member_6_2)ActionContext.getContext().getSession().get("m");
		Porder_6_2 p=new Porder_6_2(m.getName(),product,amount);
		if(p!=null) {
			
			PorderDao_6_2.add(p);
			ActionContext.getContext().getSession().put("p", p);
			return "success";
		}
		return "fail";
		
	}
	
}

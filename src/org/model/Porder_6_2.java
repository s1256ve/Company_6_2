package org.model;

public class Porder_6_2 {
	private Integer id,amount,sum;
	public Porder_6_2() {
		
	}
	
	public Porder_6_2( String name, String product,Integer amount) {
		super();
		this.amount = amount;
		this.name = name;
		this.product = product;
		if(product.equals("A"))sum=amount*100;
		if(product.equals("B"))sum=amount*110;
		if(product.equals("C"))sum=amount*120;
	}
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	private String name,product;
	
}

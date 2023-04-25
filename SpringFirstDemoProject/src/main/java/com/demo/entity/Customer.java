package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer 
{
    @Id
	private int custid;
	private String custname;
	private String custmail;
	private double custmobileno;
	private String custaddress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custid, String custname, String custmail, double custmobileno, String custaddress) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custmail = custmail;
		this.custmobileno = custmobileno;
		this.custaddress = custaddress;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustmail() {
		return custmail;
	}
	public void setCustmail(String custmail) {
		this.custmail = custmail;
	}
	public double getCustmobileno() {
		return custmobileno;
	}
	public void setCustmobileno(double custmobileno) {
		this.custmobileno = custmobileno;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	
	
	
}

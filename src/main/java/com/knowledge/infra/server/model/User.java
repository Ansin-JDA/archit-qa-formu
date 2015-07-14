package com.knowledge.infra.server.model;


public class User {
	
	
	private Integer userid;
	private String uname; 	
	private String  email ;
	private String  upassword;
	private String  udescription ;
	private String  ustaus;  
	private Integer uscore;
	private  String ulevel;
    
    public User(){}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUdescription() {
		return udescription;
	}

	public void setUdescription(String udescription) {
		this.udescription = udescription;
	}

	public String getUstaus() {
		return ustaus;
	}

	public void setUstaus(String ustaus) {
		this.ustaus = ustaus;
	}

	public Integer getUscore() {
		return uscore;
	}

	public void setUscore(Integer uscore) {
		this.uscore = uscore;
	}

	public String getUlevel() {
		return ulevel;
	}

	public void setUlevel(String ulevel) {
		this.ulevel = ulevel;
	}
     
    

}
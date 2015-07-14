package com.knowledge.infra.server.model;

public class Label {

	private Integer labelid;
	private String  labelname ;
    private String  ldecription;
    
    public Label(){}

	public Integer getLabelid() {
		return labelid;
	}

	public void setLabelid(Integer labelid) {
		this.labelid = labelid;
	}

	public String getLabelname() {
		return labelname;
	}

	public void setLabelname(String labelname) {
		this.labelname = labelname;
	}

	public String getLdecription() {
		return ldecription;
	}

	public void setLdecription(String ldecription) {
		this.ldecription = ldecription;
	}
    
    
	
	
}

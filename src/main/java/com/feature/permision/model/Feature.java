package com.feature.permision.model;

import javax.persistence.*;

@Entity
@Table(name = "FEATURE")
public class Feature {
	
	  @Column(name = "feature_name")
	 private String name;
	  @Column(name = "emailId")
	 private String emailId;
	
	  @Column(name = "enable")
	private boolean enable;
	
	  @Column(name = "canAccess")
	private boolean canAccess;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public boolean isEnable() {
		return enable;
	}


	public void setEnable(boolean enable) {
		this.enable = enable;
	}


	public boolean isCanAccess() {
		return canAccess;
	}


	public void setCanAccess(boolean canAccess) {
		this.canAccess = canAccess;
	}


	

}

package com.feature.permision.model;


public class Feature {
	
	 private String name;
	
	 private String emailId;
	
	
	private boolean enable;
	

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

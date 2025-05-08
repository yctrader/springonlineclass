package com.carcass.practice.utility;

public class ResponseStatus {
	private int errorcode;
	private String errorMessage;
	
	
	
	public ResponseStatus(int errorcode, String errorMessage) {
		super();
		this.errorcode = errorcode;
		this.errorMessage = errorMessage;
	}
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "ResponseStatus [errorcode=" + errorcode + ", errorMessage=" + errorMessage + "]";
	}
	
	
	
}

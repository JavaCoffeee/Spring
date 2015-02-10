package com.example.spring;

public class SpringException extends RuntimeException{
	String exceptionMsg;
	
	public SpringException(){}
	
	public SpringException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
}

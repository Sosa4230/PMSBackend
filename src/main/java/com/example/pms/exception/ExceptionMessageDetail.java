package com.example.pms.exception;

public class ExceptionMessageDetail {

	private String errorMessage;

	public ExceptionMessageDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionMessageDetail(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
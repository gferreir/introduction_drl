package com.myspace.introduction_drl;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreditInfo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String creditLevel;

	private java.lang.Integer timeInThatLevel;

	public CreditInfo() {
	}

	public java.lang.String getCreditLevel() {
		return this.creditLevel;
	}

	public void setCreditLevel(java.lang.String creditLevel) {
		this.creditLevel = creditLevel;
	}

	public java.lang.Integer getTimeInThatLevel() {
		return this.timeInThatLevel;
	}

	public void setTimeInThatLevel(java.lang.Integer timeInThatLevel) {
		this.timeInThatLevel = timeInThatLevel;
	}

	public CreditInfo(java.lang.String creditLevel,
			java.lang.Integer timeInThatLevel) {
		this.creditLevel = creditLevel;
		this.timeInThatLevel = timeInThatLevel;
	}

}
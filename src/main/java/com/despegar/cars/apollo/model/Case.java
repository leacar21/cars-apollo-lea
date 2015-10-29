package com.despegar.cars.apollo.model;


public class Case {
	
	private String code;
	private String name;
	private Navegable next;
	private IGuard guardToEvaluate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Navegable getNext() {
		return next;
	}

	public void setNext(Navegable next) {
		this.next = next;
	}

	public IGuard getGuardToEvaluate() {
		return guardToEvaluate;
	}

	public void setGuardToEvaluate(IGuard guardToEvaluate) {
		this.guardToEvaluate = guardToEvaluate;
	}
	
}
  
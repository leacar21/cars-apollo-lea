package com.despegar.cars.apollo.model;


public class Case {
	
	private Navegable next;
	private IGuard guardToEvaluate;

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
  
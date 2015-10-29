package com.despegar.cars.apollo.model;

import java.util.List;

public class Parallel {

	private List<Navegable> parallels;
	private Navegable next;
	
	public List<Navegable> getParallels() {
		return parallels;
	}
	public void setParallels(List<Navegable> parallels) {
		this.parallels = parallels;
	}
	public Navegable getNext() {
		return next;
	}
	public void setNext(Navegable next) {
		this.next = next;
	}
	
}

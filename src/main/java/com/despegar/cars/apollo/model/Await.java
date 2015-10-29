package com.despegar.cars.apollo.model;

public class Await {
	
	private long timmer; // in milisecondas
	private Navegable nextOnEvent;
	private Navegable nextOnTimeout;
	
	public long getTimmer() {
		return timmer;
	}
	public void setTimmer(long timmer) {
		this.timmer = timmer;
	}
	public Navegable getNextOnEvent() {
		return nextOnEvent;
	}
	public void setNextOnEvent(Navegable nextOnEvent) {
		this.nextOnEvent = nextOnEvent;
	}
	public Navegable getNextOnTimeout() {
		return nextOnTimeout;
	}
	public void setNextOnTimeout(Navegable nextOnTimeout) {
		this.nextOnTimeout = nextOnTimeout;
	}

}

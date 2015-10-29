package com.despegar.cars.apollo.model;

public class ThreadFlow implements Runnable {

	private Navegable navegable;
	private FlowInstance flowInstance;
	
	public ThreadFlow(FlowInstance flowInstance, Navegable navegable){
		this.flowInstance = flowInstance;
		this.navegable = navegable;
	}
	
	@Override
	public void run() {
		navegable.process(flowInstance);
	}

}

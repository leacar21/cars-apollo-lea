package com.despegar.cars.apollo.model;

import java.util.Timer;
import java.util.TimerTask;

public class Await extends Navegable {
	
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
	
	@Override
	protected boolean excecute(FlowInstance flowInstance) {
		
		Timer timer;
	    timer = new Timer();
	    
	    TimerTask task = new TimerTask() {

	        @Override
	        public void run() {
	        	nextOnTimeout.process(flowInstance);
	        }
        };
        // Empezamos dentro de 0ms y luego lanzamos la tarea cada 10000ms
	    timer.schedule(task, 0, 10000);
	    
		return true;
	}
	
}

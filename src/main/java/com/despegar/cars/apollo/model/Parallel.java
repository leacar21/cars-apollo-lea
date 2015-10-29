package com.despegar.cars.apollo.model;

import java.util.LinkedList;
import java.util.List;

public class Parallel extends Navegable {

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
	@Override
	protected boolean excecute(FlowInstance flowInstance) {
		
		// Se lanza cada Hilo
		List<Thread> threads = new LinkedList<Thread>();
		for(int i = 0; i < parallels.size(); i++) {
			Navegable navegable = parallels.get(i);
			ThreadFlow threadFlow = new ThreadFlow(flowInstance, navegable);
			Thread thread = new Thread(threadFlow, "T" + i);
			threads.add(thread);
			thread.start();
		}
		
		// Se espera a que finalizen todos los hilos
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		boolean result = this.next.process(flowInstance);
		
		return result;
	}
	
}

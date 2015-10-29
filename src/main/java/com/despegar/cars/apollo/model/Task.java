package com.despegar.cars.apollo.model;

public class Task extends Navegable {
	
	private Navegable next;
	private IAction action;

	public Navegable getNext() {
		return next;
	}

	public void setNext(Navegable next) {
		this.next = next;
	}

	public IAction getAction() {
		return action;
	}

	public void setAction(IAction action) {
		this.action = action;
	}

	@Override
	protected boolean excecute(FlowInstance flowInstance) {
		boolean excecute = action.excecute(this.getName(), flowInstance);
		
		if (excecute){
			if (this.next != null){
				excecute = this.next.excecute(flowInstance);
			}
		}
		
		return excecute;
	}
	
}

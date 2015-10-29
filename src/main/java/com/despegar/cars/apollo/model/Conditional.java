package com.despegar.cars.apollo.model;

import java.util.LinkedList;

public class Conditional extends Navegable {
	
	private LinkedList<Case> listCases;

	public LinkedList<Case> getListCases() {
		return listCases;
	}

	public void setListCases(LinkedList<Case> listCases) {
		this.listCases = listCases;
	}

	@Override
	protected boolean excecute(FlowInstance flowInstance) {
		
		for (Case c : listCases) {
			boolean result = c.getGuardToEvaluate().evaluate(flowInstance);
			if (result){
				return c.getNext().excecute(flowInstance);
			}
		}
		
		return false;
	}
	
}

package com.despegar.cars.apollo.model;

import java.util.Date;

public abstract class Navegable {
	
	private String code;
	private String name;
	
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
	
	public boolean process(FlowInstance flowInstance) {
		
		Date begin = new Date();
		
		// Se ejecuta la accion concreta
		boolean result = this.excecute(flowInstance);
		
		Date end = new Date();
		
		// =========== Checkpoint =====================================
		flowInstance.setActualNavigationCode(this.getCode());
		
		FlowHistoryEntry flowHistoryEntry = new FlowHistoryEntry();
		flowHistoryEntry.setBegin(begin);
		flowHistoryEntry.setEnd(end);
		flowHistoryEntry.setResult("" + result);
		if (flowInstance.getInitialFlowHistoryEntry() == null){
			flowInstance.setInitialFlowHistoryEntry(flowHistoryEntry);
		}
		else{
			FlowHistoryEntry flowHistoryEntryAux = flowInstance.getInitialFlowHistoryEntry();
			while (flowHistoryEntryAux.getNext() != null){
				flowHistoryEntryAux = flowHistoryEntryAux.getNext();
			}
			flowHistoryEntryAux.setNext(flowHistoryEntry);
		}
		
		// =============================================================
		
		// TODO: Salvar estado del Flow en Base
		
		return result;
	}
	
	protected abstract boolean excecute(FlowInstance flowInstance);
	
}

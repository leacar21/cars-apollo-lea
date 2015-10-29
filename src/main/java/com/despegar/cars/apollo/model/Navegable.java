package com.despegar.cars.apollo.model;

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
		
		// Se ejecuta la accion concreta
		boolean excecute = this.excecute(flowInstance);
		
		// =========== Checkpoint =====================================
		flowInstance.setActualNavigationCode(this.getCode());
		
		FlowHistoryEntry flowHistoryEntry = new FlowHistoryEntry();
		if (flowInstance.getInitialFlowHistoryEntry() == null){
			flowInstance.setInitialFlowHistoryEntry(flowHistoryEntry);
		}
		else{
			// TODO:  Mando a guardar recursivo
		}
		// =============================================================
		
		// TODO: Salvar estado del Flow en Base
		
		return excecute;
	}
	
	protected abstract boolean excecute(FlowInstance flowInstance);
	
}

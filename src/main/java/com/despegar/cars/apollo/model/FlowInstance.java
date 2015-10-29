package com.despegar.cars.apollo.model;

import java.util.Map;

public class FlowInstance {
	
	private String actualNavigationCode;
	private Flow flow;
	private Map<String, Variable> mapVariables;
	private FlowHistoryEntry initialFlowHistoryEntry;
	
	public String getActualNavigationCode() {
		return actualNavigationCode;
	}
	
	public void setActualNavigationCode(String actualNavigationCode) {
		this.actualNavigationCode = actualNavigationCode;
	}
	
	public Flow getFlow() {
		return flow;
	}

	public void setFlow(Flow flow) {
		this.flow = flow;
	}

	public Map<String, Variable> getMapVariables() {
		return mapVariables;
	}
	
	public void setMapVariables(Map<String, Variable> mapVariables) {
		this.mapVariables = mapVariables;
	}

	public FlowHistoryEntry getInitialFlowHistoryEntry() {
		return initialFlowHistoryEntry;
	}

	public void setInitialFlowHistoryEntry(FlowHistoryEntry initialFlowHistoryEntry) {
		this.initialFlowHistoryEntry = initialFlowHistoryEntry;
	}
	
}

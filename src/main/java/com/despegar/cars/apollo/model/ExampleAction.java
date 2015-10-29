package com.despegar.cars.apollo.model;

import java.util.Map;

public class ExampleAction implements IAction {

	@Override
	public boolean excecute(String name, FlowInstance flowInstance) {
		System.out.println(name);
		
		Map<String, Variable> mapVariables = flowInstance.getMapVariables();
		mapVariables.get("VARIABLE_1").setValue("OK");
		
		return true;
	}

}

package com.despegar.cars.apollo.model;

import java.util.Date;
import java.util.Map;

public class ExampleAction implements IAction {

	@Override
	public boolean excecute(String name, FlowInstance flowInstance) {
		System.out.println(name + " " + new Date());
		
		Map<String, Variable> mapVariables = flowInstance.getMapVariables();
		mapVariables.get("VARIABLE_1").setValue("OK");
		
		return true;
	}

}

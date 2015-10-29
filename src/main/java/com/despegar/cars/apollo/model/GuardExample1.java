package com.despegar.cars.apollo.model;

public class GuardExample1 implements IGuard{

	@Override
	public boolean evaluate(FlowInstance flowInstance) {
		Variable variable1 = flowInstance.getMapVariables().get("VARIABLE_1");
		if (variable1.equals("OK")){
			return true;
		}
		else{
			return false;
		}
	}

}

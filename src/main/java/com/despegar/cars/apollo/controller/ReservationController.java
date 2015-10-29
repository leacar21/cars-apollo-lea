package com.despegar.cars.apollo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.despegar.cars.apollo.model.ExampleAction;
import com.despegar.cars.apollo.model.Flow;
import com.despegar.cars.apollo.model.FlowInstance;
import com.despegar.cars.apollo.model.Task;
import com.despegar.cars.apollo.model.Variable;


@RestController
@RequestMapping("/reservation2")
public class ReservationController {

	@RequestMapping(value="", method = RequestMethod.GET)
	public String getReservation(){
		
		// ACTIONS
		ExampleAction exampleAction = new ExampleAction();
		
		
		// STATES
		Task task1 = new Task(); task1.setCode("TASK_1"); task1.setName("TASK 1");  task1.setAction(exampleAction);
		Task task2 = new Task(); task2.setCode("TASK_2"); task2.setName("TASK 2");  task2.setAction(exampleAction);
		Task task3 = new Task(); task3.setCode("TASK_3"); task3.setName("TASK 3");  task3.setAction(exampleAction);
		
		// TRANSITIONS
		task1.setNext(task2);
		task2.setNext(task3);
		
		// FLOW
		Flow flow = new Flow();
		flow.setName("FLOW_1");
		flow.setInitial(task1);
		
		//================================================================================
		
		// FLOW VARIABLES
		Map<String, Variable> mapVariables = new HashMap<String, Variable>();
		Variable variable1 = new Variable();
		Variable variable2 = new Variable();
		mapVariables.put("VARIABLE_1", variable1);
		mapVariables.put("VARIABLE_2", variable2);
		
		// FLOW_INSTANCE
		FlowInstance flowInstance = new FlowInstance();
		flowInstance.setActualNavigationCode("TASK_1");
		flowInstance.setFlow(flow);
		flowInstance.setMapVariables(mapVariables);
		
		flowInstance.getFlow().getInitial().process(flowInstance);
		
		return "OK";
	}
	
}

	
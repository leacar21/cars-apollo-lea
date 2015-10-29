package com.despegar.cars.apollo.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.despegar.cars.apollo.model.Case;
import com.despegar.cars.apollo.model.Conditional;
import com.despegar.cars.apollo.model.ExampleAction;
import com.despegar.cars.apollo.model.Flow;
import com.despegar.cars.apollo.model.FlowInstance;
import com.despegar.cars.apollo.model.GuardExample1;
import com.despegar.cars.apollo.model.GuardExample2;
import com.despegar.cars.apollo.model.Task;
import com.despegar.cars.apollo.model.Variable;


@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@RequestMapping(value="", method = RequestMethod.GET)
	public String getReservation(){
		
		// ACTIONS
		ExampleAction exampleAction = new ExampleAction();
		
		// GUARDS
		GuardExample1 guardExample1 = new GuardExample1();
		GuardExample2 guardExample2 = new GuardExample2();
		
		// CASES
		Case conditionalCase1 = new Case(); conditionalCase1.setGuardToEvaluate(guardExample1);
		Case conditionalCase2 = new Case(); conditionalCase2.setGuardToEvaluate(guardExample2);
		LinkedList<Case> listCases = new LinkedList<Case>();
		listCases.add(conditionalCase2);
		listCases.add(conditionalCase1);
		
		
		
		// CONDITIONALS
		Conditional conditional1 = new Conditional();
		conditional1.setListCases(listCases);
		
		// TASKS
		Task task1 = new Task(); task1.setCode("TASK_1"); task1.setName("TASK 1");  task1.setAction(exampleAction);
		Task task2 = new Task(); task2.setCode("TASK_2"); task2.setName("TASK 2");  task2.setAction(exampleAction);
		Task task3A = new Task(); task3A.setCode("TASK_3A"); task3A.setName("TASK 3A");  task3A.setAction(exampleAction);
		Task task3B = new Task(); task3B.setCode("TASK_3B"); task3B.setName("TASK 3B");  task3B.setAction(exampleAction);
		Task task4 = new Task(); task4.setCode("TASK_4"); task4.setName("TASK 4");  task4.setAction(exampleAction);
		
		// TRANSITIONS
		task1.setNext(task2);
		task2.setNext(conditional1);
		conditionalCase1.setNext(task3A);
		conditionalCase2.setNext(task3B);
		task3A.setNext(task4);
		task3B.setNext(task4);
		
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

	
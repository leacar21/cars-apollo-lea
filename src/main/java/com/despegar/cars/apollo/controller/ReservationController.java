package com.despegar.cars.apollo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@RequestMapping(value="", method = RequestMethod.GET)
	public String getReservation(){
		return "OK";
	}
	
}

	
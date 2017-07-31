package com.rohitbelapurkar.service.demo;

import java.util.ArrayList;
import java.util.List;


//This class is the service layer and is responsible for handling the data. This data is given back to the 
//controller 
public class WelcomeService {
	
	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>();
		
		//Add data to the list
		myWelcomeMessage.add("Hello! ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to the Spring demo");
		
		return myWelcomeMessage;
	}
}

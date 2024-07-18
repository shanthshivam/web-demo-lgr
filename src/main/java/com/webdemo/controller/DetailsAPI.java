package com.webdemo.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdemo.accessingdatamysql.Details;
import com.webdemo.accessingdatamysql.DetailsRepository;


@RestController
public class DetailsAPI {
	@Autowired
	private DetailsRepository detailsRepository;
	
	@GetMapping("/api/details")
	public List<Details>	getDetails() {

        Iterable<Details> iterable = detailsRepository.findAll();
        ArrayList<Details> returnList = new ArrayList<Details>();
        for( Details d : iterable){
            returnList.add(d);
        }
        
		return returnList;
	}
	
	
	@PostMapping("/api/details")
	public List<Details>	setDetails(@RequestBody Details userDetails) {

		// save it first
		detailsRepository.save(userDetails);
		
		// select all the details and return to the caller
        Iterable<Details> iterable = detailsRepository.findAll();
        ArrayList<Details> returnList = new ArrayList<Details>();
        for( Details d : iterable){
            returnList.add(d);
        }
        
		return returnList;
	}

}
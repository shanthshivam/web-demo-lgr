package com.webdemo.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webdemo.accessingdatamysql.Marks;
import com.webdemo.accessingdatamysql.MarksRepository;

@RestController

public class MarksAPI {
	@Autowired
	private MarksRepository marksRepository;
	
	@GetMapping("/marks")
	public List<Marks>	getMarks() {

        Iterable<Marks> iterable = marksRepository.findAll();
        ArrayList<Marks> returnList = new ArrayList<Marks>();
        for( Marks d : iterable){
            returnList.add(d);
        }
        
		return returnList;
	}

}
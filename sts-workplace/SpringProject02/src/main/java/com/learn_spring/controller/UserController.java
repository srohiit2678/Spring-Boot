package com.learn_spring.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class UserController {
	
	@GetMapping("/userName")
	public String getName()
	{
		return "Rohit Ojha";
	}

	@GetMapping("/items")
	public String getAllItems()
	{
		List<String> li = new ArrayList<>();
		li.add("1-Item");
		li.add("2-Item");
		li.add("3-Item");
		li.add("4-Item");
		li.add("5-Item");
		li.add("6-Item");
		li.add("7-Item");
		li.add("8-Item");
		li.add("9-Item");
		li.add("10-Item");
		
		return li.toString();
	}
	
	@GetMapping("/filters/{id}")
	public String getItemByPath(@PathVariable String id)
	{
		List<String> li = new ArrayList<>();
		li.add("1-Item");
		li.add("2-Item");
		li.add("3-Item");
		li.add("4-Item");
		li.add("5-Item");
		li.add("6-Item");
		li.add("7-Item");
		li.add("8-Item");
		li.add("9-Item");
		li.add("10-Item");
		
		if(id != null)
		{
			for(String s : li)
			{
				if(s.contains(id))
					return s;
			}
			return "No Match Found";
		}
		return li.toString();
	}
	
	@GetMapping("/filters/{id}/categori/{name}")
	public String getItemByPath(@PathVariable String id,@PathVariable String name)
	{
		List<String> li = new ArrayList<>();
		li.add("1-Item"); li.add("2-Item"); li.add("3-Item"); li.add("4-Item");
		li.add("5-Item"); li.add("6-Item"); li.add("7-Item"); li.add("8-Item");
		li.add("9-Item"); li.add("10-Item");
		
		List<String> service = new ArrayList<>();
		
		service.add("Frutes"); service.add("vegitables"); service.add("Protine");
		service.add("Electorics"); service.add("Cloths"); service.add("Beauty Products");
		service.add("Sports Hub"); service.add("Toys"); service.add("Home Services");
		service.add("Travlel");
		
		String  item = "";
		if(id != null)
		{
			for(String s1 : li)
			{
				if(s1.contains(id))
					item = s1;
			}
			for(String s2 : service)
			{
				if(s2.contains(name))
					return item +" --> "+ s2;
			}
			
			return "No Match Found";
		}
		return li.toString();
	}
	
	@PostMapping("/filters")
	public String getItem(@RequestParam(required = false)String id)
	{
		List<String> li = new ArrayList<>();
		li.add("1-Item");
		li.add("2-Item");
		li.add("3-Item");
		li.add("4-Item");
		li.add("5-Item");
		li.add("6-Item");
		li.add("7-Item");
		li.add("8-Item");
		li.add("9-Item");
		li.add("10-Item");
		
		if(id != null)
		{
			for(String s : li)
			{
				if(s.contains(id))
					return s;
			}
			return "No Match Found";
		}
		return li.toString();
	}
}

package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemRestController {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping(path="/allitems")
	public List<Item> getAllItem(){
		return itemRepository.findAll();
	}
	
}

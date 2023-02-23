package com.food.foodSpringApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.food.foodSpringApp.dto.FoodOrder;
import com.food.foodSpringApp.dto.Item;
import com.food.foodSpringApp.repository.FoodOrderRepo;
import com.food.foodSpringApp.repository.ItemRepo;

@RestController
@RequestMapping("/foodorder")
public class FoodOrderController {
	
	@Autowired
	FoodOrderRepo foodOrderRepo;
	
	@Autowired
	ItemRepo itemRepo;
	
	@PostMapping
	public FoodOrder saveFoodOrder(@RequestBody FoodOrder fd) {
		List<Item> listOfItmes = fd.getItems();
		List<Item> res = new ArrayList<>();
		if(listOfItmes.isEmpty()) {
			 fd = foodOrderRepo.save(fd);
		}else {
			fd = foodOrderRepo.save(fd);
			for(Item item: listOfItmes) {
				item.setFoodorder(fd);
				res.add(itemRepo.save(item));
			}
		}
		return fd;
	}
}

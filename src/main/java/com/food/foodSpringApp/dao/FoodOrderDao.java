package com.food.foodSpringApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.foodSpringApp.dto.FoodOrder;
import com.food.foodSpringApp.repository.FoodOrderRepo;
import com.food.foodSpringApp.repository.ItemRepo;


@Repository
public class FoodOrderDao {
	@Autowired
	ItemRepo itemRepo;
	
	@Autowired
	FoodOrderRepo foodOrderRepo;
	
	public FoodOrder saveFoodOrder(FoodOrder fd) {
		return foodOrderRepo.save(fd);
	}
	
	public Optional<FoodOrder> getFoodOrderById(int id){
		return foodOrderRepo.findById(id);
	}
	public List<FoodOrder> getAllFoodOrder(){
		return foodOrderRepo.findAll();
	}
	public FoodOrder updateFoodOrder(FoodOrder student) {
		return foodOrderRepo.save(student);
	}
	public void deleteFoodOrder(int id) {
		foodOrderRepo.deleteById(id);
	}
	
}

package com.sachin.R_Management_API.repository;

import com.sachin.R_Management_API.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<FoodItem,Long> {

}
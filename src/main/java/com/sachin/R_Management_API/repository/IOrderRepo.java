package com.sachin.R_Management_API.repository;

import com.sachin.R_Management_API.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<OrderEntity,Long> {
}
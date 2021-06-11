package com.project.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bootcamp.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}

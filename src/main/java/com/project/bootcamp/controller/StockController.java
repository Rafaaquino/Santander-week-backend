package com.project.bootcamp.controller;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bootcamp.model.dto.StockDTO;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<StockDTO> save(@RequestBody StockDTO dto) {
		return ResponseEntity.ok(dto);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> update(@RequestBody StockDTO dto) {
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StockDTO>> findAll() {
		List<StockDTO> list = new ArrayList<>();
		StockDTO dto = new StockDTO();
		dto.setId(1L);
		dto.setName("Ethereum");
		dto.setPrice((double) 12000);
		dto.setVariation((double) 7);
		dto.setDate(LocalDate.now());
		list.add(dto);
		return ResponseEntity.ok(list);
				
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<StockDTO> findAllById(@PathVariable Long id) {
		List<StockDTO> list = new ArrayList<>();
		StockDTO stock1 = new StockDTO();
		stock1.setId(1L);
		stock1.setName("Ethereum");
		stock1.setPrice((double) 12000);
		stock1.setVariation((double) 7);
		stock1.setDate(LocalDate.now());
		list.add(stock1);
		
		StockDTO stock2 = new StockDTO();
		stock2.setId(1L);
		stock2.setName("Cardano");
		stock2.setPrice((double) 100);
		stock2.setVariation((double) 10);
		stock2.setDate(LocalDate.now());
		list.add(stock2);
		
		StockDTO dtoSelected = list.stream().filter(x -> x.getId().compareTo(id)== 0 ).findFirst().get();
		return ResponseEntity.ok(dtoSelected);
	}

}

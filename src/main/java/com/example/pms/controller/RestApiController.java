package com.example.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pms.entity.Product;
import com.example.pms.repository.ProductRepository;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class RestApiController {

	@Autowired
	private ProductRepository repository;
	
	@PostMapping
	public ResponseEntity<Product> insertProduct(@RequestBody Product newProduct) {
		
		return ResponseEntity.of(Optional.of(this.repository.save(newProduct)));
		
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {
		
		return ResponseEntity.of(Optional.of(this.repository.findAll()));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) {
		
		try {
			Product user = this.repository.getReferenceById(id);
			return ResponseEntity.of(Optional.of(user));
		} catch (Exception e) {
			throw new RuntimeException("User ID not found!");
		}
		
	}
	
	@PutMapping
	public ResponseEntity<Product> updateProduct(@RequestBody Product updateProduct) {
		
		return ResponseEntity.of(Optional.of(this.repository.save(updateProduct)));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteProduct(@PathVariable int id) {
		
		this.repository.deleteById(id);
		return ResponseEntity.of(Optional.of(true));
		
	}
	
}
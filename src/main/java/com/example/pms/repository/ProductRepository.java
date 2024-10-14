package com.example.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pms.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {}
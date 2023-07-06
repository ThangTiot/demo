package com.example.demo.repository;

import com.example.demo.model.MProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MProductRepository extends JpaRepository<MProduct, Long> {
}

package com.example.demo.service;

import com.example.demo.model.MProduct;
import com.example.demo.repository.MProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MProductService {
    @Autowired
    MProductRepository mProductRepository;

    public Optional<MProduct> findByCourse(Long product_id) {
        return mProductRepository.findById(product_id);
    }
}

package com.example.demo.controller;

import com.example.demo.model.MProduct;
import com.example.demo.service.MProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class MProductController {
    @Autowired
    MProductService productService;

    @GetMapping("/findById")
    public ResponseEntity<Optional<MProduct>> findByCourse(@RequestParam Long course_id) {
        return new ResponseEntity<>(productService.findByCourse(course_id), HttpStatus.OK);
    }
}

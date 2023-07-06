package com.example.demo.controller;

import com.example.demo.model.Dto;
import com.example.demo.model.MCourse;
import com.example.demo.service.MCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/course")
public class MCourseController {
    @Autowired
    MCourseService mCourseService;

    @GetMapping("/")
    public ResponseEntity<List<MCourse>> findAll() {
        return new ResponseEntity<>(mCourseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Optional<MCourse>> findByID(@RequestParam("courseId") Long courseId) {
        return new ResponseEntity<>(mCourseService.findByID(courseId), HttpStatus.OK);
    }
}

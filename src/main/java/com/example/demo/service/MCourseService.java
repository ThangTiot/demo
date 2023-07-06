package com.example.demo.service;

import com.example.demo.model.MCourse;
import com.example.demo.repository.MCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MCourseService {
    @Autowired
    MCourseRepository mCourseRepository;

    public List<MCourse> findAll() {
        return mCourseRepository.findAll();
    }

    public Optional<MCourse> findByID(Long id) {
        return mCourseRepository.findById(id);
    }

}

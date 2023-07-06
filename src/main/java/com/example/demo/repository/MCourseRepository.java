package com.example.demo.repository;

import com.example.demo.model.Dto;
import com.example.demo.model.MCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public interface MCourseRepository extends JpaRepository<MCourse, Long> {
}

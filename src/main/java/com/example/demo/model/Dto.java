package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dto {
    private Long courseId;
    private String courseName;
    private Long productId;
    private String productName;
}

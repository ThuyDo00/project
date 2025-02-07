package com.hust.course.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private int id;
    private String name;
    private String description;
    private String art;
    private Integer status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public CategoryDTO(int id, String name, String description) {
    }
}

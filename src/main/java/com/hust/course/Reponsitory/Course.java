package com.hust.course.Reponsitory;

import com.hust.course.Model.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Course extends JpaRepository<CourseEntity, Integer> {
}

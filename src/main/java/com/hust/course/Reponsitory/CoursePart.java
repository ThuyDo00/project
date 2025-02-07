package com.hust.course.Reponsitory;

import com.hust.course.Model.entity.CoursePartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursePart extends JpaRepository<CoursePartEntity, Integer> {
}

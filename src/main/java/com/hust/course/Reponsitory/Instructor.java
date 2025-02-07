package com.hust.course.Reponsitory;


import com.hust.course.Model.entity.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Instructor extends JpaRepository<InstructorEntity, Integer> {
}

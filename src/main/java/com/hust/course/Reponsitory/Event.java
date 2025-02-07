package com.hust.course.Reponsitory;

import com.hust.course.Model.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Event extends JpaRepository<EventEntity, Integer> {
}

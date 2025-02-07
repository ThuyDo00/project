package com.hust.course.Reponsitory;

import com.hust.course.Model.entity.RatingCommentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingComment extends JpaRepository<RatingCommentsEntity, Integer> {
}

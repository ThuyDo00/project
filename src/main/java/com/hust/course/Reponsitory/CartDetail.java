package com.hust.course.Reponsitory;

import com.hust.course.Model.entity.CartDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDetail extends JpaRepository<CartDetailEntity, Integer> {
}

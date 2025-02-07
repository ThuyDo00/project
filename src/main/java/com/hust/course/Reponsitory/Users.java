package com.hust.course.Reponsitory;

import com.hust.course.Model.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Users extends JpaRepository<UsersEntity, Integer> {
}

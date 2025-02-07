package com.hust.course.Service.Impl;

import com.hust.course.Model.entity.CategoriesEntity;
import com.hust.course.Reponsitory.CategoryRepository;
import com.hust.course.Service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<CategoriesEntity> getAll() {
        return this.categoryRepository.findAll();
    }

    @Override
    public boolean creat(CategoriesEntity categories) {
        try {
            CategoriesEntity savecategory = this.categoryRepository.save(categories);
            return savecategory != null;
        }catch (Exception e){
            e.printStackTrace();
        }
    return false;
    }

    @Override
    public CategoriesEntity findById(Integer id) {
        return null;
    }

    @Override
    public Boolean update(CategoriesEntity categories) {
        return null;
    }

    @Override
    public Boolean delete(CategoriesEntity categories) {
        return null;
    }
}

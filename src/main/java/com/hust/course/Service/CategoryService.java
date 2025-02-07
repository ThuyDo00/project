package com.hust.course.Service;


import com.hust.course.Model.entity.CategoriesEntity;

import java.util.List;

public interface CategoryService {
    // validate dữ liệu
    List<CategoriesEntity> getAll();
    // thêm mới
    boolean creat(CategoriesEntity categories);
    // tìm kiếm theo id
    CategoriesEntity findById(Integer id);
    // update
    Boolean update(CategoriesEntity categories);
    // xóa
    Boolean delete(CategoriesEntity categories);

}

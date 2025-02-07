package com.hust.course.Controller.Admin;

import com.hust.course.Model.dto.CategoryDTO;
import com.hust.course.Model.entity.CategoriesEntity;
import com.hust.course.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class CourseList {
    @Autowired
    private final CategoryService categoryService;

    public CourseList(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/courselist")
    public String admincourselist(Model model){
        List<CategoriesEntity> list = this.categoryService.getAll();
        model.addAttribute("data", list);
        model.addAttribute("title", "Quản lí danh sách khóa học");
        return "/admin/courselist";
    }


    @GetMapping("/create")
    public String create(Model model){
        CategoriesEntity categories = new CategoriesEntity();
        model.addAttribute("data1", categories);
        return "/admin/addcourselist";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute("data1") CategoriesEntity category){
        if (this.categoryService.creat(category)){
            return "redirect:/admin/addcourselist";
        }else {
            return "/admin/addcourselist";
        }
    }
}

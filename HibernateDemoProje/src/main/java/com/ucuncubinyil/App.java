package com.ucuncubinyil;

import com.ucuncubinyil.entity.Category;
import com.ucuncubinyil.service.CategoryService;

public class App {
    public static void main(String[] args) {

        CategoryService categoryService = new CategoryService();

//        Category category = new Category();
//        category.setName("Bilim Kurgu");
//
//        categoryService.addCategory(category);
        for (Category allCategory : categoryService.findAllCategories()) {
            System.out.println(allCategory.getId());
            System.out.println(allCategory.getName());
        }

    }
}

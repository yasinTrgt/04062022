package com.ucuncubinyil.service;

import com.ucuncubinyil.dao.impl.CategoryDaoImpl;
import com.ucuncubinyil.entity.Category;

import java.util.List;

public class CategoryService {

    CategoryDaoImpl categoryDao = new CategoryDaoImpl();

    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    public List<Category> findAllCategories() {
        return categoryDao.findAllCategories();
    }

    public void deleteCategory(Category category) {
        categoryDao.deleteCategory(category);
    }

    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }
}

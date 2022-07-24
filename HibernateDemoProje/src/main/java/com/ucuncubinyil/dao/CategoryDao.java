package com.ucuncubinyil.dao;

import com.ucuncubinyil.entity.Category;

import java.util.List;

public interface CategoryDao {

    public void addCategory(Category category);

    public List<Category> findAllCategories();

    public void deleteCategory(Category category);

    public void updateCategory(Category category);
}

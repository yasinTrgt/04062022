package com.ucuncubinyil.dao.impl;

import com.ucuncubinyil.dao.CategoryDao;
import com.ucuncubinyil.entity.Category;
import com.ucuncubinyil.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {


    @Override
    public void addCategory(Category category) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(category);
            transaction.commit();
            session.close();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public List<Category> findAllCategories() {

        List<Category> categoryList = new ArrayList<Category>();

        try {
            Session session =  HibernateUtil.getSessionFactory().openSession();
            String hql = "Select category FROM Category category";
            Query query = session.createQuery(hql);
            categoryList = query.list();
            session.close();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        return categoryList;

    }

    @Override
    public void deleteCategory(Category category) {

        Category deletedCategory = new Category();

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            deletedCategory = (Category) session.get(Category.class, category.getId());
            session.delete(deletedCategory);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateCategory(Category category) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Category selectedCategory = session.get(Category.class, category.getId());
            selectedCategory.setName(category.getName());
            session.update(selectedCategory);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

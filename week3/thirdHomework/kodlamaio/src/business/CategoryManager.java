package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.CourseDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    List<Category> categories = new ArrayList<Category>();

    public void addCategory(Category category) throws Exception {
        for(Category c : categories) {
           if(c.getCategoryName() == category.getCategoryName()) {
               throw new Exception("Category name already exists.");
           }
        }
        categories.add(category); //push to ArrayList
        categoryDao.addCategory(category);

        for(Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
        System.out.println("----------------");
    }
}

package dataAccess;

import entities.Category;
import entities.Course;

public class HibernateCourseDao implements CourseDao, CategoryDao {
    @Override
    public void add(Course course) {
        System.out.println("Course w Hibernate: " + course.getCourseName());
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Category w Hibernate: " + category.getCategoryName());
    }
}

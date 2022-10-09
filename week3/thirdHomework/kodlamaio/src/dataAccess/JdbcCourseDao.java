package dataAccess;

import entities.Category;
import entities.Course;

public class JdbcCourseDao implements CourseDao, CategoryDao {
    @Override
    public void add(Course course) {
        System.out.println("Course w JDBC: " + course.getCourseName());
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Category w JDBC: " + category.getCategoryName());
    }
}

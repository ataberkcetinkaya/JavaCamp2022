import business.CategoryManager;
import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course(1, "JAVA", 100);
        Course course2 = new Course(2, "JavaScript", 101);
        Course course3 = new Course(3, "Python", 102);

        Logger[] loggers = {new DatabaseLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);

        courseManager.add(course);
        courseManager.add(course2);
        courseManager.add(course3);

        //////////////////////////////////////////////////////

        Category category = new Category(1, "Backend");
        Category category1 = new Category(2, "Frontend");

        CategoryManager categoryManager = new CategoryManager(new JdbcCourseDao(), loggers);

        categoryManager.addCategory(category);
        categoryManager.addCategory(category1);

    }
}
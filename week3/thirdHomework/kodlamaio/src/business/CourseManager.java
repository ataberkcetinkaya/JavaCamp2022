package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    List<Course> courses = new ArrayList<Course>(); //creating list array for courses w type of course

    public void add(Course course) throws Exception { //add method to check the min. price for 0
       if(course.getPrice() < 0) {
           System.out.println("Price must be at least 0.");
       }
       for(Course s : courses) { //w for loop in courses array and check if any of them matches w the new course name from main
           if(s.getCourseName() == course.getCourseName()) {
               throw new Exception("Course name already exists.");
           }
       }
       courses.add(course); //push to ArrayList
       courseDao.add(course);

       for(Logger logger : loggers) {
           logger.log(course.getCourseName());
       }
       System.out.println("----------------");

    }
}

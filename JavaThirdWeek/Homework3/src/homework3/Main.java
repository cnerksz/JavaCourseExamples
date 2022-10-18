package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.business.InstructorManager;
import homework3.core.logging.DataBaseLogger;
import homework3.core.logging.FileLogger;
import homework3.core.logging.Logger;
import homework3.core.logging.MailLogger;
import homework3.dataAccess.HibernateCourseDao;
import homework3.dataAccess.JdbcCategoryDao;
import homework3.dataAccess.JdbcInstructorDao;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
	List<Logger> logger = new ArrayList<Logger>(Arrays.asList(new DataBaseLogger(),new FileLogger(),new MailLogger()));
	Category category=new Category(1,"Programlama","Engin Demiroğ");
	CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), logger);
	categoryManager.add(category);
	Course course=new Course(1,"Yazılım Yetiştirici Eğitim Kampı",0);
	CourseManager courseManager=new CourseManager(new HibernateCourseDao(), logger);
	courseManager.add(course);
	Instructor instructor=new Instructor(1,"Engin Demiroğ");
	InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(), logger);
	instructorManager.add(instructor);
	

	}

}

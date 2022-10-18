package homework3.business;

import java.util.ArrayList;
import java.util.List;

import homework3.core.logging.Logger;
import homework3.dataAccess.CourseDao;
import homework3.entities.Course;

public class CourseManager {
CourseDao courseDao;
List<Logger> loggers=new ArrayList<>();
public CourseManager(CourseDao courseDao, List<Logger> loggers) {
	this.courseDao = courseDao;
	this.loggers = loggers;
}
List<Course> courses=new ArrayList<>();
public void add(Course course)throws Exception {

		if(courses.contains(course))
			throw new Exception("Kurs ismi tekrar edemez!!!");
		if(course.getPrice()<0)throw new Exception("Kurs Fiyatı 0 dan küçük olamaz!!!");
		
	courses.add(course);
	courseDao.add(course);
	for (Logger logger:loggers) {
		logger.log(course.getName());
	}
}
}

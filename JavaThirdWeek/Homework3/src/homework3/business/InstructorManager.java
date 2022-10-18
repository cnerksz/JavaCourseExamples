package homework3.business;

import java.util.ArrayList;
import java.util.List;

import homework3.core.logging.Logger;
import homework3.dataAccess.InstructorDao;
import homework3.entities.Instructor;

public class InstructorManager {
InstructorDao instructorDao;
List<Logger> loggers=new ArrayList<>();
public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
	this.instructorDao = instructorDao;
	this.loggers = loggers;
}
public void add(Instructor instructor){
	instructorDao.add(instructor);
	for (Logger logger:loggers) {
		logger.log(instructor.getName());
	}
	
}
}

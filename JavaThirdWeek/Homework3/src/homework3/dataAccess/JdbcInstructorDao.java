package homework3.dataAccess;

import homework3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
@Override
public void add(Instructor instructor) {
	System.out.println("Eğitmen JDBC ile veri tabanına eklendi");	
}
}

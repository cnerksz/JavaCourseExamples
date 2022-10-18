package homework3.entities;

public class Category extends Base {

	private String instructor;

	public Category(int id, String name, String instructor) {
		super(id,name);
		this.instructor = instructor;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	}



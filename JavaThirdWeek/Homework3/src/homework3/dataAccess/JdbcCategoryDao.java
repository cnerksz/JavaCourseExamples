package homework3.dataAccess;

import homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
@Override
public void add(Category category) {
	System.out.println("Kategori JDBC ile veri tabanına eklendi");	
}
}

package homework3.dataAccess;

import homework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	@Override
	public void add(Category category) {
		System.out.println("Kategori hibernate ile veri tabanına eklendi");	
	}
}

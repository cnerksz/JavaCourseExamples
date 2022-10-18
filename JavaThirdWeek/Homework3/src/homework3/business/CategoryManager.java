package homework3.business;

import java.util.ArrayList;
import java.util.List;

import homework3.core.logging.Logger;
import homework3.dataAccess.CategoryDao;
import homework3.entities.Category;

public class CategoryManager {
CategoryDao categoryDao;
List<Logger> loggers=new ArrayList<>();
public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
	this.categoryDao = categoryDao;
	this.loggers = loggers;
}
List<Category> categorys=new ArrayList<>();
public void add(Category category) throws Exception {
		if(categorys.contains(category)) throw new Exception("Kategori ismi tekrar edemez!!!");
		
		
	
	categorys.add(category);
	categoryDao.add(category);
	for (Logger logger:loggers) {
		logger.log(category.getName());
	}
	
	
}
}

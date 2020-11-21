package net.stlc.onlineshopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.stlc.onlineshopbackend.dao.CategoryDAO;
import net.stlc.onlineshopbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {
	 
	public static List<Category> categories = new ArrayList<>();

	static
	{
		// adding first category
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Television");
		category.setImgageURL("CAT_1.png");
		categories.add(category);
		
		// adding second category
				category = new Category();
				category.setId(2);
				category.setName("Mobile");
				category.setDescription("This is Mobile");
				category.setImgageURL("CAT_2.png");
				categories.add(category);
		
				// adding third category
			category = new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is Laptop");
				category.setImgageURL("CAT_2.png");
				categories.add(category);
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}

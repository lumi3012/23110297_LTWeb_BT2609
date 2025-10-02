package graphQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graphQL.entity.Category;
import graphQL.repository.CateRepo;

@Service
public class CategoryService {

	@Autowired
	private CateRepo cateRepo;

	public List<Category> findAll() {
		return cateRepo.findAll();
	}

	public Category findById(Long id) {
		return cateRepo.findCateById(id);
	}

	public Category addCategory(Category c) {
		Category c = new Category();
		c.setName(name);
		c.setImages(image);
		return cateRepo.save(c);
	}

	public boolean deleteCategory(Long id) {
		if (cateRepo.existsById(id)) {
			cateRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
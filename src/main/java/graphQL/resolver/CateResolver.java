package graphQL.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import graphQL.entity.Category;
import graphQL.service.CategoryService;

@Component
public class CateResolver implements GraphQLQueryResolver {

	@Autowired
    private CategoryService categoryService;

    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

    public Category addCategory(String name, String image) {
        return categoryService.addCategory(name, image);
    }

    public boolean deleteCategory(int id) {
        return categoryService.deleteCategory(id);
    }
}

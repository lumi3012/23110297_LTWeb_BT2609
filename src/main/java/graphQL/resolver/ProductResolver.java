package graphQL.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import graphQL.entity.Product;
import graphQL.service.ProductService;

@Component
public class ProductResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
	// Implement query methods here
	@Autowired
	private ProductService productService;

	public List<Product> getProductsSortedByPrice() {
		return productService.findAllSortedByPrice();
	}

	public Product addProduct(String title, int quantity, String desc, float price, int userId) {
		return productService.addProduct(title, quantity, desc, price, userId);
	}

	public Product updateProduct(Long id, String title, Integer quantity, String desc, Float price) {
		return productService.updateProduct(id, title, quantity, desc, price);
	}

	public Boolean deleteProduct(Long id) {
		return productService.deleteProduct(id);
	}
}

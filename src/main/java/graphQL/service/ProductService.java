package graphQL.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graphQL.entity.Product;
import graphQL.entity.User;
import graphQL.repository.ProductRepo;
import graphQL.repository.UserRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private UserRepo userRepo;

	public List<Product> findAllSortedByPrice() {
		return productRepo.findAll().stream().sorted(Comparator.comparing(Product::getPrice)).toList();
	}

	public Product addProduct(String title, int quantity, String desc, float price, int userId) {
		Product p = new Product();
		p.setTitle(title);
		p.setQuantity(quantity);
		p.setDesc(desc);
		p.setPrice(price);

		User user = userRepo.findById(userId).orElse(null);
		p.setUser(user);

		return productRepo.save(p);
	}

	public Product updateProduct(Long id, String title, Integer quantity, String desc, Float price) {
		Product p = productRepo.findById(id).orElse(null);
		if (p != null) {
			if (title != null)
				p.setTitle(title);
			if (quantity != null)
				p.setQuantity(quantity);
			if (desc != null)
				p.setDesc(desc);
			if (price != null)
				p.setPrice(price);
			return productRepo.save(p);
		}
		return null;
	}

	public boolean deleteProduct(Long id) {
		if (productRepo.existsById(id)) {
			productRepo.deleteById(id);
			return true;
		}
		return false;
	}

}

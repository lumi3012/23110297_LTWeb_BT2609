package graphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import graphQL.entity.Category;

public interface CateRepo extends JpaRepository<Category, Long> {

	Category findCateById(Long id);

	boolean existsById(Long id);

	void deleteById(Long id);


}

package graphQL.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import graphQL.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	Optional<User> findById(int id);

	boolean existsById(int id);

	void deleteById(int id);

}

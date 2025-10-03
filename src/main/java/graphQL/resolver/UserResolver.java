package graphQL.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import graphQL.entity.User;
import graphQL.service.UserService;

@Component
public class UserResolver implements GraphQLQueryResolver {
	@Autowired
	private UserService userService;


	public List<User> getAllUsers() {
	return userService.findAll();
	}


	public User addUser(String fullname, String username, String password, String email, String phone, String role, String avatar) {
	return userService.addUser(fullname, username, password, email, phone, role, avatar);
	}


	public boolean deleteUser(int id) {
	return userService.deleteUser(id);
	}
}

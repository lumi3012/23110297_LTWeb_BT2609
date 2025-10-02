package graphQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graphQL.entity.User;
import graphQL.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public List<User> findAll() {
		return userRepo.findAll();
	}

	public User findById(int id) {
		return userRepo.findById(id).orElse(null);
	}

	public User addUser(User u) {
		User u = new User();
        u.setFullname(fullname);
        u.setUsername(username);
        u.setPassword(password);
        u.setEmail(email);
        u.setPhone(phone);
        return userRepo.save(u);
	}

	public boolean deleteUser(int id) {
		if (userRepo.existsById(id)) {
			userRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
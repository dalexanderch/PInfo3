package ch.unige.pinfo.classads.service;

import java.util.List;
import java.util.Optional;

import ch.unige.pinfo.classads.model.User;

public interface UserService {
	
	public boolean createUser(User u);
	
	public List<User> getAll();
	
	public Optional<User> getByName(String name);
	
	public Optional<User> getById(long id);
	
	public void deleteUser(User user);
}

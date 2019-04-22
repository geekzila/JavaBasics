/**
 * 
 */
package com.geekzila.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.demo.model.User;
import com.geekzila.demo.service.UserService;

/**
 * @author kloudone
 *
 */
public class UserServiceImpl implements UserService {

	// Database, File, storage mechanism
	private static List<User> users = new ArrayList<User>();

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		users.add(new User("Rakesh"));
		users.add(new User("Ariv"));
	}

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User get(String name) {
		for (User user: users) {
			if(user.getName().equals(name)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		User userFromDb = get(name);
		users.remove(userFromDb);
	}
}

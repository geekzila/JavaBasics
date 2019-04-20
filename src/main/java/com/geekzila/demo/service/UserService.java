/**
 * 
 */
package com.geekzila.demo.service;

import java.util.List;

import com.geekzila.demo.model.User;

/**
 * @author kloudone
 *
 */
public interface UserService {

	public void add(User user);
	
	public List<User> findAll();
	
	public User get(String name);
	
	public void delete(String name);
	
	public User update(User user);
}

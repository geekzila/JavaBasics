/**
 * 
 */
package com.geekzila.demo;

import java.util.List;

import com.geekzila.demo.model.User;
import com.geekzila.demo.service.UserService;
import com.geekzila.demo.service.impl.UserServiceImpl;

/**
 * @author kloudone
 *
 */
public class DemoApplication {

	public static void main(String[] args) {
		
		UserService userService = new UserServiceImpl();
		// 2
		List<User> users = userService.findAll();
		
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			System.out.println("Name: " + user.getName());
		}
		
		System.out.println("-----------Before adding Rajni-------------");
		
		User rajnikanth = new User("rajnikanth");
		userService.add(rajnikanth);
		
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			System.out.println("Name: " + user.getName());
		}
		System.out.println("==============================================");
		User rakesh = userService.get("Rakesh");
		System.out.println("Get method: " + rakesh.getName());
		
		System.out.println("========== Remove the user ===================");
		userService.delete("rajnikanth");
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			System.out.println("Name: " + user.getName());
		}
	}
}

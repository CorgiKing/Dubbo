package org.corgiking.api;

import org.corgiking.UserService;
import org.corgiking.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserApi {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/id/{id}")
	public User getUser(@PathVariable Integer id){
		User u = userService.getUserById(id);
		return u;
	}
	
}

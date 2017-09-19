package org.corgiking.service;

import org.corgiking.UserService;
import org.corgiking.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	public User getUserById(int id) {
		User u = new User();
		u.setId(1);
		u.setName("Corgi King");
		u.setAge(18);
		u.setSex(0);
		
		return u;
	}

}

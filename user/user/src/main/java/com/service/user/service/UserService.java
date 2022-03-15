package com.service.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.user.model.User;
import com.service.user.repository.UserRepository;

@Service
public class UserService {
   @Autowired
	private UserRepository userRepository;

	public boolean checklogin(User user) {
		List<User> userList=(List<User>) userRepository.findAll(); 
		for(User element:userList) {
			 if (element.getUserName().equals(user.getUserName())) {
				 if(element.getPassword().equals(user.getPassword()))
					  return true;
			 }
		}
		return false;
	}

	public boolean create(User user) {
		User savedUser= userRepository.save(user);
		if( savedUser != null)
			return true;
		return false;
	}

}

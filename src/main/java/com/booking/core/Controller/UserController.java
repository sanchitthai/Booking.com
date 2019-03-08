package com.booking.core.Controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.core.model.User;
import com.booking.core.repository.UserRepository;

@RestController
@RequestMapping("/userDetail")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/alluser")
	public List<User> getAllUser() {
	    return userRepository.findAll();
	}
	
	@PostMapping("/user")
	public User createUser(@Valid @RequestBody User user) {
	    return userRepository.save(user);
	}

}

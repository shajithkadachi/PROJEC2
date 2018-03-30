/**
 * 
 */
package com.db.mysql;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shajithkadachi
 *
 */
@Controller
@RequestMapping(path="/user")
public class MainController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/add")
	
	public @ResponseBody String addUser(@RequestParam String firstName, @RequestParam String lasttName,
			@RequestParam String mobileNumber,@RequestParam String homeumber,@RequestParam String email,
			@RequestParam Date dateOfBirth) {
		
		User user = new User();
		user.setFirstName(firstName);
		user.setLasttName(lasttName);
		user.setMobileNuber(mobileNumber);
		user.setHomeumber(homeumber);
		user.setEmail(email);
		user.setDateOfBirth(dateOfBirth);
		
		userRepository.save(user);
		
		return "Data Saved";
	}

}

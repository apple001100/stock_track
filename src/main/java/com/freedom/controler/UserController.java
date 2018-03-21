package com.freedom.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.freedom.entity.User;
import com.freedom.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
    @RequestMapping(value="/{userId}",method=RequestMethod.GET)
    public User selectByPrimaryKey(@PathVariable("userId") Integer userId){
		User user = userService.selectByPrimaryKey(userId);
		System.out.println(user.toString());
        return user;
    }
	
	@ResponseBody
    @RequestMapping(value="/users",method=RequestMethod.GET)
    public List<User> selectAllUsers(){
		List<User> users = userService.selectAllUsers();
		System.out.println(users);
        return users;
    }
}

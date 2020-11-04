package com.linekirkhus.adressbook.controller;

import com.linekirkhus.adressbook.model.User;
import com.linekirkhus.adressbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.FileNotFoundException;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("{/}")
	public String home(){
		return "home";
	}

	@GetMapping("/index")
	public String addressBookIndex(){
		return "index";
	}

	@RequestMapping ("/login")
	public String loginUser ( ) {
		return "login";
	}

	@GetMapping ("/register")
	public ModelAndView register ( ModelAndView modelAndView ) throws FileNotFoundException {
		User user = new User ();
		modelAndView.addObject ( "user" , user );
		modelAndView.setViewName ( "register" );
		return modelAndView;
	}

	@PostMapping ("/register")
	public ModelAndView register ( ModelAndView modelAndView , @ModelAttribute (value = "user") @Valid User user , BindingResult result ) throws InterruptedException {
		User exists = userService.findByEmail ( user.getEmail () );
		if ( exists != null ) {
			result.rejectValue ( "email" , "There is already an account with that email" );
		}
		if ( result.hasErrors () ) {
			modelAndView.setViewName ( "register" );
		} else {
			userService.register ( user );
			//modelAndView.addObject ( "successMessage", "User has successfully registered" );
			modelAndView.addObject ( "user" , new User () );
			userService.save ( user );
			modelAndView.setViewName ( "redirect:/login" );
		}

		return modelAndView;
	}

	@RequestMapping ("logout")
	public String logout ( ) {
		return "redirect:/";
	}
}

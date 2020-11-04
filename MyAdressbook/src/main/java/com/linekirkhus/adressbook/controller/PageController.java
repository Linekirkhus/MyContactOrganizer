package com.linekirkhus.adressbook.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@Value ("${message.error.forbidden}")
	private String accessDeniedMessage;
	//@Value ("${message.error.server}")
	//private String serverErrorMessage;



	@GetMapping("/403")
	ModelAndView accessDenied(ModelAndView modelAndView){
		modelAndView.getModel ().put ( "message", accessDeniedMessage );
		modelAndView.setViewName ( "message" );
		return modelAndView;
	}
	/*
	@GetMapping("/500")
	ModelAndView serverError(ModelAndView modelAndView){
		modelAndView.getModel ().put ( "message", serverErrorMessage );
		modelAndView.setViewName ( "message" );
		return modelAndView;
	}

	 */


}

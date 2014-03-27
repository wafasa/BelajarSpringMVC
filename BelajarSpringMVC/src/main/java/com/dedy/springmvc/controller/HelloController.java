package com.dedy.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class HelloController {
	
@RequestMapping("/")

public String printHelloWorld(Model model){
	
	model.addAttribute("message","Hello World !");
	return "helloWorld";
	}

}

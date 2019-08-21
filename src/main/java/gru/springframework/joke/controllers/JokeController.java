package gru.springframework.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gru.springframework.joke.services.JokeService;

@Controller
public class JokeController {
	
	@Autowired
	private JokeService jokeservice;
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke",jokeservice.getJoke());
		
		
		return "chucknorris";
		 
		
	}

}

package com.jojoldu.webservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebRestController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("hello", "Hi Daehan!");
		return "index";
	}

	@GetMapping("/{name}")
	public String index(@PathVariable String name, Model model) {
		model.addAttribute("hello", new StringBuffer("Hi ").append(name).append("!!!"));
		return "index";
	}
	
	
}

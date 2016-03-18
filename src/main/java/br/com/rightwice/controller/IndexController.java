package br.com.rightwice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/")
	public String index(){
		return "Richtwice Project by Ricardo Davanço Freire";
	}

}

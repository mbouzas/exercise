package com.sword.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//test
@Controller
public class StaticController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
	    return "index.html";
	}

}

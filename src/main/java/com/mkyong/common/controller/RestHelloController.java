package com.mkyong.common.controller;

import com.mkyong.common.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/restMovie")
public class RestHelloController {
	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody
	Movie printWelcome(@PathVariable String name) {
		System.out.println("name = " + name);
		return new Movie(name);
	}
}
package com.mkyong.common.controller;

import com.mkyong.common.model.Movie;
import com.mkyong.common.service.FileSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	FileSystemService fileSystemService;

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity<Movie> get(@PathVariable String name) throws IOException {
		return new ResponseEntity<>(fileSystemService.findByName(name), HttpStatus.OK);
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public @ResponseBody
	void save(@RequestBody Movie movie) {
		fileSystemService.save(movie);
	}

	@RequestMapping(value = "mov", method = RequestMethod.POST)
	public ResponseEntity<Movie> modify(@RequestBody Movie movie) {
		movie.setName(movie.getName() + "_modified");
		return new ResponseEntity<Movie>(movie, HttpStatus.OK);
	}
}
package com.springboot.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.NewDTO;

@RestController
//@Controller

public class NewAPI {

//	  @RequestMapping(value = "/new", method = RequestMethod.POST)
//      @ResponseBody
//      public NewDTO createNew(@RequestBody NewDTO model) {
//              return model;
//      }

	@PostMapping("/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return model;
	}

}

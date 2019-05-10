package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddingTwoNumbersController {
	
	@RequestMapping(method = RequestMethod.GET, path="/math/add", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, params = "n1")
	@ResponseBody
	public int getResultOfAddition(@RequestParam int n1, @RequestParam int n2) {
		AddingTwoNumbers addingTwoNumbers = new AddingTwoNumbers(n1, n2);
		return addingTwoNumbers.Addition();
	}
}

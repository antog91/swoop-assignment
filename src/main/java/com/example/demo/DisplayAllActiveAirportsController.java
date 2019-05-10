package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DisplayAllActiveAirportsController {
	@RequestMapping(method = RequestMethod.GET, path="/airports", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String getResultOfAddition() {
		RestTemplate restTemplate = new RestTemplate();
		String externalApiUrl
		  = "https://api.flightstats.com/flex/airlines/rest/v1/json/active?appId=54e14c4a&appKey=1cb293d87514122044b1c9ed37e92ee5";
		ResponseEntity<String> response = restTemplate.getForEntity(externalApiUrl, String.class);
		
		return response.getBody();
	}
}

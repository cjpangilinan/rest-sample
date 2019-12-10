package com.nicky.fileupload.sample.controller;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@PostMapping(value="/sample")
	public @ResponseBody JsonResponse processMe(@RequestBody JsonRequest request) {
		JsonResponse response = new JsonResponse();
		response.setDateCreated(Date.valueOf(LocalDate.now()));
		response.setName(request.getName());
		
		return response;
	}
}

package com.creditcardapplication.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.creditcardapplication.api.Service.ApplicationService;
import com.creditcardapplication.api.VO.ResponseTemplateVO;
import com.creditcardapplication.api.dto.ApplicationDto;

@RestController
public class ApplicationController {
	
	@Autowired
	ApplicationService applicationService;
	
	@PostMapping("/applications")
	public String applyforcreadit(@RequestBody ApplicationDto applicationdto){
		
		return applicationService.applyforcreadit(applicationdto);
	}
	
	@GetMapping("/applications/{applicationNumber}")
	public String getStatus(@PathVariable("applicationNumber") long applicationNumber ) {
		
		return applicationService.getStatus(applicationNumber);
	}

}

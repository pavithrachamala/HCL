package com.creditcardapplication.api.Service;

import org.springframework.http.ResponseEntity;

import com.creditcardapplication.api.VO.ResponseTemplateVO;
import com.creditcardapplication.api.dto.ApplicationDto;

public interface ApplicationService {

	String applyforcreadit(ApplicationDto applicationdto);

	String getStatus(long applicationNumber);

}

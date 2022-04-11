package com.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.CreditScore;
import com.api.repository.CreditScoreRepository;
import com.api.service.CreditScoreService;

@Service
public class CreditScoreServiceImpl implements CreditScoreService {
@Autowired
 CreditScoreRepository CreditScoreRepository;

	@Override
	public CreditScore getCreditScore(String panCard) {
		// TODO Auto-generated method stub
		return CreditScoreRepository.findByPanNumber(panCard);
	}

}

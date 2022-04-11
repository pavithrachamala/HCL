package com.creditscore.api.serviceImpl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditscore.api.entity.CreditScore;
import com.creditscore.api.exception.PanNumberNotAvailableException;
import com.creditscore.api.repository.CreditScoreRepository;
import com.creditscore.api.service.CreditScoreService;

@Service
public class CreditScoreServiceImpl implements CreditScoreService {
@Autowired
 CreditScoreRepository creditScoreRepository;

	@Override
	public CreditScore getCreditScore(String panCard) {
		// TODO Auto-generated method stub
		Optional<CreditScore> creditScore =creditScoreRepository.findByPanNumber(panCard);
		//CreditScore creditScore = CreditScoreRepository.findByPanNumber(panCard);
		if(!creditScore.isPresent()) {
			throw new PanNumberNotAvailableException("Pan Numer Not Available!");
		}
		return creditScore.get();
	}

}

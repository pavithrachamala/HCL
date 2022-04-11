package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entity.CreditScore;

@Repository
public interface CreditScoreRepository extends JpaRepository<CreditScore, String> {

	CreditScore findByPanNumber(String panCard);

}

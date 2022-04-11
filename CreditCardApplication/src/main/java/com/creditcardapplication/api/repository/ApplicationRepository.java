package com.creditcardapplication.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creditcardapplication.api.entity.Application;
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

	Optional<Application> findByPanNumber(String panNumber);

}
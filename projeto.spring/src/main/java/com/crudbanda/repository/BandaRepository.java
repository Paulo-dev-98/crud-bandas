package com.crudbanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudbanda.model.Banda;

@Repository
public interface BandaRepository extends JpaRepository<Banda, Integer> {

	//List<Banda> findAll(Banda banda);

}
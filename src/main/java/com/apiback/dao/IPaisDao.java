package com.apiback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiback.model.Pais;



@Repository
public interface IPaisDao extends JpaRepository<Pais, Integer> {

}

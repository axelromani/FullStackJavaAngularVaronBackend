package com.apiback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiback.model.Varon;



@Repository
public interface IVaronDao extends JpaRepository<Varon, Integer> {

}

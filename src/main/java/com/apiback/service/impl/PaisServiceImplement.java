package com.apiback.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.apiback.commons.GenericServiceImplement;
import com.apiback.dao.IPaisDao;
import com.apiback.model.Pais;
import com.apiback.service.IPaisService;


@Service
public class PaisServiceImplement extends GenericServiceImplement<Pais, Integer> implements IPaisService{
	
	@Autowired
	private IPaisDao paisDao;

	@Override
	public JpaRepository<Pais, Integer> getDao() {
		
		return paisDao;
	}
	

	


}

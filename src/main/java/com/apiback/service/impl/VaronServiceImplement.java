package com.apiback.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.apiback.commons.GenericServiceImplement;
import com.apiback.dao.IVaronDao;
import com.apiback.model.Varon;
import com.apiback.service.IVaronService;



@Service
public class VaronServiceImplement extends GenericServiceImplement<Varon, Integer> implements IVaronService{
	
	@Autowired
	private IVaronDao varonDao;
	

	@Override
	public JpaRepository<Varon, Integer> getDao() {
		
		return varonDao;
	}

}

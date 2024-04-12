package com.apiback.commons;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericServiceImplement<W,ID extends Serializable> implements IGenericService<W, ID> {
	
	
	public abstract JpaRepository<W, ID> getDao();

	
	@Override
	public W GuardarActualizar(W entity) {
		
		return getDao().save(entity);
	}

	
	@Override
	public void Eliminar(ID id) {
		
		getDao().deleteById(id);
	}
	

	@Override
	public W ConsultaPorId(ID id) {
		
		Optional<W> obj = getDao().findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}		
		return null;
	}

	
	@Override
	public List<W> Listado() {
		
		return getDao().findAll();
	}

}

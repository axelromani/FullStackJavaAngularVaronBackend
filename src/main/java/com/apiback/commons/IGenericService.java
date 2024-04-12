package com.apiback.commons;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<W, ID extends Serializable> {
	
	
	W GuardarActualizar(W entity);
	
	void Eliminar(ID id);
	
	W ConsultaPorId(ID id);
	
	List<W> Listado();

}

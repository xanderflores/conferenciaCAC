package infrastructure.persistence;

import java.util.ArrayList;

import models.Orador;

public interface IPersistencia {
	
	//CRUD
	
	//CREATE
	void guardarOrador(Orador newOrador);
	
	//READ
	Orador getOradorById(String idOradorBuscado);
	ArrayList<Orador> getAll();
	
	//UPDATE
	
	Orador update(Orador datosParaActualizar);
	
	//DELETE 
	void delete(String id); 	 	
	
}

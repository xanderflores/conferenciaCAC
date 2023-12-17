package infrastructure.persistence.memory;

import java.util.ArrayList;

import infrastructure.persistence.IPersistencia;
import models.Orador;

public class MemoryRepositoryImpl implements IPersistencia{

	private static ArrayList<Orador> oradorGuardados= new ArrayList<>();
	
	@Override
	public void guardarOrador(Orador newOrador) {
		// TODO Auto-generated method stub
		MemoryRepositoryImpl.oradorGuardados.add(newOrador);
		System.out.println("ORADOR GUARDADO EN MEMORIA...");
	}

	@Override
	public Orador getOradorById(String idOradorBuscado) {
		// TODO Auto-generated method stub
		
		Orador orador=MemoryRepositoryImpl.oradorGuardados.get(Integer.parseInt(idOradorBuscado));
		return orador;
	}

	@Override
	public ArrayList<Orador> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orador update(Orador datosParaActualizar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

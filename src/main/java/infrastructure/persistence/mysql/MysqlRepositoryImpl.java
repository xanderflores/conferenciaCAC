package infrastructure.persistence.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import infrastructure.persistence.IPersistencia;
import models.Orador;

public class MysqlRepositoryImpl implements IPersistencia {
	
	private Connection conexion;
	
	public MysqlRepositoryImpl() {
		conexion= ConexionBD.getConnection(); 
	}
	
	

	@Override
	public void guardarOrador(Orador newOrador) {
		// TODO Auto-generated method stub
		String query="INSERT INTO oradores (nombre, apellido,descripcion) VALUES (?,?,?)";
		
		try {
			
			PreparedStatement statement = conexion.prepareStatement(query);
			statement.setString(1, newOrador.getNombre());
			statement.setString(2, newOrador.getApellido());
			statement.setString(3, newOrador.getDescripcion());
			statement.execute();
			System.out.println("USUARIO GUARDADO EN MSQL .....");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Orador getOradorById(String idOradorBuscado) {
		// TODO Auto-generated method stub
		return null;
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

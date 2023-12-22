package models;

import java.util.UUID;

public class Orador {

	private int idUsuario;
	private UUID idUUID;
	private String nombre;
	private String apellido;
	private String descripcion;
	
	public Orador(int id, String nombre, String apellido, String descripcion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.descripcion=descripcion;
		this.idUsuario=id;
		this.idUUID=UUID.randomUUID();//MODE ALTERNATIVE
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public UUID getIdUUID() {
		return idUUID;
	}

	public static void setContador(int contador) {
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}

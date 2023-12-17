package models;

import java.util.UUID;

public class Orador {

	private static int contador;
	
	private int idUsuario;
	private UUID idUUID;
	private String nombre;
	private String apellido;
	private String descripcion;
	
	public Orador(String nombre, String apellido, String descripcion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.descripcion=descripcion;
		this.idUsuario=contador++;
		this.idUUID=UUID.randomUUID();//MODE ALTERNATIVE
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public UUID getIdUUID() {
		return idUUID;
	}

	public static void setContador(int contador) {
		Orador.contador = contador;
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

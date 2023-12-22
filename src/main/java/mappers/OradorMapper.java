package mappers;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Orador;

public class OradorMapper {
	ObjectMapper mapper;
	
	public OradorMapper() {
		this.mapper= new ObjectMapper();
	}
	
	public String toJson(ArrayList<Orador> listaOradores) {
		
		try {
			return mapper.writeValueAsString(listaOradores);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "[]";
	}
}

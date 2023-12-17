package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import infrastructure.persistence.*;

//import infrastructure.persistence.memory.*;
import infrastructure.persistence.mysql.MysqlRepositoryImpl;
import mappers.OradorMapper;
import models.Orador;


@WebServlet("/oradores")
/**
 * Servlet implementation class ConferenciaServlet
 */
public class ConferenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//IPersistencia sistemaPersistencia=new MemoryRepositoryImpl();
	//IPersistencia sistemaPersistencia= new FileRepositoryImpl();
	IPersistencia sistemaPersistencia= new MysqlRepositoryImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConferenciaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		IPersistencia persistenciaSistema=new MysqlRepositoryImpl();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Orador oradorEncontrado= persistenciaSistema.getOradorById(request.getParameter("id"));
		// Convert the Orador object to a string representation
	    String oradorString = oradorEncontrado.toString();
	    response.getWriter().write(oradorString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre=request.getParameter("nombreInput");
		String apellido=request.getParameter("apellidoInput");
		String descripcion=request.getParameter("descripcionInput");
		System.out.println("Orador: "+nombre+",  "+apellido+", "+descripcion);
		//response.getWriter().write("Orador: "+nombre+",  "+apellido+", "+	);
		
		Orador orador= new Orador(nombre,apellido,descripcion);
		
		//persisted
		
		
		sistemaPersistencia.guardarOrador(orador);
		
		/*String userJsonFake= String.format(
				"{\"idOrador\": \"%s\", \"nombre\": \"%s\"}",orador.getIdUsuario(), orador.getNombre()
				);*/
		
		OradorMapper mapper = new OradorMapper();
		
		String oradorJson = mapper.toJson(orador);
		
		response.getWriter().write(oradorJson);	
	}

}
 
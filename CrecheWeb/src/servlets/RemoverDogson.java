package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocios.NEDogsons;

/**
 * Servlet implementation class RemoverDogson
 */
@WebServlet("/RemoverDogson")
public class RemoverDogson extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private NEDogsons dogsons;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverDogson() {
        super();
        dogsons = new NEDogsons();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.valueOf(request.getParameter("id"));
		dogsons.deletar(id);
		response.sendRedirect("ListarDogsons");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

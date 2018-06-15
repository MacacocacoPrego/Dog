package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Dogsons;
import negocios.NEDogsons;

/**
 * Servlet implementation class AtualizarDogson
 */
@WebServlet("/AtualizarDogson")
public class AtualizarDogson extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private NEDogsons dogsons;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtualizarDogson() {
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
		request.setAttribute("dogson", dogsons.get(id));
		request.getRequestDispatcher("atualizarDogson.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.valueOf(request.getParameter("id"));
		int idDono = Integer.valueOf(request.getParameter("idDono"));
		String nome = request.getParameter("nome");
		boolean sexo;
		boolean sexoRadio = Boolean.valueOf(request.getParameter("sexo"));
		if(sexoRadio == true) {
			sexo = true;
		}else {
			sexo = false;
		}
		int idade = Integer.valueOf(request.getParameter("idade"));
		int peso = Integer.valueOf(request.getParameter("peso"));
		String raca = request.getParameter("raca");
		boolean castrado;
		boolean castradoRadio = Boolean.valueOf(request.getParameter("castrado"));
		if(castradoRadio == true) {
			castrado = true;
		}else {
			castrado = false;
		}
		Dogsons d = new Dogsons(id, idDono, raca, sexo, idade, nome, peso, castrado);
		dogsons.salvar(d);
		response.sendRedirect("ListarDogsons");
	}

}

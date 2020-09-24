package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BandNameGenerator;

/**
 * Servlet implementation class getBandNamesServlet
 */
@WebServlet("/getBandNamesServlet")
public class getBandNamesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getBandNamesServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String place = request.getParameter("place");
		String thing = request.getParameter("thing");
		String adjective = request.getParameter("adjective");

		BandNameGenerator bng = new BandNameGenerator(name, place, thing, adjective);

		request.setAttribute("userBNG", bng);

		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);

	}

}

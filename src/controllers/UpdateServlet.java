package controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Tasklist;
import utils.DBUtil;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String _token = (String)request.getParameter("_token");
	    if(_token != null && _token.equals(request.getSession().getId())){
	        EntityManager em = DBUtil.createEntityManager();

	        Tasklist tk = em.find(Tasklist.class,request.getSession().getAttribute("tasklist_id"));

	        String name = request.getParameter("name");
	        tk.setName(name);

	        String content = request.getParameter("content");
	        tk.setContent(content);

	        em.getTransaction().begin();
	        em.persist(tk);
	        em.getTransaction().commit();
	        request.getSession().setAttribute("flush", "更新完了");
	        em.close();

	        request.getSession().removeAttribute("tasklist_id");
	        response.sendRedirect(request.getContextPath() + "/index");

	    }
	}

}

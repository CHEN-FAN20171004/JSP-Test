package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;

@WebServlet(urlPatterns={"/jsp/contact"})

public class Contact extends HttpServlet{

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		request.setCharacterEncoding("UTF-8");

		String name=request.getParameter("name");
		String company=request.getParameter("company");
		String mail=request.getParameter("mail");
		String review=request.getParameter("review");
		String genre =request.getParameter("genre");
		String select=request.getParameter("select");


		Product p=new Product();
		p.setName(name);
		p.setCompany(company);
		p.setMail(mail);
		p.setReview(review);
		p.setGenre(genre);
		p.setSelect(select);

		request.setAttribute("product",p);

		if(select.equals("yes")) {
			request.getRequestDispatcher("../jsp/yes.jsp").forward(request, response);

		}else {
			request.getRequestDispatcher("../jsp/no.jsp").forward(request, response);
		}

	}

}
























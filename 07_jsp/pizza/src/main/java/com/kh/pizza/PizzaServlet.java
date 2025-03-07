package com.kh.pizza;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PizzaServlet
 */
@WebServlet("/pizza.do")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String)request.getParameter("userName");
		String phone = (String)request.getParameter("phone");
		String address = (String)request.getParameter("address");
		String message = (String)request.getParameter("message");
		
		String pizzaname = (String)request.getParameter("pizza");
		String []topping = (String[])request.getParameterValues("topping");
		String []side = (String[])request.getParameterValues("side");
		String payment = (String)request.getParameter("payment");
		
		int price = 0;
		switch(pizzaname) {
		case "콤비네이션" :
			
		case "포테이토피자":
			
		case "고구마피자":
			
		case "치즈피자":
			price += 8900;
			break;
		case "하와이안피자":
			price += 13900;
			break;
		default:
			price += 10900;
		}
		
		if(topping != null) {
			for(String name : topping) {
				switch(name) {
				case "고구마무스":
					
				case "치즈크러스트":
					price+=3000;
					break;
				case "치즈바이트":
					price+=4000;
					break;
				case "치즈추가":
					price+=3000;
					break;
				case "베이컨/소세지":
					
				case "파인애플":
					
				default:
					price+=1000;
				}
			}
		}
		
		if(side != null) {
			for(String name : side) {
				switch(name) {
				case "콜라":
					
				case "사이다":
					 
				case "환타":
					 
				case "핫소스":
					price+=100;
					 break;
				case "파마산":
					price+=100;
					 break;
				case "피클":
					price+=500;
					 break;
				default:
					price+=2200;
				}
			}
		}
		
		//요청처리 후 사용자가 보게 될 응답페이지를 만들어서 전달
		//jsp로 응답페이지를 넘김
		request.setAttribute("name", username);
		request.setAttribute("phone", phone);
		request.setAttribute("address", address);
		request.setAttribute("message", message);
		
		request.setAttribute("pizza", pizzaname);
		request.setAttribute("topping", topping);
		request.setAttribute("side", side);
		request.setAttribute("payment",payment);
		request.setAttribute("price",price);
		
		request.getRequestDispatcher("views/pizza/pizzaPayment.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

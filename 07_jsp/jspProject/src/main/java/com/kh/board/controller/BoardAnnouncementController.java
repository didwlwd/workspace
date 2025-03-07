package com.kh.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.kh.board.model.vo.Notice;
import com.kh.board.service.BoardService;
import com.kh.common.PageInfo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardListController_2
 */
@WebServlet("/anno.bo")
public class BoardAnnouncementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardAnnouncementController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//views/board/boardListView.jsp 포워딩
		//board데이터를 전달
				
		//-------------------------페이징 처리------------------------------
		int listCount; //현재 총 게시글 수
		int currentPage; //현재 페이지(사용자가 요청한 페이지)
		int pageLimit = 10; //하단에 보여질 페이징바의 수
		int boardLimit = 10; //한 페이지내에 보여질 게시글 최대 수
		
		listCount = new BoardService().selectAnnouncement();
		
		currentPage = Integer.parseInt(request.getParameter("epage"));
		
		PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit);
		
		ArrayList<Notice> nlist = new BoardService().selectlistAnnouncemnet();
		request.setAttribute("nlist", nlist);
		request.setAttribute("pi", pi);
		
		request.getRequestDispatcher("views/board/boardannouncementController.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

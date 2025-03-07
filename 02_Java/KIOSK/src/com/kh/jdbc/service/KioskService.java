package com.kh.jdbc.service;

import static com.kh.jdbc.common.JDBCTemplate.close;
import static com.kh.jdbc.common.JDBCTemplate.getconnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.jdbc.dao.KioskDao;
import com.kh.jdbc.kiosk.Kiosk;

public class KioskService {
	
	public ArrayList<Kiosk> recommendMenu() {
		Connection conn = getconnection();
		ArrayList<Kiosk> list = new KioskDao().recommendMenu(conn);
		close(conn);
		return list;
		
	}
	
	public ArrayList<Kiosk> coffeeMenu() {
		Connection conn = getconnection();
		ArrayList<Kiosk> list = new KioskDao().coffeeMenu(conn);
		close(conn);
		return list;
		
	}
}

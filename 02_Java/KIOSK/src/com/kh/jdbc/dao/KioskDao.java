package com.kh.jdbc.dao;

import static com.kh.jdbc.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.jdbc.kiosk.Kiosk;

public class KioskDao {
	
	private Properties prop = new Properties();
	
	public KioskDao() {
		try {
			prop.loadFromXML(new FileInputStream("resource/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Kiosk> recommendMenu(Connection conn) {
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		ArrayList<Kiosk> list = new ArrayList<>();
		
		String sql = prop.getProperty("recommendMenu");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Kiosk ko = new Kiosk();
				ko.setName(rset.getString("ITEMNAME"));
				ko.setPrice(rset.getInt("PRICE"));
				ko.setSoldoutcheck(rset.getString("ITEMSOLDOUTCHECK"));
				list.add(ko);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	
	public ArrayList<Kiosk> coffeeMenu(String str ,Connection conn) {
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		ArrayList<Kiosk> list = new ArrayList<>();
		
		String sql = prop.getProperty("coffeeMenu");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, str);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Kiosk ko = new Kiosk();
				ko.setName(rset.getString("ITEMNAME"));
				ko.setPrice(rset.getInt("PRICE"));
				ko.setSoldoutcheck(rset.getString("ITEMSOLDOUTCHECK"));
				list.add(ko);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
}

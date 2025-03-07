package com.kh.jdbc.controller;

import java.util.ArrayList;

import com.kh.jdbc.kiosk.Kiosk;
import com.kh.jdbc.menu.KioskMenu;
import com.kh.jdbc.service.KioskService;

public class KioskController {
	private KioskService ks =  new KioskService();
	
	//추천메뉴를 전부 가져오는 메소드
	public void recommendMenu() {
		ArrayList<Kiosk> list = ks.recommendMenu();
		
		if(list.isEmpty()) {
			new KioskMenu().notfound("조회 된 결과가 없습니다.");
		}else {
			new KioskMenu().recommendMenu(list);
		}
			
	}
	
	public void coffeeMenu() {
		ArrayList<Kiosk> list = ks.coffeeMenu();
		
		if(list.isEmpty()) {
			new KioskMenu().notfound("조회 된 결과가 없습니다.");
		}else {
			new KioskMenu().coffeeMenu(list);
		}
			
	}
}

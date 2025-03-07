package z.practice.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		int port = 3000;
		String ip = "192.168.20.23";
		
		try {
			Socket socket = new Socket(ip,port);
			
			if(socket != null) {
				System.out.println("서버 연결 성공");
			}
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				System.out.println("서버에 보낼 내용 : ");
				String p1 = sc.nextLine();
				
				pw.println(p1);
				pw.flush();
				
				String b1 = br.readLine();
				System.out.println("서버로부터 받을 내용 : " + b1);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

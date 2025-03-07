package z.practice.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		
		int port = 3000;
		
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			System.out.println("클라이언트와 연결 대기중 ");
			
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결 요청함");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String b1 = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메세지 : " + b1);
				
				System.out.print("클라이언트로 보낼 내용 : ");
				String p1 = sc.nextLine();
				
				pw.println(p1);
				pw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

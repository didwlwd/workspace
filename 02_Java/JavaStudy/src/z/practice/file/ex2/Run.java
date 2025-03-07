package z.practice.file.ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String file =null;
		String write =null;
		try {
			System.out.print("file 명 : ");
			file = br.readLine();
			System.out.print("write : ");
			write = br.readLine();
			fileSave(file, write);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileRead(file);
	}

	public static void fileSave(String file, String s) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(s);
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileRead(String file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String text = null;
			while((text = br.readLine()) !=null) {
				System.out.println(text);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

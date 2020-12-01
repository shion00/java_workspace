package day1110.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	ServerSocket server;
	int port=8989;
	
	
	public EchoServer() {
		try {
			server=new ServerSocket(port);
			Socket socket=server.accept();
			System.out.println("접속자 발견");
			
			InputStream is=socket.getInputStream();
			InputStreamReader reader=new InputStreamReader(is);
			BufferedReader buffr=new BufferedReader(reader);
			
			String data=null;
			while(true) {
				data=buffr.readLine();
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new EchoServer();
	}

}

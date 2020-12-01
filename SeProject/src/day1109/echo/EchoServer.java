package day1109.echo;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	ServerSocket server;
	int port=9999;
	
	public EchoServer() {

		try {
			server=new ServerSocket(port);//ServerSocket 생성, 매개변수로 port값 넘겨주기
			Socket socket=server.accept();//ServerSocket의 accept() 이용 Socket 반환
			InetAddress inet=socket.getInetAddress();//Socket의 getInetAddress() 이용, InetAddress 반환
			String ip=inet.getHostAddress();//InetAddress의 getHostAddress() 이용, ip 반환
			InputStream is=socket.getInputStream();//Socket 의 getInputStream() 이용, InputStream 반환
			int data;
			while(true) {
				data=is.read();//InputStream의 read() 이용 
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
}

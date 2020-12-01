package day1110.network;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	Socket socket;
	String id="localhost";
	int port=8989;
	Thread thread;
	
	public EchoClient() {
		
		try {
			socket=new Socket(id, port);
			System.out.println("접속성공");
			
			InputStream is=socket.getInputStream();
			InputStreamReader reader=new InputStreamReader(is);
			BufferedReader buffr=new BufferedReader(reader);
			
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter writer=new OutputStreamWriter(out);
			BufferedWriter buffw=new BufferedWriter(writer);
			
			thread=new Thread() {
				public void run() {
					while(true) {
						try {
							buffw.write("야호\n");
							buffw.flush();
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
					}
				}
			};
			thread.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new EchoClient();
	}
}

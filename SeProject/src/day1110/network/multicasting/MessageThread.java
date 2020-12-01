package day1110.network.multicasting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MessageThread extends Thread{
	MultiServer uniServer;
	BufferedReader buffr;
	BufferedWriter buffw;
	
	
	public MessageThread(MultiServer uniServer) {
		this.uniServer=uniServer;
		
		try {
			buffr=new BufferedReader(new InputStreamReader(uniServer.socket.getInputStream()));
			buffw=new BufferedWriter(new OutputStreamWriter(uniServer.socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void run() {
		listen();
	}
	
	public void listen() {
		String msg=null;
		try {
			while(true) {
				msg=buffr.readLine();
				uniServer.area.append(msg+"\n");
				send(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void send(String msg) {
		try {
			buffw.write(msg+"\n");
			buffw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

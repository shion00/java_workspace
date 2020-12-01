package day1103.thread;

import javax.swing.JProgressBar;

public class BarThread extends Thread {
	JProgressBar bar;
	int n, interval;
	
	public BarThread(JProgressBar bar, int interval) {
		this.bar=bar;
		this.interval=interval;
	}
	
	public void run() {
		while(true) {
			n++;
			bar.setValue(n);
			try {
				BarThread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

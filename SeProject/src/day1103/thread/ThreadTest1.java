package day1103.thread;

public class ThreadTest1 {

	public static void main(String[] args) {
		
		TimeThread tt=new TimeThread();
		tt.start();
		
		Thread startThread=new Thread() {
			public void run() {
				while(true) {
					System.out.println("★");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		startThread.start();
	}

}

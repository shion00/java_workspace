/*
 * 개발자는 독립적으로 수행하고 싶은 코드가 있을때, 쓰레드를 상속받아
 * run() 메서드를 재정의하면 된다. 즉 run() 에 개발자가 작성하고자 하는 로직을 작성하면 된다.
 * */

package day1103.thread;

public class MyThread extends Thread{
	//jvm 이 아래의 run() 메서드를 수행해주며, 이때를 가리켜 running 상태라 한다.!
	
	//Thread의 run() 메서드 재정의
	public void run() {
		while(true) {
			System.out.println("★");
		}
	};
	
}

package day1026.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

////키보드와 관련한 이벤트가 발생하면, 자바가상머신이 KeyListener에게 KeyEvent 인스턴스를
//전달한다. 이 전달된 인스턴스는 KeyListener가 보유한 추상메서드에 전달되어진다.
//개발자는 이 추상메서드를 재정의하면서 원하는 로직을 작성하면 됨!!
public class MyKey implements KeyListener{
	
	//오버라이딩 하고, 키보드 누를때마다 눌렀어? 메시지 나오게 처리
	public void keyTyped(KeyEvent e) {
		System.out.println("키를 누를때, keyPressed called..");
	}

	public void keyPressed(KeyEvent e) {
		System.out.println("키를 뗄때, keyReleased called..");
	}

	public void keyReleased(KeyEvent e) {
		System.out.println("키를 칠때, keyTyped called..");
	}
}

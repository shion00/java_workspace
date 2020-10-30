package day1026.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiActionListener implements ActionListener{
	
	//이 메서드로 눌려진 모든 버튼의 정보가 넘어온다!
	public void actionPerformed(ActionEvent e) {
		
		//유저가 발생시킨 이벤트에 대한 모든 정보가 Event 인스턴스로 전달되어 지므로 
		//어떤 버튼을 눌렸는지도 알 수 있다.!
		System.out.println(e);
		
		/*이벤트 객체의 메서드 중, 이벤트를 일으킨 컴포넌트(이벤트 소스)를 추출하는 메서드 : e.getSource()
		if(e.getSource()==bt1){/어떤게 다른 클래스에 있는 참조변수 bt1 을 가져 올 수 있는지 생각해보자
			
		}
		*/
	}

}

/*동일한 종류의 컴포넌트가 2개 이상일 경우 리스너 연결방법*/
package day1026.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MultiButtonApp extends Frame {
	Button bt1,bt2;
		
	public MultiButtonApp() {
		bt1=new Button("버튼1");
		bt2=new Button("버튼2");
		setLayout(new FlowLayout());//Frame 디폴트 레이아웃은 Border 레이아웃이기 때문에
											   	//버튼의 제것 크기대로 나오게 Flow 레이아웃을 주었다.
		
		//버튼 부착
		add(bt1);		
		add(bt2);
		
		//버튼마다 리스너 연결
		bt1.addActionListener(new MultiActionListener());
		bt2.addActionListener(new MultiActionListener());
		
		setSize(300, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MultiButtonApp();
	}
	
	
}

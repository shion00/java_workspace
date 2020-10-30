
package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Choice;

class MyWin extends Frame{//MyWin is a Frame
	Button bt;//MyWin has a bt
	TextField t;
	Choice ch;//html의 select option 박스와 동일
		
	public MyWin(){
		bt=new Button("나 눌러봐");
		t=new TextField(15);
		ch=new Choice();

		//ch의 아이템 채우기
		ch.add("Java Programming");
		ch.add("JSP Programming");
		ch.add("Android Programming");
		ch.add("Spring Programming");
		ch.add("Mybatis Programming");

		this.setLayout(new FlowLayout());//setLayout을 FlowLayout 으로 변경

		//버튼을 윈도우에 부착!
		this.add(bt);//프레임은 디폴트가 BorderLayout 이므로, 센터영역에 크게 붙을 것임
		this.add(t);
		this.add(ch);
		
		bt.addActionListener(new MyListener());//버튼과 클릭 리스너 연결!!
		t.addKeyListener(new MyKey());//텍스트박스와 키 리스너 연결
		this.addMouseListener(new MyMouse());//프레임과 마우스 리스너 연결!!!, 주체가 누구인가? 중요!
		ch.addItemListener(new MyItem());//초이스와 리스너 연결
		addWindowListener(new MyWindowListener());//프레임과 리스너 연결, this. 생략가능

		this.setVisible(true);
		this.setSize(300,400);
	}

	public static void main(String[] args){
		new MyWin();
	}

}

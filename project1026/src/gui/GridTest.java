/*
awt/swing/fx --> 안드로이드와 흡사
*/
package gui;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Panel;


class GridTest{
	public static void main(String[] args){
		Frame frame=new Frame("그리드 레이아웃"); //제목에 그리드 레이웃

		//레이아웃 메니져 생성 및 등록
		GridLayout layout = new GridLayout(1,3); //1횡 3열

		//플로우배치에서는, 컴포넌트가 자신의 본래 크기를 가질 수 있다. 나머지 레이아웃들은 100%
		//FlowLayout layout=new FlowLayout();

		//그리드를 유지하면서, 컴포넌트가 본래의 크기를 유지하는 방법은?
		//두개는 양자택일이지 공존하지 못함.
		//해결책) 컴포넌트 중 배치관리자 적용이 가능한 Panel(패널)을 이용하면 된다.(html의 div 비슷)
		//즉 부분적으로 다른 배치관리자를 적용할때 많이 사용됨

		frame.setLayout(layout);//프레임에 레이아웃 적용!!

		Panel p=new Panel();//눈에 보이지 않음

		Button bt1=new Button("버튼1");
		Button bt2=new Button("버튼2");
		Button bt3=new Button("버튼3");

		p.add(bt1);//패널에 버튼 넣기
		frame.add(p);//프레임에 패널넣기, 본연의 크기 유지됨, panel 은 flow이기 때문
		frame.add(bt2);//프레임에 버튼 넣기, 크기 100% 됨
		frame.add(bt3);//프레임에 버튼 넣기

		frame.setSize(300,200);
		frame.setVisible(true);
		
	}
}

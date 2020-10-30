/*
 1) 글씨 크기 조절 ctrl + (-,+ 키)
 2) Window>Preferences >General>Appearance>Colors and fonts>Basic>Text font
	 에서 Verdana 체 선택
 3) 단축기 모두 보기 ctrl + shift + L
 4) 자동 임포트 : ctrl + shift + O
 5) 자동 코드 정렬 : ctrl + shift + F
 6) 해당 객체의 api문서 바로가기 : 해당 클래스 커서 올린 후 shift + F2(기능키) 인터넷 연결이 전제됨.
 7) 출력 : sout 단축단어 입력과 동시에 ctrl + space
 8) 코드블럭 이동하기 : 블럭지정 후 alt + 위,아래 방향키
 9) 코드복사 : 블럭지정 후 ctrl + alt + 아래 방향키
 10) 코드 찾기 및 자동입력 : ctrl + space
 11) 한줄삭제 : ctrl + D
 */

package day1027.gui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;


public class RadioTest extends Frame {
	// 자바에서는 라디오 컴퍼넌트가 없기에 체크박스를 라디오로 사용함
	CheckboxGroup group;

	public RadioTest() {
		group = new CheckboxGroup();
		setLayout(new FlowLayout());
		this.add(new Checkbox("운동", group, false));
		this.add(new Checkbox("독서", group, false));
		this.add(new Checkbox("컴퓨터", group, false));
		this.add(new Checkbox("영화", group, false));
		this.add(new Checkbox("요리", group, false));
		this.add(new Checkbox("애견돌보기", group, true));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("sout ctrl+스페이스");
		new RadioTest();
	}

}

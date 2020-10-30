
/*
 다형성(多形)에 대해 다시 한번 공부해보자!!
*/

package day1029.poly;

import javax.swing.JButton;
import javax.swing.JComponent;

public class Bird {
	String name="난새";
	String local="한국";
	
	public void fly() {
		System.out.println("새가 날아요");
	}
	
	public static void main(String[] args) {
		//새들을 대상으로 다형성 공부하기!!
		Bird b1=new Bird();
		Bird b2=new Duck();
		Bird b3=new Sparrow();
		
		//b3.fly();//새의 행동이 다양하네~~
		Bird d1=new Duck();//d1은 Bird클래스 변수, 메서드 접근
									//다형성의 특징으로서는 자식메서드
									//유연해진다.
		Duck d2=new Duck();//부모꺼 내꺼
		
		
		//다형성은 이해가 되는데 컬렉션 프레임 워크에서 List lst = new Stack();
		//이런식으로 선언하면 푸시나 팝이 안되서 안좋은데 List의 경우는 List 에 ArrayList를 
		//할당하는 경우가 있어서 List로 할당할 경우 이득을 볼 수 있는 예시를 보고 싶습니다..
		//JComponent bt=new JButton();
		//bt.doC
		
		//유연하게 해서 좋은 경우가 뭔지 모르겠어요..
		//아~ 다형성이 제네릭 어레이리스트같은 곳에 비슷한거 담을때 사용하네요

		//그렇죠, add() 메서드는 모든 자식이 재정의한것이기 때문에 부모자료형으로 add() 할때 다형성이라고 말할수 있죠
		//부모자료형으로 자식의 메서드를 호출하는 기법을 다형성이라고 해요

	}
}


/** javadoc 이용 API 만들기 실습*/

/*
남이 제공한 클래스를 사용하려면?
1) 그 사람에게 연락한다.
2) 디컴파일 한다
답 없다

컴파일 결과물은 실행용이고, 기계어기 때문에 어떤 메서드나, 속성을 가지고 있는지 도저히 알 수가 없다.
따라서 클래스를 정의한 사람은 기계어와 함께 설명서를 제공해야 한다.
웹사이트에 문서란 두고 공지..
*/

package animal;

public class Cat{
	String name;
	int age;
	public Cat(String name, int age){
		this.name=name;
		this.age=age;
	}

	/** 고양이를 울게하는 메서드입니다.(*를 하나더 붙이면 API의 주석으로 볼 수 있다.)*/
	public void cry(){
		System.out.println("고양이가 울어요");
	}
}

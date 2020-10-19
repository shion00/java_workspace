/*강아지를 정의한다*/

class Dog{
	/*
	결국 클래스안에 올 수 있는 문법 구성요소는?
	1)변수=property
	2)함수=method
	*/
	//참고) String 은 객체자료형이다.(char를 모아놓은 배열임)
	String color="white";//색상 - 상태(변수)
	String name="뽀미";//이름 - 상태(변수)
	int age=9;//나이 - 상태(변수)
	
	//짖는다 - 동작(함수)
	//반환형이 없는 함수는 void를 명시한다.
	public void bark(){
		System.out.println("윅윅");
	}
	
	//뛴다 - 동작(함수)
	public void run(){
		System.out.println("강아지가 뛰어요");

	}


}

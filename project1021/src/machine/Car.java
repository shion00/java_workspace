
class Car{
	String color="red";//String 도 객체이다. has a 관계
	String name="Benz";
	int price=500;
	Wheel wheel;//이 코드가 낯설지 않은 이유?
						//클래스 안에는 자료형을 둘 수 있는데, 자바의 자료형은 총 4개이다.
						//따라서 이 클래스 안에는 문자, 숫자, 논리값 이외에도 객체형도 올 수 있다.
						//객체자료형도 자료형이니깐.
						//=Null
						//has a 관계라고 부르고, has a 관계는 사물(객체)와 사물(객체)간에만 해당된다.
						//the car has a wheel
						//자동차가 바퀴를 가지고 있다.
						//System.out.println(name);

	//클래스명과 동일한 이름의 메서드를 가리켜 생성자라 하고,
	//생성자는 이름에서도 알 수 있듯이, 객체의 생성 타임에 무언가 초기화 작업이 있을때,
	//작업을 수행하는 용도의 메서드이다.
	public Car(){
		this.wheel=new Wheel();//this. 빼도 된다.
	}										  //c.wheel 이상한 이유 
											  //1) c 는 main의 지역변수로 매개변수로 받지않는 한 소멸하므로 브레이스밖에서 쓸 수 없다. 
											  //2) 멤버메서드가 멤버변수 가리킬때 스스로가 본인 이름을 붙여 가리키는것은 이상하다.

	public static void main(String[] args){
		
		Car c=new Car();//자동차를 생성하고,
		System.out.println(c.name);//이 자동차의 이름을 출력하고,

		//이 자동차 바퀴의 브랜드, 색상, 가격을 출력하시오
		//c.wheel=new Wheel();//칭찬 but..자동차 생산 이후에 한참지나서 바퀴 생성하는 느낌이다. 생성자를 이용한다.
		System.out.println(c.wheel.brand);
		
	}

}

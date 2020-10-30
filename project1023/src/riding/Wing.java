package riding;

//날새를 정의한다.
//인터페이스란? 메서드만을 보유한 기능 집합이다.
//즉 객체는 객체인데, 메서드만을 보유한 단위이므로,  sun社에서 금지하고 있는
//다중상속
abstract public interface Wing{//interface는 클래스가 아니기 때문에 다중 상속될 수 있다.
	//단 하나라도 추상메서드가 들어있을 경우, 전체가 추상클래스가 되버림!
	abstract public void fly();
}

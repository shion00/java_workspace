package music;
class UseDevice{
	
	public static void main(String[] args){
		/*추상 클래스는 불완전한 클래스이므로, 인스턴스 생성이 불가능하다.
			즉, 불완전하기 때문에..미완성이라서..
			따라서 자식객체가 완성하면 가능하다.
			결국 자식에 의해 인스턴스화 될 수 있다.
		*/
		//AudioDevice ad=new AudioDevice(); //불가능, 불완전하기 때문
		//AudioDevice ad=new Speaker(); //가능, 자식에 의해 인스턴스화됨
		riding.Wing wing=new Speaker();//inline style 같은 느낌으로 앞에 riding. 을 쓸 수 있다.
		wing.fly();//오버라이딩, 자식꺼 호출

		//extends 건 implements 건 둘다 is a 다!!
		//따라서 서로간 같은 종류의 자료형으로 간주되며, 형변환도 지원된다!!
		//자식이 오버라이딩을 하면, 자식의 메서드를 최우선 호출한다. 부모가 추상메서드 일수도 있고, 자식이 업그레이드 이기 때문에
		//부모꺼는 super. 으로 접근하면 된다.

		final int x=5; //변수의 변경이 불가능
		//x=7; 불가, 변수에 붙이면 더이상 할당 불가!
		//메서드에 붙이면 오버라이드 허용불가
		//class에 붙이면 상속불가
	
	}

}

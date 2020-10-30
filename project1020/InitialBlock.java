/*
초기화 블럭
Why 쓰는가? 생성자로 초기화 할 수 있으므로 별로 쓰이지 않는다.
*/
class InitialBlock{
	int sum=0;
	
	//인스턴스가 생성될때, 반복문을 돌려서, 총합을 넣어주고 싶다.
	//클래스에는 변수와 메서드만 정의 할 수 있다!! 따라서 메서드 안으로 제어문을 넣거나, 초기화 블럭안에 두어야 한다.

	//멤버영역안에 {지역화} 시켰을때 갖는 의미는?
	//이 클래스의 인스턴스가 생성될때마다 이 영역을 호출하게 된다.
	//인스턴스 초기화 블럭이라 한다._인스턴스를 생성할때마다 호출된다!
	{
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("인스턴스 초기화 블럭 호출"+sum);
	}

	//static 초기화 블럭_메서드의 실행 직전에 호출된다!
	//main() 메서드에 의한 실행 직전에, 실행되는 초기화 블럭
	static{
		System.out.println("실행하기전 초기화 블럭 실행하겠습니다.");
		System.out.println("A");
	}

	public static void main(String[] args){
		int a=3;
		System.out.println("B");

		/*그냥 블럭화 시켜놓은 것임. 혹여나 이 안에 변수를 선언하면 해당블럭내에서만 유효하다.
		{
			int b=5;
		}
		System.out.println(b);*/

		new InitialBlock();
		new InitialBlock();
		new InitialBlock();
	}

}

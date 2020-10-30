class Doll{
	
	public void walk(){//걷는다
	}

	/*
	개발자가 생성자를 정의하지 않으면, sun에서 나선다.
	컴파일러에 의해 아주 기본적인 최소한의 관여을 통해 생성자를 정의한다.
	디폴트 생성자.
	public Doll(){
		//로직은 없다. 최소한의 관여만 하므로..(그냥 에러만 안나도록)
	}
	*/

	//개발자가 생성자를 정의하면, 더 이상 컴파일러에 의한 생성자 정의는 없다.
	//따라서 개발자가 정의한 생성자만 존재한다!!!
	public Doll(){
		System.out.println("내가 정의한 생성자");
	}

	public static void main(String[] args){
		Doll d=new Doll();//default 생성자 메서드를 호출한 것이다.
		
		d.walk();//존재하는 메서드 호출이므로 에러발생x
		//d.run();//존재하지 않는 메서드 호출 이므로 에러o
	}

}

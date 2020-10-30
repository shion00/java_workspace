class UseTest2{
		public static void main(String[] args){
		//x값을 10으로 변경하고 출력하시오.
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		Test2 t3=new Test2();

		t1.x=10;//class Test2 는 거푸집이다, 인스턴스를 먼저 만들지 않고
					//x를 사용할 수 없으며, x에는 누구의 것인지 명시하여야 한다.
		System.out.println(t1.x);
	}

}

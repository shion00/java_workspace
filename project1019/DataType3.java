class DataType3{

	public static void main(String[] args){
		short s1=3; //(가)
		short s2=4; //(나)
		
		int a1 = 3;//(다)
		int a2 = 4;//(라)
		
		short sum = s1+s2; //(마), 
		//정수의 연산수행에서 연산의 대상이 되는 데이터가 int 형보다 작은 자료형일 경우(byte,short) 
		//연산속도를 높이기 위해, 연산에 최적화된 자료형인 int 형으로 자동으로 형변환을 일으킨다. (자동형변환)
		//해결책1) int sum 으로 바꾼다.
		//해결책2) short sum=(short)(s1+s2) 강제형변환, 손실발생 감수 하겠다.
		//			 (short) 에서의 소괄호를 cast 연산자라 한다.
		int result = a1+a2;//(바)		
	}
}

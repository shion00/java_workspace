package animal;
public class Duck extends Bird{
	/*Duck is a Bird*/
	/*Duck형은 Bird형이다.*/
	/*오리는 새다*/
	String name="난 오리";

	public void quack(){
		System.out.println("꽥꽥");
	}

	public static void main(String[] args){
		Duck d1=new Duck();
		Duck d2=new Duck();

		Bird b=new Bird();

		int x=6; //4byte
		byte c=3; //1byte
		x=c; // : 가능 당연함, 숫자형은 같은 자료형으로 보니깐!! 

		//b=d1; : 가능
		//b=new Duck();  : 가능

		byte k=6;
		short s=8;

		k=s;//불가, 작은 자료형으로 큰자료형을 받으려니 불가
		       //손실이 발행하게됨
			   //해결책)
			   //1) k를 short 이상의 크기의 자료형으로 변경
			   //2) 손실을 감안하고, 강행함(강제형변환), k=(byte)s; 전문용어 demotion 
			   

		//객체자료형도 자료형이다!!!
		Duck a =new Duck();
		Bird r= new Bird();
		r=a;//큰<--작 : 가능
		a=r;//작<--큰, : 불가능 
		a=(Duck)r; 전문용어 down casting
		r=(Bird)a;//작은자료형에서 큰 자료형으로 올라감, 전문용어 up casting
		                //저 이번에 주인공 '역할'에 케스팅되었어요..

		//결론(원칙) : 객체자료형도 자료형이므로, 기본자료형의 원칙이 상당부분 그대로 적용되고 있다.!!
			 

	}

}

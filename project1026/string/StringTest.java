package string;
class StringTest{
	public static void main(String[] args){
		/*String 은 클래스다!!
		하지만 우리 인간은 스트링을 너무 압도적으로 많이 사용하기 떄문에, 
		new 연산자에 의해 스트링을 생성하는 것은 너무 불편하다!!
		따라서 String 한해서는 마치 일반 데이터타입처럼 new 쓰지 않는 표현식을 지원해준다.
		이런한 String 의 생성방법을 암시적, 묵시적(implicit) 생성법이라 한다.
		묵시적 생성법에 의한 String 은 힙영역의 상수풀(Constant Pool)에 의해 관리되어 지는데,
		상수풀은 이미 생성된 객체가 있으면 중복하여 새롭게 생성하지 않고 기존의 객체를 이용한다.*/

		/*아래 코드의 수행결과 예측해보기*/
		String s1="apple";
		String s2="apple";
		System.out.println(s1==s2);//결과는 뭐가 나올까요? 
		//true, 묵시적 생성방식으로 상수풀에 의해 관리되므로 s1과 s2의 주소값은 같다.

		//String 은 시작문자인 'S'가 대문자로보아 분명 객체형이다!!!!
		//우리의 개발환경에서 String.class 가 어딘가에 있어야 하는데, 보이지 않는다.
		//java se의 모든 api가 모여있는 압축된 파일에 있다.
		//C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar\java\lang
		//필수적인 객체는 java.lang에 있는 들어있고 import가 필요하지 않다.  
		
		//아래와 같이 new 연산자에 의한 스트링 생성법을 명시적(explicit) 생성법이라 한다.
		//명시적 생성법은 상수풀에 생성되지 않으므로, new 할때마다 중복 여부를 따지지 않고
		//무조건 생성된다!!
		String s3=new String("korea");
		String s4=new String("korea");
		System.out.println(s3==s4);//결과는 뭐가 나올까요?
		//false, 명시적 생성법으로 각자 객체를 생성하여 s3와 s4은 다른 주소값을 갖고있기 때문이다.
	
		/*s1,s3를 출력할 경우 '주소값'이 아니라 apple,korea가 출력 되는 이유는?

		글씨가 나온 이유는 스트링 클래스가 내부적으로 toString() 메서드가 
		자동호출되서 글씨로 표현되서 그런거임
		
		객체를 출력한다는것은 원래 불가능한데, 내부적으로 스트링으로 변환되어 출력되는거에요

		객체는 레퍼런스 주소잔아요, 그걸 출력한다고 하면 원래 주소가 나와야 하잔아요
		근데 주소가 안나오고, 글씨가 나온 이유는 스트링 클래스가 내부적으로 toString() 메서드가 
		자동호출되서 글씨로 표현되서 그런거임
		toString() : 이미 string(문자열)인 객체는 자기자신을 반환한다.*/


		//주소비교가 아닌, 객체 동일성 비교하는 법
		String k1="orange";
		String k2="orange";
		System.out.println(k1==k2);//주소 비교
		System.out.println(k1.equals(k2));//내용(객체) 비교


		
	}
}

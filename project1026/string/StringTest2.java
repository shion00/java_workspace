package string;
class StringTest2{
	public static void main(String[] args){
		/*String 은 불변(immutable)이다.*/
		String s1="korea";
		System.out.println(s1);//korea 출력됨

		s1=s1+" fighting..";
		System.out.println(s1);//korea fighting.. 출력됨
		

		/*아래의 방법은 무려 101개의 문자열 상수를 상수풀에 생성해버린다.
		왜? 문자열 상수는 수정불가(불변)니깐!!!
		사용하지도 못하는 100개의 상수가 메모리에 올라가있기 때문에 큰 낭비를 초래한다.

		String str="";
		for(int i=1;i<=100;i++){
			str+="줄넘기"+i+"회\n";
		}
		System.out.println(str);
		*/

		//해결책
		//수정가능한 문자열 처리객체 지원
		//StringBuffer, StringBuilder
		StringBuilder sb=new StringBuilder();
		//sb="";
		sb.append("");
		for(int i=1;i<=100;i++){
			sb.append("줄넘기"+i+"회\n");
		}
		System.out.println(sb);

	}
}


package use;

//개념상만 가능..아래처럼 명시하면, d: 경로때문에 문제가 발생한다.
//이 자바 코드는 윈도우, 리눅스, 맥에서 모두 실행되어야 하므로, 특정 os에 의존적인 경로로 명시하면 안된다!! 
//D:\workspace\java_workspace\project1021\bin
//os환경변수 : path는 실행하고픈 파일의 경로의 위치
//				  classpath 실행하고픈 클래스파일의 경로의 위치	
import fashion.down.Pants;//실행을 위해서는..사용하고픈 클래스의 위치 등록!! src(x) bin(o)

class UsePants{
	public static void main(String[] args){
		//현재 클래스와는 물리적으로 떨어져 있는, 즉 다른 패키지에 들어있는 클래스 사용해보기!!
		//js 경우 : <script src="경로/파일명"></script>
		Pants p=new Pants(); //찾지 못함.
		System.out.println(p);
	}
}

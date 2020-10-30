/*
실행부에 매개변수 전달하여 실행해보기
*/

class MainArgs{
	//main의 정체?
	//메인 실행부라 불린다..근데 희한한 것은, 분명 메서드임에도 우리가 호출한 적도 없는데 실행이 된다.
	//답) main 메서드는 java.exe에 의해 호출된다.
	//따라서 코드내에서 호출하는 방식이 아니라, 자바의 실행파일에 의해 호출된다.
	//main 이 메서드라면, 그 안에 선언된 변수는 매개변수이다.
	//그렇다면, java.exe에 의해 main 메서드 호출시 매개변수의 호출도, 함께
	//넘겨야하는 시점 또한 java.exe로 실행할때이다. ex) java MainArgs 사과 바나나 딸기
	public static void main(String[] args){
		System.out.println("실행시 넘겨받은 매개변수의 수 "+args.length);

		//넘어온 매개변수를 모두 출력하시오.단 속상하지 않게
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
	}
}

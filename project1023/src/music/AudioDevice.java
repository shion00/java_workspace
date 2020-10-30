/* 32명의 개발자가 아직 개발코드를 작성하지도 않은 시점이기 때문에
현재 클래스에는 반드시 구현해야할 기능을 명시한다.
*/
package music;
abstract public class AudioDevice{//추상클래스는 미래에 알 수 없는 계획을 세울때 쓰인다.
	
	//볼륨 조절기능
	//abstract는 static과 함께 수정자로 불리는 또 한가지이다.
	//abstract : 메서드에 붙일 경우 브레이스 없는 불완전한 메서드를 의미한다.
	//불완전한 메서드를 단 1개라도 보유하고 있다면, 그 클래스는 불완전한 클래스이며, 
	//이러한 클래스를 추상클래스라 한다!!
	abstract public void setVolume();//추상메서드라 한다!({}가 없는 불완전한 메서드)
	abstract public void playMp3();//추상메서드로 정의(자식들을 구현강제하기위해..)

	//MP실행 기능


}

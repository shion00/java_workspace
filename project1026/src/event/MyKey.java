
package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//Ű����� ������ �̺�Ʈ�� �߻��ϸ�, �ڹ� ����ӽ��� KeyListener ���� KeyEvent �ν��Ͻ���
//�����Ѵ�. �� ���޵� �ν��Ͻ��� KeyListener �� ������ �߻�޼���鿡 ���޵Ǿ����Ƿ�, �����ڴ�
//�߻�޼��带 �������ϸ鼭 ���ϴ� ������ �ۼ��ϸ� ��!!
public class MyKey implements KeyListener{
	//�������̵� �ϰ�, Ű���� ���������� ������? �޽��� ������ ó��
	
	//KeyListener �� ��� �������� �޼��尡 ���� 3���� �ȴ�!
	public void keyPressed(KeyEvent e){
		//System.out.println("Ű�� ������, keyPressed called..");
	}
	public void keyReleased(KeyEvent e){
		System.out.println("Ű�� ����, keyReleased called..");
	}
	public void keyTyped(KeyEvent e){
		//System.out.println("Ű�� ĥ��, keyTyped called..");
	}

}

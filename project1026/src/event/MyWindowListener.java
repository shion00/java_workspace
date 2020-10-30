package event;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

/*������â�� ������� �߻��� �� �ִ� �̺�Ʈ�� �����ϴ� ������ �����ϱ�!*/
public class MyWindowListener implements WindowListener{
	
	//â�� �㶧
	public void windowOpened(WindowEvent e){
		System.out.println("Opened ȣ���");
	}
	//�ݱ� ��ư�� ������(â�� �������� ����)
	public void windowClosing(WindowEvent e){
		System.out.println("Closing ȣ���");
	}
	//â�� ������
	public void windowClosed(WindowEvent e){
		System.out.println("Closed ȣ���");
	}
	//���� â�� Ȱ��ȭ ��ų��(�� Ŀ���� ���� â�� �ö�� ������϶�)
	public void windowActivated(WindowEvent e){
		System.out.println("Activated ȣ���");
	}
	//���� â�� ��Ȱ��ȭ ��ų��
	public void windowDeactivated(WindowEvent e){
		System.out.println("Deactivated ȣ���");
	}
	//�ּ�ȭ ��ư�� ���� ������ȭ ��ų��
	public void windowIconified(WindowEvent e){
		System.out.println("Iconified ȣ���");
	}
	//������ȭ�� �ݴ�
	public void windowDeiconified(WindowEvent e){
		System.out.println("Deiconified ȣ���");
	}

}

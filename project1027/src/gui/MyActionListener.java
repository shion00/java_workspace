package gui;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.TextField;

public class MyActionListener implements ActionListener{
	Button bt1;
	Button bt2;
	TextField t;
	
	public MyActionListener(Button bt1,Button bt2,TextField t){
		this.bt1=bt1;
		this.bt2=bt2;
		this.t=t;
	}


	//�������̽��� �޼��� �������̵�(Overriding) : �θ��� �޼��� ������!
	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();//�̺�Ʈ�� ����Ų ������Ʈ ��ȯ!!
		//��ư�� ���� �̺�Ʈ��� ��ư�� �ּҰ��� Object��(���� ��ü��)���� �ް� �ǰ�
		//TextField�� ���� �̺�Ʈ��� TextField�� �ּҰ��� Object��(���� ��ü��)���� �ްԵ�

		if(obj==bt1){
			System.out.println("bt1�� �����׿�");
		}else if(obj==bt2){
			System.out.println("bt2�� �����׿�");
		}else if(obj==t){
			System.out.println("t�� �����׿�");
		}


		System.out.println(e);
	}

}

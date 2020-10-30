package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;


class MultiButton extends Frame{
	Button bt1, bt2;
	TextField t;
	
	public MultiButton(){
		bt1=new Button("��ư1");
		bt2=new Button("��ư2");
		t=new TextField(20);

		setLayout(new FlowLayout());
		add(bt1);
		add(bt2);
		add(t);
		
		MyActionListener listener=new MyActionListener(bt1,bt2,t);
		
		bt1.addActionListener(listener);//��ư�� ������ ����
		bt2.addActionListener(listener);//��ư�� ������ ����
		t.addActionListener(listener);//�ؽ�Ʈ�ڽ����� Ŭ���̺�Ʈ ���� �����ϴ�.

		setSize(300,400);
		setVisible(true);
		
	}

	public static void main(String[] args){
		new MultiButton();
	} 

}

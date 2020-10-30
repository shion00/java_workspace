
package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Choice;

class MyWin extends Frame{//MyWin is a Frame
	Button bt;//MyWin has a bt
	TextField t;
	Choice ch;//html�� select option �ڽ��� ����
		
	public MyWin(){
		bt=new Button("�� ������");
		t=new TextField(15);
		ch=new Choice();

		//ch�� ������ ä���
		ch.add("Java Programming");
		ch.add("JSP Programming");
		ch.add("Android Programming");
		ch.add("Spring Programming");
		ch.add("Mybatis Programming");

		this.setLayout(new FlowLayout());//setLayout�� FlowLayout ���� ����

		//��ư�� �����쿡 ����!
		this.add(bt);//�������� ����Ʈ�� BorderLayout �̹Ƿ�, ���Ϳ����� ũ�� ���� ����
		this.add(t);
		this.add(ch);
		
		bt.addActionListener(new MyListener());//��ư�� Ŭ�� ������ ����!!
		t.addKeyListener(new MyKey());//�ؽ�Ʈ�ڽ��� Ű ������ ����
		this.addMouseListener(new MyMouse());//�����Ӱ� ���콺 ������ ����!!!, ��ü�� �����ΰ�? �߿�!
		ch.addItemListener(new MyItem());//���̽��� ������ ����
		addWindowListener(new MyWindowListener());//�����Ӱ� ������ ����, this. ��������

		this.setVisible(true);
		this.setSize(300,400);
	}

	public static void main(String[] args){
		new MyWin();
	}

}

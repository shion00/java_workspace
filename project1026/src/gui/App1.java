/*
�����쿡 �� �� �ִ� ���� ������Ʈ �˾ƺ���
ex) ��ư, �ؽ�Ʈ�ʵ�, �����ڼ�, üũ�ڽ�, ���̽�, �̹���, textarea..
*/
package gui;
import java.awt.Frame;//����Ϸ��� Ŭ������ ��ġ���
									//��򰡿� .class �� �����ϱ� ������ ��밡���� ���̴�.
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Image;
import java.awt.Toolkit;

class App1{
	public static void main(String[] args){
		/*������ ����*/

		/*����ó�� ���� Ŭ������ �������� ��ó��
			������1 : "����Ϸ��� Ŭ������ ���� � �������� �����Ǵ°����� �� �뵵 �ľ��Ѵ� "
		    ������2 : "�ڹ��� ��� ��ü�� �ᱹ 3���� �����ۿ� ����."
			������3 : "Ŭ������ ����� ������̴�. ���� �޸𸮿� �ø��� ���� �˸� �ȴ�!"

				1) �Ϲ�Ŭ���� : new �ϸ� �ȴ�!!, new ���� ������ �����ϸ� �ȴ�(api������ ���ؼ�) 
				2) �߻�Ŭ���� : new �Ұ��ϹǷ�, �ڽ��� �����ؼ� new �ϰų� �̹� ������
								   �ν��Ͻ��� �̿��ϸ� �ȴ�.(api������ ���ؼ�) 
				3) �������̽� : new �Ұ��ϹǷ�, �ڽ��� �����ؼ� new �ϰų� �̹� ������
								  �ν��Ͻ��� �̿��ϸ� �ȴ�.(api������ ���ؼ�) 
								
		*/

		//ó��������, �Ϲ��̱� ������ new ������ ���� �����ڸ� �����ؼ� ����ϸ� �ȴ�!
		Frame frame=new Frame();//�뵵 : �ڹ� ���������α׷��ֿ����� ������!
		//�������� ����Ʈ�� ���� ������ �ʴ� ������, ���� ���̵��� �޼��� ȣ��!
		frame.setVisible(true);//Window ��ü�κ��� ��ӹ��� �޼���
		//�Ű������δ� ������ ����� �� �ִ�.
		//�������� �ʺ�, ���̸� ������ �� �ִ� �޼��� ã��
		frame.setSize(300,400);

		//�����찡 �����Ǿ����Ƿ�, ������ �ȿ� ��ġ�� ���� ������Ʈ �÷����ƺ���~!!
		//��ư Button(�Ϲ�, �߻�, ���� ������, �Ϲ��̸� new)
		Button bt=new Button("�� ��ư");

		//��ư�� �����ϱ� ����, ���̾ƿ� ��Ÿ���� �����ؾ� �ϴµ�, ���̾ƿ��� ���� ���Ŵϱ�
		//�ϴ� FlowLayout �� ����غ���
		FlowLayout flow =new FlowLayout();
		frame.setLayout(flow);//�����쿡 �÷ο� ����� ��ġ����
											//������ â ũ�⸦ ���̸� Ⱦ���� ���ĵǾ� �ִ� ������Ʈ����  
											//�Ʒ��� �������� �ȴ�.�̰� flow(�帥��) ����̶� ǥ���Ѵ�.

		//��ư�� ������ �����̳ʿ� ��������~!!
		frame.add(bt); //add(Component comp) 
								//add �޼����� �Ű������� Component ���̹Ƿ�, 
								//Button �� Component �� �ڽ��̱� ������ ���� �ڷ����� �ش��Ͽ�, 
								//add()�� �μ��� �� �� �ִ�!!!!

		//html ������ input type="text" �� �ڹٿ����� TextField �� �Ѵ�.
		//Checkbox
		//TextArea

			TextField tf=new TextField("ȸ������",10);
			Checkbox ch1=new Checkbox("����");
			Checkbox ch2=new Checkbox("����");
			Checkbox ch3=new Checkbox("��ǻ��");
			TextArea area=	new TextArea(5,20);//5��, 20��

			frame.add(tf);
			frame.add(ch1);
			frame.add(ch2);
			frame.add(ch3);
			frame.add(area);

			//�׳� �ؽ�Ʈ
			Label la=new Label("ȸ������ ����Դϴ�.");
			frame.add(la);


			//�̹��� �ֱ�!!
			//Image �� �߻�Ŭ�����̸�, �÷���(os_win,mac,linux)�� ������ ������� �� �� �ִ�.
			//�÷����� �°� ����������, Toolkit Ŭ�����κ��� �ڿ��� �����Ѵ�.
			Toolkit kit=Toolkit.getDefaultToolkit();//static �޼���!! ���� Ŭ���������� 
																	 //������ �� �ִ�.
			//��Ŷ�� �̹����� ���û��� ��η� ���� ���� �� �ִ�.
			//��λ��� ������ �� : D: �� \(��������)�� ������ os ������ ����ϴ� ǥ�� �̹Ƿ�,
			//���� �� �ڹ��ڵ尡 ��� os���� ����Ƿ���, �߸����� ��η� �����Ѵ�. �׷��� /(������)�� ��ģ��.
			Image img=kit.getImage("D:/workspace/java_workspace/project1026/res/4.png");
			
			System.out.println("�̹��� �ּҰ��� : "+img);//null ������ �� ������ ����

			//ȭ�鿡 ����ϴ� ������ ���� �Ұ�. ��? ���ݱ��� html ������ �̹����� 
			//html������ ���ٿ��� ����������, �ڹٿ� ���� �Ϲ����� ������ ����� ���α׷���
			//������ ������(���� �׸��� �۾�)�� �ؾ� �ϱ� �����̴�.
	
			
	}
}

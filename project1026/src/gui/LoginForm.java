
/* �������� ���� �ۼ����ڵ�� ���� �޶���. 
���� ������ �޶���.��ü����(is a, has a) �߽����� �ڵ带 �ۼ��Ͽ���.*/

package gui;
import java.awt.*;//������������ ���ϴ�.

class LoginForm extends Frame{//is a ����
	/*has a ����� ��������� ��ü���϶��� �ǹ��Ѵ�!!*/
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;
	Panel p_center;//���Ϳ� �׸��带 ������ �г�
	Panel p_south;//���ʿ� ���� �г�(���⿡ ��ư 2�� ���� ����)

	public LoginForm(){//������
		//��ǰ����� ������ �������� ��� �ʱ�ȭ ��Ű��.
		//Ư�� ��ǰ��, �� ��ü�� �¾�� ���� �Բ� �¾�� �ϹǷ�, �������� Ÿ�̹��� ��ġ�� ����!!
		la_id=new Label("ID");
		la_pass=new Label("Password");
		t_id=new TextField(15);
		t_pass=new TextField(15);
		bt_login=new Button("Login");
		bt_regist=new Button("����");
		p_center=new Panel();
		p_south=new Panel();

		//������ �� �����̰�, ���� �����̳� ��Ÿ���� �ο����� �ʾ���.
		//Frame �� �����ڰ� ���̾ƿ��� �������� ������ ����Ʈ�� BorderLayout �̴�.
		//this.setLayout(BorderLayout());//�ʿ� ����!! ����Ʈ�� �̹� �������̾ƿ��̹Ƿ�..

		//ó������ ��ü�� ���� ������ 1.���ϴ� ��ü���� �ľ�, 2.�޸𸮿� �ø��¹�(�Ϲ�,�߻�,�������̽�)
		p_center.setBackground(new Color(153,255,0));
		//�����г��� �������� BorderLayout ���Ϳ� ����!
		this.add(p_center,BorderLayout.CENTER);
		
		//����� �������� �ο��� �������̴�. final �� ���̻� ���� ������ �� ������, static ���� �ν��Ͻ��� 
		//������ �����ϸ�, public ���� �����Ͽ�, ��� ��ü�� ������ �� �ֵ��� ���������� Ǯ����� ������
		p_south.setBackground(Color.YELLOW);//Color �� �ΰ��� ����ϱ� ���� �����ͷ� ����غ���
		this.add(p_south,BorderLayout.SOUTH);
		
		//Panel �� �ƹ��� ��ġ�����ڸ� �������� ������ ����Ʈ�� FlowLayout �̴�!!
		p_south.add(bt_login);
		p_south.add(bt_regist);

		//p_center �� �׸��� ����
		p_center.setLayout(new GridLayout(2,2));//2�� 2��¥�� �׸��� ����
		p_center.add(la_id);//id �� 1�� 1�� ����
		p_center.add(t_id);//id �ؽ�Ʈ�ڽ� 1�� 2�� ����
		p_center.add(la_pass);//pass �� 2�� 1�� ����
		p_center.add(t_pass);//pass �ؽ�Ʈ�ڽ� 2�� 2�� ����

		/*this�� ��Ȯ�� �ǹ� : ���۷��� �����̴�!, �� �� �ڽ��� ��Ʈ�Ͻ��� �ּҰ��� ����..
		�ش� �ν��Ͻ��� �ڱ� �ڽ��� ����ų�� ���δ�.*/
		this.setSize(400,150);//this. ������� �ʾƵ� �ȴ�.
		this.setVisible(true);
	}

	public static void main(String[] args){
		//this. ���� : static�� �ν��Ͻ��� ��������� ���� Ŭ���� ��������(��Ǫ��)�̱� ����
		new LoginForm();
	}

}




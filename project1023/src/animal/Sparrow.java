/*������ �����Ѵ�*/
package animal;

public class Sparrow extends Bird{
	
	String name="�� ����";

	public void jjack(){
		System.out.println("±±");
	}
	
	//�θ�� 100% ������ �޼��带 �����ϴ� ����� �������̵��̶� �Ѵ�.(Overriding)
	//100% ������ �ǹ� : �Ű������� �ִٸ� �� �Ű������� ������ �ڷ������� �����Ͽ��� �Ѵ�.
	//�� �����ϴ°�? �θ��� �޼��带 �ڽĿ���, ����� ����, �߰� �ϴ� ���� ���׷��̵��ϰ� ������ ���

	/* ����! �����ε� vs �������̵�
	�����ε��� '���� Ŭ������'���� ����� ����� �޼������ ���� ���� ������ ����,
	�Ű����� ������ �ڷ������� �����ϸ� �ߺ����Ǹ� �������ְڴ�

	�������̵��� '��Ӱ��賻'���� �ڽ��� �θ��� �޼��带 �������ϴ� ���
	*/
	public void fly(){
		System.out.println("������ ���ƿ�");
	}

	public static void main(String[] args){
		Sparrow sp=new Sparrow();
		sp.fly();//������ �޼��� ȣ��

		Bird bird=new Bird();
		bird.fly();//�θ��� ���� �޼��� ȣ��

		Bird bird1=new Sparrow();
		System.out.println(bird1.name);//�θ��� name�� ��µȴ�.
														 //���۷�������(bird1)�� �� �ν��Ͻ� �ּҴ� 
														 //�ڷ����� ���� ��������.

		Bird bird2=new Sparrow();
		bird2.fly();//�������̵��� �ȴ�. 
						

	}

}

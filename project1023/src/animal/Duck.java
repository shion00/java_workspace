package animal;
public class Duck extends Bird{
	/*Duck is a Bird*/
	/*Duck���� Bird���̴�.*/
	/*������ ����*/
	String name="�� ����";

	public void quack(){
		System.out.println("�в�");
	}

	public static void main(String[] args){
		Duck d1=new Duck();
		Duck d2=new Duck();

		Bird b=new Bird();

		int x=6; //4byte
		byte c=3; //1byte
		x=c; // : ���� �翬��, �������� ���� �ڷ������� ���ϱ�!! 

		//b=d1; : ����
		//b=new Duck();  : ����

		byte k=6;
		short s=8;

		k=s;//�Ұ�, ���� �ڷ������� ū�ڷ����� �������� �Ұ�
		       //�ս��� �����ϰԵ�
			   //�ذ�å)
			   //1) k�� short �̻��� ũ���� �ڷ������� ����
			   //2) �ս��� �����ϰ�, ������(��������ȯ), k=(byte)s; ������� demotion 
			   

		//��ü�ڷ����� �ڷ����̴�!!!
		Duck a =new Duck();
		Bird r= new Bird();
		r=a;//ū<--�� : ����
		a=r;//��<--ū, : �Ұ��� 
		a=(Duck)r; ������� down casting
		r=(Bird)a;//�����ڷ������� ū �ڷ������� �ö�, ������� up casting
		                //�� �̹��� ���ΰ� '����'�� �ɽ��õǾ����..

		//���(��Ģ) : ��ü�ڷ����� �ڷ����̹Ƿ�, �⺻�ڷ����� ��Ģ�� ���κ� �״�� ����ǰ� �ִ�.!!
			 

	}

}

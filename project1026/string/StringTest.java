package string;
class StringTest{
	public static void main(String[] args){
		/*String �� Ŭ������!!
		������ �츮 �ΰ��� ��Ʈ���� �ʹ� �е������� ���� ����ϱ� ������, 
		new �����ڿ� ���� ��Ʈ���� �����ϴ� ���� �ʹ� �����ϴ�!!
		���� String ���ؼ��� ��ġ �Ϲ� ������Ÿ��ó�� new ���� �ʴ� ǥ������ �������ش�.
		�̷��� String �� ��������� �Ͻ���, ������(implicit) �������̶� �Ѵ�.
		������ �������� ���� String �� �������� ���Ǯ(Constant Pool)�� ���� �����Ǿ� ���µ�,
		���Ǯ�� �̹� ������ ��ü�� ������ �ߺ��Ͽ� ���Ӱ� �������� �ʰ� ������ ��ü�� �̿��Ѵ�.*/

		/*�Ʒ� �ڵ��� ������ �����غ���*/
		String s1="apple";
		String s2="apple";
		System.out.println(s1==s2);//����� ���� ���ñ��? 
		//true, ������ ����������� ���Ǯ�� ���� �����ǹǷ� s1�� s2�� �ּҰ��� ����.

		//String �� ���۹����� 'S'�� �빮�ڷκ��� �и� ��ü���̴�!!!!
		//�츮�� ����ȯ�濡�� String.class �� ��򰡿� �־�� �ϴµ�, ������ �ʴ´�.
		//java se�� ��� api�� ���ִ� ����� ���Ͽ� �ִ�.
		//C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar\java\lang
		//�ʼ����� ��ü�� java.lang�� �ִ� ����ְ� import�� �ʿ����� �ʴ�.  
		
		//�Ʒ��� ���� new �����ڿ� ���� ��Ʈ�� �������� ������(explicit) �������̶� �Ѵ�.
		//������ �������� ���Ǯ�� �������� �����Ƿ�, new �Ҷ����� �ߺ� ���θ� ������ �ʰ�
		//������ �����ȴ�!!
		String s3=new String("korea");
		String s4=new String("korea");
		System.out.println(s3==s4);//����� ���� ���ñ��?
		//false, ������ ���������� ���� ��ü�� �����Ͽ� s3�� s4�� �ٸ� �ּҰ��� �����ֱ� �����̴�.
	
		/*s1,s3�� ����� ��� '�ּҰ�'�� �ƴ϶� apple,korea�� ��� �Ǵ� ������?

		�۾��� ���� ������ ��Ʈ�� Ŭ������ ���������� toString() �޼��尡 
		�ڵ�ȣ��Ǽ� �۾��� ǥ���Ǽ� �׷�����
		
		��ü�� ����Ѵٴ°��� ���� �Ұ����ѵ�, ���������� ��Ʈ������ ��ȯ�Ǿ� ��µǴ°ſ���

		��ü�� ���۷��� �ּ��ܾƿ�, �װ� ����Ѵٰ� �ϸ� ���� �ּҰ� ���;� ���ܾƿ�
		�ٵ� �ּҰ� �ȳ�����, �۾��� ���� ������ ��Ʈ�� Ŭ������ ���������� toString() �޼��尡 
		�ڵ�ȣ��Ǽ� �۾��� ǥ���Ǽ� �׷�����
		toString() : �̹� string(���ڿ�)�� ��ü�� �ڱ��ڽ��� ��ȯ�Ѵ�.*/


		//�ּҺ񱳰� �ƴ�, ��ü ���ϼ� ���ϴ� ��
		String k1="orange";
		String k2="orange";
		System.out.println(k1==k2);//�ּ� ��
		System.out.println(k1.equals(k2));//����(��ü) ��


		
	}
}
class UseCat{
	
	public static void main(String[] arrgs){
		Cat c1=new Cat(); //����� �ν��Ͻ� 1�� ����
		System.out.println("����� ź��");
		System.out.println("����� �̸�:"+c1.name);
		System.out.println("����� ����:"+c1.age);
		System.out.println("����� ��ȥ����:"+c1.isMarried);
		
		c1.walk();
		c1.cry();

	}
}

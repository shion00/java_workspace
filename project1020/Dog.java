class Dog{
	String name="����";
	int age=5;
	static String color="white";//�� ������, Ŭ�����κ��� ������ �ν��Ͻ��� �����ö��� ����
											//Ŭ���� ������ �� �޶�پ� �־��, �� �ν��Ͻ� �Ҽ��� �ƴ϶�, Ŭ���� �����Ҽ����� ����!!

	public void bark(){
		System.out.println("����");
	}
	public static void main(String[] args){//java.exe �Ű�����
		//Dog.color="black"; FM���� ǥ�����
		color="yellow";
		
		int a=8;
		Dog d1=new Dog();
		Dog d2=new Dog();
	
		d1.age=13;
		d2.age=9;

		boolean k=true;
	}
}

class UsePizza{
	
	//���ڸ� �Դ´�..
	public void eat(Pizza p){
		p.slice=3;
	}
	
	//������ �����Ѵ�
	public void setSlice(int slice){
		slice=3;
	}

	public static void main(String[] args){
		Pizza p1=new Pizza("������");	
		Pizza p2=new Pizza("���̳�");

		UsePizza up=new UsePizza();
		up.setSlice(5);//���ڵ�� �������
		up.setSlice(p1.slice);//�����꿡 ���� ����x
		up.eat(p2);
	}
}

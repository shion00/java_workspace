class DataType3{

	public static void main(String[] args){
		short s1=3; //(��)
		short s2=4; //(��)
		
		int a1 = 3;//(��)
		int a2 = 4;//(��)
		
		short sum = s1+s2; //(��), 
		//������ ������࿡�� ������ ����� �Ǵ� �����Ͱ� int ������ ���� �ڷ����� ���(byte,short) 
		//����ӵ��� ���̱� ����, ���꿡 ����ȭ�� �ڷ����� int ������ �ڵ����� ����ȯ�� ����Ų��. (�ڵ�����ȯ)
		//�ذ�å1) int sum ���� �ٲ۴�.
		//�ذ�å2) short sum=(short)(s1+s2) ��������ȯ, �սǹ߻� ���� �ϰڴ�.
		//			 (short) ������ �Ұ�ȣ�� cast �����ڶ� �Ѵ�.
		int result = a1+a2;//(��)		
	}
}

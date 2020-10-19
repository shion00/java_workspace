class	DataType4 {
	public static void main(String[] args){
		short s=7;
		byte b=5;

		s=b; //가능? 불가능? 가능, promotion 
		b=(byte)s; //강제 형변환, 큰->작 demotion

	}
}

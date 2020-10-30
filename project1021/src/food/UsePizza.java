class UsePizza{
	
	//피자를 먹는다..
	public void eat(Pizza p){
		p.slice=3;
	}
	
	//갯수를 조정한다
	public void setSlice(int slice){
		slice=3;
	}

	public static void main(String[] args){
		Pizza p1=new Pizza("핏자헛");	
		Pizza p2=new Pizza("도미노");

		UsePizza up=new UsePizza();
		up.setSlice(5);//피자들과 상관없다
		up.setSlice(p1.slice);//파자헛에 영향 전혀x
		up.eat(p2);
	}
}

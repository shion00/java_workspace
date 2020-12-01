package day1029.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;


public class CollectionApp {
	
	public void arr(){
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("강아지");
		arrayList.add("고양이");
		arrayList.add("호랑이");
		arrayList.add("호랑이");
		
		System.out.println("arrayList의 크기는 "+arrayList.size());//중복 허용
		
		for(int i=0;i<arrayList.size();i++) {
			String str=arrayList.get(i);
			System.out.println(str);
		}
	}
	
	public void set() {
		
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("바나나");
		hashSet.add("사과");
		hashSet.add("망고");
		hashSet.add("망고");
		
		System.out.println("hashSet 크기는 "+hashSet.size());//중복 불가
		
		Iterator<String> str=hashSet.iterator();
		
		while(str.hasNext()) {
			String e=str.next();
			System.out.println(e);
		}
	}
	
	public void map() {
		
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "장미");
		hashMap.put(2, "백합");
		hashMap.put(3,"라일락");
		hashMap.put(3,"라일락");
		
		System.out.println("hashMap 크기는 "+hashMap.size());
		
		Set<Integer> set=hashMap.keySet();
		Iterator<Integer> inte=set.iterator();
		
		while(inte.hasNext()) {
			int key=inte.next();
			String value=hashMap.get(key);
			System.out.println(value);
			
		}
	}
	
	public static void main(String[] args) {
		CollectionApp app=new CollectionApp();
		app.arr();
		app.set();
		app.map();
		
	}
}













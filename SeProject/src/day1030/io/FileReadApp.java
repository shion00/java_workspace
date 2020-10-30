package day1030.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Stream 이란? 현실에서는 흐르는 물줄기라는 뜻
 * 					   전산에서는 흐름의 대상이 물이 아닌 데이터이다!!
 * 					   but 전산에서는 흐음의 방향에 따라 다음과 같이 분류(실행중인 프로그램 기준)
 * 				       1) 입력(Input) : 실행붕인 프로그램으로 데이터가 흘러들어가는 것
 * 					   2) 출력(Output) : 실행중인 프로그램에서 데이터가 흘러나오는 것
 * 
 * 자바에서는 입출력과 관련된 패키지명이 java.io 이다!! 여기에는 입출력 처리를 위한 수많은 api 지원됨
 
예외란? 프로그램이 정상 실행되어질 수 없는 예외적인 상황을 의미 (에러), 로직은 정상, 파일없는 경우 발생
		 에러가 발행하면? 프로그램이 비정상 종료가 되버린다.
 * */				

public class FileReadApp {
	//모르는 클래스 대처법 : 1)목적을 안다. 2) 사용하기(메모리에 올리기)위해 만든것이므로 메모리에 올리는 방법을 
	//조사하여 올린다.(일반,추상,인터페이스)
	//파일을 대상으로 데이터를 읽어들이는 FileInputStream 을 학습해본다!!
	FileInputStream fis;

	public FileReadApp(){
		File file=new File("C:/Users/MASTER/eclipse-workspace/SeProject/res/data/memo.txt");
		
		//로컬상의 파일을 대상으로 스트림(관)을 생성하자!!
		try{//이 영역은 에러가 날 가능성이 있는 코드임을 명시
			fis=new FileInputStream(file);//에러가 나면 
			System.out.println("스크림 생성 성공입니다.");
			//sun사에서 미리, 가능성 있는 에러를 객체화 시켜 놓은 것 중 하나
			//만일 우려했던 에러가 발생하면, jvm에 의해 FileNotFoundException 인스턴스가 메모리에 올라오고
			//catch문의 인수의 전달하여, 개발자로 하여금 에러에 대한 정보를 분석할 수 있는 기회를 주는 것이다.
			//예외처리의 목적은? 비정상 종료의 방지!!!!!!!!!!!!!!!!!!!!!
			
			int data;

			while(true){//무한 루프
				data=fis.read();//1byte 읽어들이기
				if(data==-1)break;//파일의 끝에 도달하면, 반복문에서 빠져나와라
				System.out.print((char)data);
			}
		}catch(FileNotFoundException e){//혹여나 우려했던 에러가 발생한다면, 비정상 종료하지말고,
														  //실행부는 이 catch 문 블럭을 수행하라!!
			System.out.println("지정한 파일을 찾을 수 없습니다.");
			e.printStackTrace();//stack 구조로, 에러의 원인을 출력하라!!에러문구의 맨위가 가장 마지막(최근)이다.
		}catch(IOException e){
			
			System.out.println("파일을 읽을 수 없습니다.");
			e.printStackTrace();
		}finally {
			//이 영역은 실행부가 try문을 수행하던, catch문을 수행하던 무조건 거쳐서 가야하느 영역이다. 그러므로
			//이 영역에 자원을 닫는 코드를 작성해야 한다!!
			//주로 데이터베이스와의 연결끊기, 스트림 연결끊기
			if(fis!=null){//DB 와 Stream 은 닫을때 반드시 null 여부를 따져보는 습관을 갖자!!!!, 보잉사에서 서버다운이유
				try {
					fis.close();//스트림을 닫음.null 이 아닐때만. null일 경우 그 유명한 NullPointerException 에러발생
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public static void main(String[] args){
		new FileReadApp();
	}
}


















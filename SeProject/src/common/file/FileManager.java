package common.file;

public class FileManager {
	
	//파일명 구하기 : 매개변수로 파일의 경로를 넘겨받아 파일명만 추출한다.
	public static String getFilename(String path) {
		int lastIndex=path.lastIndexOf("/");//마지막에 위치한 / 의 인텍스 구하기!!
		return path.substring(lastIndex+1, path.length());
	}
	
	//확장자 구하기 : 매개변수로 파일명을 넘겨받아 확장자를 추출한다.
	public static String getExtend(String filename) {
		String[] str=filename.split("\\.");//점을 기준으로 문자열 분리...분리후에는 배열이 반환됨!,,이스케이핑 특수문자 기능을 없애는것 자바에서는 \\ 두번준다.
		return str[1];//두번째 칸이 확장자이다.
	}
	
	
	public static void main(String[] args) {
		 String filename=getFilename("http://image.auction.co.kr/itemimage/18/86/5a/18865a1cd6.jpg");
		 System.out.println(filename);
		 
		 String ext=getExtend(filename);
		 System.out.println(ext);
		 
		 /*
		 String path1="http://image.auction.co.kr/itemimage/18/86/5a/18865a1cd6.jpg";
		 int lastIndex=path1.lastIndexOf("g");
		 System.out.println(path1.length());
		 System.out.println(path1.substring(59,60));
		 */
		 
	}
	
	
}

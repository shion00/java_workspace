
/*연습*/


package day1105.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OracleTest2{
	public static void main(String[] args){
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로드");

			String url="jdbc:oracle:thin:@localhost:1521:EX";
			String user="user1104";
			String password="user1104";

			con=DriverManager.getConnection(url,user,password);

			if(con==null){
				System.out.println("접속 실패");
			}
			else{
				System.out.println("접속 성공");
			}
			
			String sql="insert into member(member_id,name,age,phone)";
			sql+=" values(seq_member.nextval,'adams',38,'010')"";
			pstmt=con.prepareStatement(sql);

			int result=pstmt.executeUpdate();
			if(result!=1){
				System.out.println("sql 실패");
			}else{
				System.out.println("sql 성공");
			}
		
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("드라이버 찾지 못함");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("SQLException");
		}finally{
			if(pstmt!=null){
				try{
					pstmt.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
				
			}
		}

	System.exit(0);
	}
}

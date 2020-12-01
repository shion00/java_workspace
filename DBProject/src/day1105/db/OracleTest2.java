
/*����*/


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
			System.out.println("����̺� �ε�");

			String url="jdbc:oracle:thin:@localhost:1521:EX";
			String user="user1104";
			String password="user1104";

			con=DriverManager.getConnection(url,user,password);

			if(con==null){
				System.out.println("���� ����");
			}
			else{
				System.out.println("���� ����");
			}
			
			String sql="insert into member(member_id,name,age,phone)";
			sql+=" values(seq_member.nextval,'adams',38,'010')"";
			pstmt=con.prepareStatement(sql);

			int result=pstmt.executeUpdate();
			if(result!=1){
				System.out.println("sql ����");
			}else{
				System.out.println("sql ����");
			}
		
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("����̹� ã�� ����");
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

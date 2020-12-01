/*
�ڹٿ��� �����ͺ��̽��� �����ϴ� ����� ������ JDBC(Java DataBase Connectivity)��� �ϸ� 
java.sql ��Ű������ api�� �����ȴ�.
ojdbc6.jar�� ����Ŭ���� �����ϴ� �ڹٿ��� ����Ŭdb�� �����ϱ� ���� ����ϴ� ����̹��̴�.
�����ͺ��̽� ���� ������ ����
1) DB������ �˸��� ����̹��� �ε� (oracle, mysql, mssql..�� jar�� �ʿ���)
2) ����
3) ���ϴ� ���� ����
4) ��������(Ư�� ��Ʈ�� �� DB�� ��� �� �ݵ�� ���� ����!!)

Ŭ�����н� ���
D:\workspace\java_workspace\DBProject\bin
D:\workspace\java_workspace\DBProject\lib\ojdbc6.jar

*/
package day1105.db;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class OracleTest{
	public static void main(String[] args){
		Connection con=null;//���������̱� ������ �����ڰ� �ݵ�� �ʱ�ȭ�ؾ� ��(�������ó�� �ڵ����� ���ִ��� ����!!)
		PreparedStatement pstmt=null;

		try{
				Class.forName("oracle.jdbc.driver.OracleDriver");//����ϰ����ϴ� ����̹� Ŭ������ ���!(static������ Ŭ���� �ε�)
				//���� ������� os�÷����� Ŭ���� �н��� ��ϵǾ� �־�� �Ѵ�.
				System.out.println("����̹� �ε� ����");
				
				//DB������ url, id, password
				String url="jdbc:oracle:thin:@localhost:1521:XE";//���� ������ ��Ģ(6��), �������α׷�:���Ӵ��db:���ӹ��:ip:��Ʈ��ȣ:db�̸�
				String user="user1104";
				String password="user1104";
				
				//���� �õ���, ������ �����Ǹ� Connection �̶�� �������̽��� �ν��Ͻ��� ��ȯ����!
				//Connection���� ������ ���� ������ ����ִ�.!!
				//���� ���� ���δ� Connection ��ü�� null ���η� �Ǵ��Ѵ�!
				con=DriverManager.getConnection(url,user,password);//���ӽõ�!!
				if(con==null){
					System.out.println("���� ����");
				}else{
					System.out.println("���� ����");
					//���� ���������Ƿ�, �������� ���� �� �� �ִ�.
					//�������� �����ϴ� ��ü�� �ٷ� PreparedStatement �������̽� �̴�!!

					String sql="insert into member(member_id,name,age,phone)";
					sql+=" values(seq_member.nextval,'adams',38,'010')";//�ܼ��� �ƴϱ� ������ �ֿܼ��� �ִ� ;�� �����Ѵ�.
					
					//���� ������ �Ǿ��, �������� ������ �� �����Ƿ�, Connection��ü�� ���� �ν��Ͻ��� ���� �Ѵ�!!
					pstmt=con.prepareStatement(sql);//���������� �غ��!

					//���� ���� �� �������θ� �Ǵ��ϱ� ���ؼ��� executeUpdate() �޼����� ��ȯ���� �̿��Ѵ�.
					//��ȯ���� int ���̸�, ������ ���࿡ ���� �ݿ��� ���ڵ��� ���� ��ȯ�Ѵ�.
					//���� insert�� ��� ��ȯ���� 1, update, delete�� ����� ����޾Ҵ��� �� ���� ����.���ǿ� ���� �ٸ��� ����
					//��ġ��  insert, update, delete�� ��� 0�̶�� ���з� �����ϸ� �ȴ�!
					int result=pstmt.executeUpdate();//DML(insert, updata, delete)��������� �� �޼��� �����
					if(result!=1){
						System.out.println("�Է½���");
					}else{
						System.out.println("�Է¼���");
					}
				}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("������ ����̹��� ã�� �� �����ϴ�.");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("SQLException �߻�");
		}finally{
			//DB ������ ���Ǿ��� ��� ��ü�� �ݾƾ� �Ѵ�.
			if(pstmt!=null){//�����Ҷ���..�ݴ´�
				try{
					pstmt.close();
				}catch(SQLException e){
			
				}
			}
			if(con!=null){//�����Ҷ���..�ݴ´�
				try{
					con.close();
				}catch(SQLException e){
			
				}
			}
		}
	}

}


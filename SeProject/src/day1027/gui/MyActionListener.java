package day1027.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/*버튼에는 클릭, 텍스트박스-엔터 등
 * 버튼에 클릭이벤트를 감지해보자!!*/
public class MyActionListener implements ActionListener{
	JTextArea area;
	JTextField t_input;
	
	public MyActionListener(JTextArea area,JTextField t_input){//getText() 가 있기에 msg 안가져와도 된다.
		this.area=area;
		this.t_input=t_input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			String msg=t_input.getText();
			area.append(msg+"\n");
			t_input.setText("");
	}

	
}

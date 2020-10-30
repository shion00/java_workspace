package day1030.io;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Copy extends JFrame implements ActionListener{
	JLabel ori;
	JLabel cop;
	JTextField ori_dir;
	JTextField copi_dir;
	JButton bt;
	FileInputStream fis;
	FileOutputStream fos;
	String s;
	
	public Copy() {
		//
		ori=new JLabel("원본");
		cop=new JLabel("복사본");
		ori_dir=new JTextField(15);
		copi_dir=new JTextField(15);
		bt=new JButton("copy");
		
		//
		add(ori);
		add(ori_dir);
		add(cop);
		add(copi_dir);
		add(bt);
		bt.addActionListener(this);
		
		//
		try {
			fis=new FileInputStream(Sting s);
			fis.read();
			fos=new FileOutputStream();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//
		setLayout(new FlowLayout());
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("보");
	}
	
	
	public static void main(String[] args) {
		new Copy();
	}

}











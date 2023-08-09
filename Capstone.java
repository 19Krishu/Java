import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Capstone implements ActionListener {
		JFrame jf;
		JLabel l1,l2,l3;
		JTextField t1,t2;
		JButton b1;
		 
		public Capstone() {
			//TODO Auto-generated constructor  stub
			jf = new JFrame("Login Page");
			jf.setSize(300, 300);
			jf.setLayout(null);
			jf.setVisible(true);
			
			t1 = new JTextField();
			t2 = new JTextField();
			
			l1 = new JLabel("Login Page");
			l2 = new JLabel("Username");
			l3 = new JLabel("Password");
			
			b1 = new JButton("Login");
			
			jf.add(t1);
			jf.add(t2);
			
			jf.add(l1);
			jf.add(l2);
			jf.add(l3);
			
			jf.add(b1);
			
			l1.setBounds(100, 50, 120, 20);
			
			l2.setBounds(50, 100, 120, 20);
			t1.setBounds(120,100,120,20);
			
			l3.setBounds(50,150,120,20);
			t2.setBounds(120,150,120,20);
			
			b1.setBounds(100,200,90,20);
			
			b1.addActionListener(this);			
		}
		public static Connection createConnection() 
		{
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application","root","190204");
			}catch(Exception e) {
				// TODO: handle exception
			}
			return conn;
		}
		public static void main(String[] args) {
			new Capstone();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1){
					new Capstone_Info();
			}
		}
	}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Capstone_Signin implements ActionListener{
	JFrame jf;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1;
	
	public Capstone_Signin() {
		//TODO Auto-generated constructor  stub
		jf = new JFrame("Sign-in Page");
		jf.setSize(350, 350);
		jf.setLayout(null);
		jf.setVisible(true);
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
		l1 = new JLabel("First Name");
		l2 = new JLabel("Last Name");
		l3 = new JLabel("Contact No");
		l4 = new JLabel("E-mail");
		
		b1 = new JButton("Sign in");
		
		jf.add(t1);
		jf.add(t2);
		jf.add(t3);
		jf.add(t4);
		
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l4);
		
		jf.add(b1);
		
		l1.setBounds(60, 50, 150, 20);
		l2.setBounds(60, 100, 150, 20);
		l3.setBounds(60, 150, 150, 20);
		l4.setBounds(60, 200, 150, 20);
		
		t1.setBounds(130, 50, 150, 20);
		t2.setBounds(130, 100, 150, 20);
		t3.setBounds(130, 150, 150, 20);
		t4.setBounds(130, 200, 150, 20);
		
		b1.setBounds(80, 250, 160, 20);
		
		b1.addActionListener(this);
	}
	public static Connection createConnection()
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application","root","190204");
		}catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
		
	}
	public static void main(String[] args) {
		new Capstone_Signin();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			new Capstone_Info();
		}
	}
}

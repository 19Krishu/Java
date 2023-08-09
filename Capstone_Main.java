import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Capstone_Main implements ActionListener {
	JFrame jf;
	JButton b1,b2;
	
	public Capstone_Main() {
		//TODO Auto-generated constructor  stub
		jf = new JFrame("Main Page");
		jf.setSize(300, 300);
		jf.setLayout(null);
		jf.setVisible(true);
		
		b1 = new JButton("Login");
		b2 = new JButton("Sign in");
		
		jf.add(b1);
		jf.add(b2);
		
		b1.setBounds(50, 120, 90, 20);
		b2.setBounds(150, 120, 90, 20);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public static Connection createConnection() 
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root", "190204");
		}catch(Exception e) {
			//TODO: handle exception
		}
		return conn ;
		
	}
	
	public static void main(String[] args) {
		new Capstone_Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			new Capstone();
		}else if(e.getSource()==b2) {
			new Capstone_Signin();
		}
	}

}

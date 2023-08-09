import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Capstone_Info implements ActionListener{
	JFrame jf;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	 
	public Capstone_Info() {
		//TODO Auto-generated constructor  stub
		jf = new JFrame("Bus Booking");
		jf.setSize(300, 300);
		jf.setLayout(null);
		jf.setVisible(true);
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		
		l1 = new JLabel("From");
		l2 = new JLabel("To");
		l3 = new JLabel("No.of seats");
		
		b1 = new JButton("Search Buses");
		
		jf.add(t1);
		jf.add(t2);
		jf.add(t3);
		
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		
		jf.add(b1);
		
		l1.setBounds(80, 50, 150, 20);
		l2.setBounds(80, 100, 150, 20);
		l3.setBounds(50, 150, 150, 20);
		
		t1.setBounds(120, 50, 150, 20);
		t2.setBounds(120, 100, 150, 20);
		t3.setBounds(120, 150, 150, 20);
		
		b1.setBounds(70, 200, 160, 20);
		
		b1.addActionListener(this);
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
		return conn;
		
	}
	public static void main(String[] args) {
		new Capstone_Info();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			new Capstone_Tickets();
		}
	}

}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Capstone_Tickets implements ActionListener {
	JFrame jf;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1;
	
	public Capstone_Tickets() {
		//TODO Auto-generated constructor  stub
		jf = new JFrame("Tickets");
		jf.setSize(300, 300);
		jf.setLayout(null);
		jf.setVisible(true);
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
		l1 = new JLabel("Name");
		l2 = new JLabel("Bus Details");
		l3 = new JLabel("Time");
		l4 = new JLabel("Cost of Tickets");
		
		b1 = new JButton("Submit");
		
		jf.add(t1);
		jf.add(t2);
		jf.add(t3);
		jf.add(t4);
		
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l4);
		
		jf.add(b1);
		
		l1.setBounds(50, 50, 120, 20);
		l2.setBounds(50, 80, 120, 20);
		l3.setBounds(50, 110, 120, 20);
		l4.setBounds(50, 140, 120, 20);
		
		t1.setBounds(140, 50, 120, 20);
		t2.setBounds(140, 80, 120, 20);
		t3.setBounds(140, 110, 120, 20);
		t4.setBounds(140, 140, 120, 20);
		
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
		new Capstone_Tickets();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

import java.sql.Connection;

import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Demo implements ActionListener {
	JFrame jf;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	private int Integer;
	
	public Swing_Demo()
	{
		jf=new JFrame("My Frame");
		jf.setSize(300,300);
		jf.setLayout(null);
		jf.setVisible(true);
		
		b1= new JButton("Insert");
		b2= new JButton("Select");
		b3= new JButton("Upadate");
		b4= new JButton("Delete");
		
		l1 = new JLabel("ID");
		l2 = new JLabel("Name");
		l3 = new JLabel("Email");
		l4 = new JLabel("City");
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		
		jf.add(t1);
		jf.add(t2);
		jf.add(t3);
		jf.add(t4);
		
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l4);
		
		l1.setBounds(50, 50, 120, 20);
		l2.setBounds(50, 80, 120, 20);
		l3.setBounds(50, 110, 120, 20);
		l4.setBounds(50, 140, 120, 20);
		
		t1.setBounds(120, 50, 120, 20);
		t2.setBounds(120, 80, 120, 20);
		t3.setBounds(120, 110, 120, 20);
		t4.setBounds(120, 140, 120, 20);
		
		b1.setBounds(40, 200, 90, 15);
		b2.setBounds(40, 230, 90, 15);
		b3.setBounds(150, 200, 90, 15);
		b4.setBounds(150, 230, 90, 15);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public static Connection createConnection()
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Swing","root","190204");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	
	public static void main(String[] args) {
		new Swing_Demo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			System.out.println("Insert Button click");
			String n = t2.getText();
			String c= t3.getText();
			String em= t4.getText();
			try {
				Connection conn = Swing_Demo.createConnection();
				String sql = "insert into student(name, email, city)values(?,?,?)";
				java.sql.PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, n);
				pst.setString(2, c);
				pst.setString(3, em);
				pst.executeUpdate();
				System.out.println("Data Inserted");
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Insert Exception :"+e2);
			}
		}
		else if(e.getSource()==b2)
		{
			System.out.println("Select Button click");
			int id= Integer;
			
		}
		else if(e.getSource()==b3)
		{
			System.out.println("Update Button click");
		}
		else if(e.getSource()==b4)
		{
			System.out.println("Delete Button click");
		}
	}
}


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q1 {
    JFrame jf;
    JTextField t1, t2, t3, t4, t5, t6;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JButton b1, b2, b3, b4, b5, b6;
	private Q1 swingframe;

    public Q1() {
        jf = new JFrame("Java Database - Krisha");
        jf.setSize(450, 350);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.PINK);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();

        l1 = new JLabel("Book ID");
        l2 = new JLabel("Book Name");
        l3 = new JLabel("Book Store Name");
        l4 = new JLabel("Book Address");
        l5 = new JLabel("Book Price");
        l6 = new JLabel("Book Quantity");
        l7 = new JLabel("Book Management");

        b1 = new JButton("Insert");
        b2 = new JButton("Update");
        b3 = new JButton("Select");
        b4 = new JButton("Delete");

        jf.add(t1);
        jf.add(t2);
        jf.add(t3);
        jf.add(t4);
        jf.add(t5);
        jf.add(t6);

        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(l4);
        jf.add(l5);
        jf.add(l6);
        jf.add(l7);

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);

        l7.setBounds(125, 15, 250, 25);
        l1.setBounds(25, 50, 120, 20);
        t1.setBounds(175, 50, 180, 20);

        l2.setBounds(25, 75, 120, 20);
        t2.setBounds(175, 75, 180, 20);

        l3.setBounds(25, 100, 300, 20);
        t3.setBounds(175, 100, 180, 20);

        l4.setBounds(25, 125, 460, 20);
        t4.setBounds(175, 125, 180, 20);

        l5.setBounds(25, 150, 120, 20);
        t5.setBounds(175, 150, 180, 20);

        l6.setBounds(25, 175, 120, 20);
        t6.setBounds(175, 175, 180, 20);

        b1.setBounds(25, 225, 75, 20);
        b2.setBounds(110, 225, 75, 20);
        b3.setBounds(195, 225, 75, 20);
        b4.setBounds(280, 225, 75, 20);
    }

    public static void main(String[] args) {
        new Q1();
    }
    public static Connection createConnection()
	{
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Q1","root","190204");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught : "+e);
		}
		return conn;
	}

	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
		System.out.println("Insert Button Click");
		String f=t2.getText();
		String l=t3.getText();
		String c=t4.getText();
		try {
			Connection conn= swingframe.createConnection();
			String sql="insert into book(B_id,B_Name,B_SN,B_Address,B_Price,B_Qty) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,"Java Beginner");
			pst.setString(2,"Bhagwati");
			pst.setString(3,"XYZ");
			pst.executeUpdate();
			System.out.println("Data inserted");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");

		} catch(Exception e2) {
			System.out.println("Insert Exception:"+e2);
		}
	}
	}
}

package Drive;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import beans.SRegisterBeans;
import db.SessionProvider;

import org.hibernate.HibernateException;
import org.hibernate.Session;

class admin extends JFrame {
	 ResultSet rs;
	 JLabel l1, l2, l3, l4, l5;
	 JTextField t2;
	 JPasswordField t1;
	 JButton login;
	 String fname, ss, s11, s;
	 int id, i, il;
	//class MenuPaneHyperlinkListener implements HyperlinkListener
	 public admin() {
	 Font ff1 = new Font("Serif", Font.BOLD, 40);
	 Font ff2 = new Font("Serif", Font.BOLD, 28);
	 Font ff3 = new Font("Serif", Font.BOLD, 18);
	 setVisible(true);
	 setSize(1370, 750);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 l4 = new JLabel();
	 l5 = new JLabel();
	 JPanel aa1 = new JPanel();
	 aa1.setLayout(null);
	 aa1.setBackground(Color.BLUE);
	 aa1.setBounds(400, 100, 500, 100);
	 JPanel aa = new JPanel();
	 aa.setLayout(null);
	 aa.setBackground(Color.BLUE);
	 aa.setBounds(450, 300, 450, 400);
	 add(aa1);
	 add(aa);
	 l1 = new JLabel("Log in Admin");
	 l1.setForeground(Color.white);
	 l2 = new JLabel(" Enter Admin id");
	 l4.setBounds(380, 150, 300, 30);
	 l3 = new JLabel("Enter Password");
	 l3.setForeground(Color.white);
	 l3.setBounds(130, 190, 300, 50);
	 l5.setBounds(380, 250, 300, 30);
	 l1.setFont(ff1);
	 l2.setFont(ff2);
	 l3.setFont(ff2);
	 l4.setFont(ff3);
	 l5.setFont(ff3);
	 l1.setBounds(100, 10, 400, 50);
	 l2.setBounds(120, 100, 300, 50);
	 l2.setForeground(Color.white);
	 t1 = new JPasswordField();
	 t2 = new JTextField();
	 aa.setBounds(400, 150, 500, 450);
	 aa.setBackground(new Color(0, 0, 0, 80));
	 t2.setBounds(130, 150, 240, 35);
	 t1.setBounds(130, 250, 240, 35);
	 login = new JButton("Log in");
	 login.setBounds(200, 310, 100, 35);
	 login.setBackground(Color.white);
	 aa.add(l4);
	 aa.add(l5);
	 aa1.add(l1);
	 aa.add(l2);
	 aa.add(t2);
	 aa.add(l3);
	 aa.add(t1);
	 aa.add(login);
	 login.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 if (e.getSource() == login) {
	 i = t2.getText().length();
	
	char[] s2 = t1.getPassword();
	 char[] c1 = t1.getPassword();
	 s = new String(c1);
	il = (s.length());
	s11 = t2.getText();

	 try {
	 try {
	 Class.forName("com.mysql.jdbc.Driver");
	 } catch (ClassNotFoundException ex) {
	 Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
	 }
	Connection con = 
	DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_report", "root", "1234");
	 String query = "SELECT * FROM admin";
	// create the java statement
	Statement st = con.createStatement();
	 // execute the query, and get a java 
	ResultSet rs = st.executeQuery(query);
	 // iterate through the java resultset
	while (rs.next()) {
	 id = (rs.getInt("aeid"));
	fname = rs.getString("apass");
	 ss = Integer.toString(id);
	System.out.println(ss);
	System.out.println(fname);
	System.out.println(s);
	System.out.println(s11);
	 System.out.println(i);
	 if (i <= 1) {
	 l4.setText("enter only no.");
	 l4.setForeground(Color.RED);
	 }
	if (il <= 1) {
	 l5.setText("enter pass.");
	l5.setForeground(Color.RED);
	 } else {
	 if (!ss.equals(s11)) {
	 l4.setText("**illegal id");
	l4.setForeground(Color.RED);
	 }
	 if (!fname.equals(s)) {
	 l5.setText("**illegal pass");
	l5.setForeground(Color.RED);
	 }
	 if (ss.equals(s11)) {
	 System.out.println("snvlshfks")
	;
	l4.setText("");
	//
	 if (fname.equals(s)) {
	 l5.setText("");
	 accont f2= new accont();
	Container c3 = f2.getContentPane();
	ImageIcon img = new 
	ImageIcon("./1.jpg");
	 Image image = 
	img.getImage(); // transform it
	 Image newimg = 
	image.getScaledInstance(1370, 730, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
	 img = new ImageIcon(newimg);
	 JLabel lll = new JLabel("", img, JLabel.LEFT);
	JPanel aa = new JPanel();
	aa.setBounds(0, 0, 500, 400);
	 lll.setBounds(0, 0, 1370, 720);
	c3.add(lll);
	 }
	 }
	 }
	 }
	 st.close();
	 } catch (SQLException ex) {
	 System.err.println("Got an exception! ");
	 System.err.println(ex.getMessage());
	 }
	 }
	 //c2.add(lll);
}
	 });
	 }
	 }	

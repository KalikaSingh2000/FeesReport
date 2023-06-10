package Drive;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class editacc extends JFrame {
	 JPasswordField tt1;
	 ResultSet rs;
	 JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l14, l15, l16, l17, 
	ll4, ll5, h1;
	 JTextField t1, t2, t3, t4, t5, t9, t10, textfield, te1, te2, 
	te3, te4, tt2, t11, t12;
	 JButton sub, can, login;
	 JComboBox bo1, bo2, bo3;
	 JRadioButton ch, ch1;
	 String ss, fname, s, s11, s1, s2, s3, s4, s5, s6, s7, s8;
	 String ss1, ss2, ss3, ss4, ss5, ss6, ss7, ss8;
	 JPanel aa, aa1, aab1, aab;
	 int i, il, id;
	 Font ff1, ff2, ff3;
	 public editacc() {
	 setVisible(true);
	 setSize(1370, 750);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 ff1 = new Font("Serif", Font.BOLD, 40);
	 ff2 = new Font("Serif", Font.BOLD, 28);
	 ff3 = new Font("Serif", Font.BOLD, 18);
	 aab1 = new JPanel();
	 aab1.setLayout(null);
	 aab1.setBackground(Color.orange);
	 aab1.setBounds(570, 5, 800, 100);
	 aab = new JPanel();
	 aab.setLayout(null);
	 aab.setBackground(new Color(0, 0, 0, 170));
	 aab.setBounds(570, 50, 800, 700);
	 aa1 = new JPanel();
	 aa1.setLayout(null);
	 aa1.setBackground(Color.pink);
	 aa1.setBounds(10, 5, 550, 100);
	 aa = new JPanel();
	 aa.setLayout(null);
	 aa.setBackground(new Color(0, 0, 0, 170));
	 aa.setBounds(10, 5, 550, 800);
	 add(aa);
	 add(aa1);
	 add(aab1);
	 add(aab);
	 tt2 = new JTextField();
	 tt1 = new JPasswordField();
	 JLabel ll1 = new JLabel("Log in Accountant");
	 JLabel ll2 = new JLabel(" Enter Accountant id");
	 JLabel ll3 = new JLabel(" Enter Password");
	 ll4 = new JLabel("");
	 ll5 = new JLabel("");
	 login = new JButton("Submit");
	 ll1.setForeground(Color.red);
	 ll2.setForeground(Color.red);
	 ll3.setForeground(Color.red);
	 ll5.setForeground(Color.red);
	 ll1.setFont(ff1);
	 ll2.setFont(ff2);
	 ll3.setFont(ff2);
	 ll4.setFont(ff3);
	 ll5.setFont(ff3);
	 ll1.setBounds(150, 30, 300, 50);
	 ll2.setBounds(170, 150, 300, 50);
	 tt2.setBounds(150, 215, 250, 35);
	 ll4.setBounds(420, 215, 250, 35);
	 ll3.setBounds(170, 260, 300, 50);
	 tt1.setBounds(150, 320, 250, 35);
	 ll5.setBounds(420, 320, 250, 35);
	 login.setBounds(210, 380, 100, 35);
	 ll1.setForeground(Color.red);
	 ll2.setForeground(Color.red);
	 ll3.setForeground(Color.red);
	 ll4.setForeground(Color.red);
	 login.setBackground(Color.GREEN);
	 aa.add(tt2);
	 aa.add(ll3);
	 aa.add(tt1);
	 aa.add(login);
	 aa.add(ll4);
	 aa.add(ll5);
	 aa1.add(ll1);
	 aa.add(ll2);
	 login.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 if (e.getSource() == login) {
	 i = tt2.getText().length();
	char[] s2 = tt1.getPassword();
	 char[] c1 = tt1.getPassword();
	s = new String(c1);
	il = (s.length());
	 s11 = tt2.getText();
	 System.out.println(s11);
	 try {
	 try {
	 Class.forName("com.mysql.jdbc.Driver");
	 } catch (ClassNotFoundException ex) {
	 Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
	 }
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_report", "root", "1234");
	 String query = "SELECT * FROM accountent";
	// create the java statement
	Statement st = con.createStatement();
	 // execute the query, and get a java 
	ResultSet rs = st.executeQuery(query);
	 // iterate through the java resultset
	 // iterate through the java resultset
	while (rs.next()) {
	 ss = (rs.getString("aeid"));
	 fname = rs.getString("apass");
	 if (i <= 1) {
	 ll4.setText("enter only no.");
	ll4.setForeground(Color.RED);
	 }
	if (il <= 1) {
	 ll5.setText("enter pass.");
	ll5.setForeground(Color.RED);
	 } else {
	 if (!ss.equals(s11)) {
	 ll4.setText("**illegal id");
	ll4.setForeground(Color.RED);
	 }
	if (!fname.equals(s)) {
	 ll5.setText("**illegal pass");
	ll5.setForeground(Color.RED);
	 }
	 }
	 if (ss.equals(s11)) {
	 ll4.setText("");
	 ll4.setForeground(Color.RED);
	if (fname.equals(s)) {
	 ll5.setText("");
	ll5.setForeground(Color.RED);
	s1 = rs.getString("aname");
	s3 = rs.getString("afname");
	s4 = rs.getString("adob");
	s5 = rs.getString("aemail");
	s6 = rs.getString("amon");
	s7 = rs.getString("agender");
	s7 = rs.getString("apin");
	s8 = rs.getString("aadd");
	ff2 = new Font("Serif", 
	Font.BOLD, 15);
	h1 = new JLabel("EDIT ACCOUNTENT");
	h1.setBounds(120, 20, 680, 80);
	 h1.setFont(ff1);
	 h1.setForeground(Color.black);
	aab1.add(h1);
	l1 = new JLabel("FIRST NAME");
	l2 = new JLabel("(max 30 characters a-z and A-Z)");
	 l3 = new JLabel("FATHER NAME");
	l4 = new JLabel("(max 30 characters a-z and A-Z)");
	 l5 = new JLabel("DATE OF BIRTH");
	 l6 = new JLabel(" EMAIL ID");
	l7 = new JLabel("MOBILE NUMBER");
	l8 = new JLabel("(10 digit number)");
	 l9 = new JLabel("GENDER");
	 l17 = new JLabel("ADDRESS");
	 l15 = new JLabel("PIN CODE");
	l14 = new JLabel("(6 digit number)");
	 l16 = new JLabel("(max 150 characters a-z and A-Z)");
	 t1 = new JTextField(s1);
	t2 = new JTextField(s3);
	t3 = new JTextField(s4);
	t4 = new JTextField(s5);
	t5 = new JTextField(s6);
	t9 = new JTextField(s7);
	 t10 = new JTextField(s8);
	textfield = new JTextField();
	te1 = new JTextField();
	te2 = new JTextField();
	te3 = new JTextField();
	 te4 = new JTextField();
	 ch = new JRadioButton("Male");
	ch1 = new JRadioButton("FeMale");
	 aab.add(ch);
	 aab.add(ch1);
	 ButtonGroup gb1 = new ButtonGroup();
	gb1.add(ch);
	gb1.add(ch1);
	String arr3[] = {"YY", "1980", 
	"1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", 
	"1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", 
	"1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", 
	"2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", 
	"2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", 
	"2021"};
	 bo3 = new JComboBox(arr3);
	String arr[] = {"DD", "1", "2", 
	"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", 
	"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
	"26", "27", "28", "29", "30", "31"};
	 bo2 = new JComboBox(arr);
	String arr2[] = {"MM", "jan", 
	"Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "oct", 
	"Nov", "Dec"};
	 bo1 = new JComboBox(arr2);
	//bo4 = new JTextField("");
	l1.setBounds(150, 80, 100, 30);
	t1.setBounds(250, 80, 200, 30);
	l2.setBounds(460, 80, 200, 40);
	l3.setBounds(130, 130, 150, 30);
	 t2.setBounds(250, 130, 200, 30);
	 l4.setBounds(460, 120, 200, 40);
	l5.setBounds(120, 170, 170, 40);
	bo1.setBounds(250, 175, 50, 30);
	 bo2.setBounds(310, 175, 50, 30);
	 bo3.setBounds(370, 175, 60, 30);
	 l6.setBounds(150, 225, 100, 40);
	t4.setBounds(250, 225, 200, 30);
	 l7.setBounds(100, 265, 200, 40);
	t5.setBounds(250, 265, 200, 30);
	 l8.setBounds(460, 225, 100, 40);
	 l9.setBounds(150, 305, 100, 40);
	 ch.setBounds(250, 305, 80, 30);
	ch1.setBounds(350, 305, 80, 30);
	 l17.setBounds(150, 345, 200, 30);
	 l15.setBounds(150, 385, 100, 40);
	 l14.setBounds(460, 385, 200, 40);
	t9.setBounds(250, 385, 200, 30);
	l16.setBounds(460, 430, 200, 40);
	 // l17.setBounds(150, 430, 200, 40);
	t10.setBounds(250, 345, 200, 30);
	 l1.setFont(ff2);
	l2.setFont(ff2);
	l3.setFont(ff2);
	l4.setFont(ff2);
	l5.setFont(ff2);
	l6.setFont(ff2);
	 l7.setFont(ff2);
	 l8.setFont(ff2);
	l9.setFont(ff2);
	l14.setFont(ff2);
	l15.setFont(ff2);
	 l16.setFont(ff2);
	 l17.setFont(ff2);
	l1.setForeground(Color.red);
	l2.setForeground(Color.red);
	 l3.setForeground(Color.red);
	l4.setForeground(Color.red);
	l5.setForeground(Color.red);
	l6.setForeground(Color.red);
	 l7.setForeground(Color.red);
	 l8.setForeground(Color.red);
	l9.setForeground(Color.red);
	l15.setForeground(Color.red);
	 l16.setForeground(Color.red);
	 l17.setForeground(Color.red);
	 aab.add(l1);
	aab.add(t1);
	aab.add(l2);
	 aab.add(l3);
	 aab.add(t2);
	aab.add(l4);
	aab.add(l5);
	aab.add(bo1);
	 aab.add(bo2);
	 aab.add(bo3);
	aab.add(l6);
	aab.add(t4);
	aab.add(l7);
	 aab.add(t5);
	 aab.add(l8);
	aab.add(l9);
	 //aab.add(bo4);
	aab.add(l17);
	 aab.add(t10);
	 aab.add(l15);
	aab.add(l14);
	aab.add(t9);
	// aa.add(sub);
	 sub = new JButton("Update");
	 can = new JButton("Cancel");
	can.setBackground(Color.PINK);
	sub.setBackground(Color.PINK);
	 can.setBounds(450, 420, 80, 35);
	 sub.setBounds(250, 420, 80, 35);
	can.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 editacc f1 = new editacc();
	Container c3 = f1.getContentPane();
	ImageIcon img = new ImageIcon("./1.jpg");
	 Image image = img.getImage(); // transform it scale it the smooth way
	Image newimg = image.getScaledInstance(1370, 730, java.awt.Image.SCALE_SMOOTH); // 
	
	 img = new ImageIcon(newimg);
	 JLabel lll = new JLabel("", img, JLabel.LEFT);
	JPanel aa = new JPanel();
	 aa.setBounds(0, 0, 500, 400);
	 lll.setBounds(0, 0, 1370, 720);
	c3.add(lll);
	 }
	 });
	 sub.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e1) {
	 int x = 0;
	 String s14 = new String();
	 if (e1.getSource() == sub) {
	 ss1 = t1.getText();
	ss3 = t2.getText();
	ss4 = t3.getText();
	ss5 = t4.getText();
	ss6 = t5.getText();
	 //String s7 = bo4.getText();
	 ss7 = t9.getText();
	ss8 = t10.getText();
	// String s10 = t10.getText();
	 // String s11 = t12.getText();
	 String s16;
	 te1.setText((String) bo2.getSelectedItem());
	 textfield.setText((String) bo1.getSelectedItem());
	 te2.setText((String) bo3.getSelectedItem());
	 String s17 = textfield.getText() + "/" + te1.getText() + "/" + te2.getText();
	 int ln9 = ch.getText().length();
	int ln10 = ch.getText().length();
	s16 = ch.getText() + ch1.getText();
	 System.out.print(s16);
	// s16=ch1.getText();
	 System.out.println(s16);
	 int ln2 = s3.length();
	 int ln3 = s4.length();
	int ln4 = s5.length();
	int ln5 = s6.length();
	 int ln6 = s7.length();
	 // int ln8 = s9.length();
	//int ln9 = Integer.parseInt(String.valueOf(s10.length));
	 System.out.println(ln2);
	 System.out.println(s3);
	try {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_report", "root", "1234");
	 String query = " update accountent set aname=?,afname = ?, adob=?, aemail=?,amon=?, apin=?, aadd=? where aeid = ?";
	 // create the mysql insert preparedstatement
	PreparedStatement preparedStmt = con.prepareStatement(query);
	 preparedStmt.setString(1, ss1);
	preparedStmt.setString(2, ss3);
	 preparedStmt.setString(3, ss4);
	 preparedStmt.setString(4, ss5);
	// preparedStmt.setString (6,s12);
	// 
	preparedStmt.setString(6, s16);
	 preparedStmt.setString(5, ss6);
	preparedStmt.setString(6, ss7);
	preparedStmt.setString(7, ss8);
	 preparedStmt.setString(8, ss);
	// execute the preparedstatement
	preparedStmt.executeUpdate();
	 JOptionPane.showMessageDialog(null, "Edit Successfull");
	 } catch (Exception e12) {
	 System.err.println("Got an exception!");
	 System.err.println(e12.getMessage());
	//JOptionPane.showMessageDialog(e12, "My Goodness, this is so concise");
	 }
	 }
	// stat.execute(query);
	 } //con.close();
	 });
	 aab.add(sub);
	aab.add(can);
	 }
	 }
	 }
	 } catch (Exception e3) {
	 System.err.println("Got an exception!");
	 System.err.println(e3.getMessage());
	 }
	 }
	 }
	 });
	 }
	}

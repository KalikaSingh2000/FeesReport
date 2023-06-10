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

class adminreg extends JFrame {
	 JTextField t1, t2, t3, t4, t12, t11, textfield, te1, te2;
	 JRadioButton ch, ch1;
	 JPasswordField t9, t10;
	 JButton sub, can, ret;
	 JComboBox bo3, bo2, bo1;
	 JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, t5,l10, l11, l13, 
	l14, l15, l16, l17, h1;
	 JLabel la5, la6, la7, la8, la9, la10, la11, la12, la13, la, 
	la14, la15, la16, la17, la18, la19, la20;
	 JPanel aa1, aa, aa2;
	 public adminreg() {
	 setVisible(true);
	 setSize(1370, 750);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 la20 = new JLabel();
	 aa1 = new JPanel();
	 aa1.setLayout(null);
	 aa1.setBackground(Color.BLUE);
	 aa1.setBounds(0, 10, 1350, 100);
	 aa = new JPanel();
	 aa.setLayout(null);
	 aa.setBackground(new Color(0, 0, 0, 170));
	 aa.setBounds(350, 50, 700, 700);
	 add(aa1);
	 add(aa);
	 Font ff1 = new Font("Serif", Font.BOLD, 60);
	 Font ff2 = new Font("Serif", Font.BOLD, 15);
	 Font ff3 = new Font("Serif", Font.BOLD, 18);
	 l2 = new JLabel("");
	 h1 = new JLabel("REGISTRATION ADMIN");
	 h1.setBounds(400, 28, 700, 50);
	 l1 = new JLabel("FIRST NAME");
	 textfield = new JTextField("");
	 te1 = new JTextField("");
	 te2 = new JTextField("");
	 l3 = new JLabel("FATHER NAME");
	 l4 = new JLabel("");
	 l14 = new JLabel("");
	 l5 = new JLabel("DATE OF BIRTH");
	 l6 = new JLabel(" EMAIL ID");
	 l7 = new JLabel("MOBILE NUMBER");
	 l8 = new JLabel("");
	 l9 = new JLabel("GENDER");
	 l10 = new JLabel("ADDRESS");
	 l11 = new JLabel("EMP ID");
	 l13 = new JLabel("PIN CODE");
	 l15 = new JLabel("ENTER PASSWORD");
	 l16 = new JLabel("(max 150 characters a-z and A-Z)");
	 l17 = new JLabel("CORRECT PASSWORD");
	 ch = new JRadioButton("Male");
	 ch1 = new JRadioButton("FeMale");
	 ButtonGroup ge = new ButtonGroup();
	 aa.add(ch);
	 aa.add(ch1);
	 ge.add(ch);
	 ge.add(ch1);
	 String arr3[] = {"YY", "1980", "1981", "1982", "1983", 
	"1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", 
	"1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", 
	"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", 
	"2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", 
	"2016", "2017", "2018", "2019", "2020", "2021"};
	 bo3 = new JComboBox(arr3);
	 String arr[] = {"DD", "1", "2", "3", "4", "5", "6", "7", 
	"8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", 
	"19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", 
	"30", "31"};
	 bo2 = new JComboBox(arr);
	 String arr2[] = {"MM", "jan", "Feb", "Mar", "Apr", "May", 
	"June", "July", "Aug", "Sep", "oct", "Nov", "Dec"};
	 bo1 = new JComboBox(arr2);
	 bo1.setSelectedItem(null);
	 bo2.setSelectedItem(null);
	 bo3.setSelectedItem(null);
	 la5 = new JLabel("");
	 la6 = new JLabel("");
	 la7 = new JLabel("");
	 la8 = new JLabel("");
	 la9 = new JLabel("");
	 la10 = new JLabel("");
	 la11 = new JLabel("");
	 la12 = new JLabel("");
	 la13 = new JLabel("");
	 la14 = new JLabel("");
	 la15 = new JLabel("");
	 la16 = new JLabel("");
	 la17 = new JLabel("");
	 t1 = new JTextField();
	 t2 = new JTextField();
	 t3 = new JTextField();
	 t4 = new JTextField();
	 t5 = new JLabel();
	 t9 = new JPasswordField();
	 t11 = new JTextField();
	 t10 = new JPasswordField();
	 t12 = new JTextField();
	 h1.setFont(ff1);
	 l1.setFont(ff2);
	 l2.setFont(ff2);
	 l3.setFont(ff2);
	 l4.setFont(ff2);
	 l5.setFont(ff2);
	 l6.setFont(ff2);
	 l7.setFont(ff2);
	 l8.setFont(ff2);
	 l9.setFont(ff2);
	 l10.setFont(ff2);
	 l11.setFont(ff2);
	 l13.setFont(ff2);
	 l14.setFont(ff2);
	 l15.setFont(ff2);
	 l16.setFont(ff2);
	 l17.setFont(ff2);
	 t5.setFont(ff2);
	 h1.setForeground(Color.PINK);
	 aa1.add(h1);
	 l1.setForeground(Color.red);
	 l2.setForeground(Color.red);
	 l3.setForeground(Color.red);
	 l4.setForeground(Color.red);
	 l5.setForeground(Color.red);
	 l6.setForeground(Color.red);
	 l7.setForeground(Color.red);
	 l8.setForeground(Color.red);
	 l9.setForeground(Color.red);
	 l10.setForeground(Color.red);
	 l11.setForeground(Color.red);
	 l13.setForeground(Color.red);
	 l14.setForeground(Color.red);
	 l15.setForeground(Color.red);
	 l16.setForeground(Color.red);
	 l17.setForeground(Color.red);
	 t5.setForeground(Color.red);
	 l2.setForeground(Color.RED);
	 l4.setForeground(Color.GREEN);
	 l14.setForeground(Color.BLUE);
	 la7.setForeground(Color.YELLOW);
	 la8.setForeground(Color.PINK);
	 l16.setForeground(Color.GREEN);
	 la11.setForeground(Color.GREEN);
	 la12.setForeground(Color.GREEN);
	 la13.setForeground(Color.GREEN);
	 la14.setForeground(Color.GREEN);
	 la15.setForeground(Color.GREEN);
	 la16.setForeground(Color.GREEN);
	 la17.setForeground(Color.GREEN);
	 sub = new JButton("Submit");
	 can = new JButton("Cancel");
	 ret = new JButton("Reset");
	 can.setBackground(Color.PINK);
	 ret.setBackground(Color.PINK);
	 sub.setBackground(Color.PINK);
	 can.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 accont f1 = new accont();
	 Container c3 = f1.getContentPane();
	 ImageIcon img = new ImageIcon("./1.jpg");
	 Image image = img.getImage(); // transform it
	 Image newimg = image.getScaledInstance(1370, 730, 
	java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
	 img = new ImageIcon(newimg);
	 JLabel lll = new JLabel("", img, JLabel.LEFT);
	 JPanel aa = new JPanel();
	 aa.setBounds(0, 0, 500, 400);
	 lll.setBounds(0, 0, 1370, 720);
	 c3.add(lll);
	 }
	 });
	 ret.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 t1.setText("");
	 t2.setText("");
	 t3.setText("");
	 t4.setText("");
	 t5.setText("");
	 t9.setText("");
	 t10.setText("");
	 t11.setText("");
	 t12.setText("");
	 }
	 });
	 sub.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e1) {

	 if (e1.getSource() == sub) {
	 String s3 = t1.getText();
	String s4 = t2.getText();
	String s5 = t3.getText();
	String s6 = t4.getText();
	String s7 = t5.getText();
	char[] s8 = t9.getPassword();
	String s9 = t11.getText();
	char[] s10 = t10.getPassword();
	 String s11 = t12.getText();
	 String s12 = new String(s8);
	String s13 = new String(s10);
	String s16;
	textfield.setText((String)bo1.getSelectedItem());
	 int s18=bo1.getSelectedIndex();
	 te1.setText((String) bo2.getSelectedItem());
	te2.setText((String) bo3.getSelectedItem());
	String s17 = textfield.getText() + "/" + te1.getText() + "/" + te2.getText();
	 s16 = ch.getText();
	 int ln2 = s3.length();
	int ln3 = s4.length();
	int ln4 = s5.length();
	int ln5 = s6.length();
	int ln6 = s7.length();
	int ln8 = s9.length();
	int ln9 = Integer.parseInt(String.valueOf(s10.length));
	 int ln10 = s11.length();
	int ln11 = s12.length();
	int ln12 = s13.length();
	 if (ln2 < 1) {
	 l2.setText("**illigal senatencebbb");
	 } else {
	 l2.setText("");
	 }
	if (ln3 < 1) {
	 l4.setText("**illigal senatencecccc");
	 } else {
	 l4.setText("");
	 }
	if (ln4 < 1) {
	 la7.setText("**illigal senatenceddd");
	 } else {
	 la7.setText("");
	 }
	if (ln5 < 1) {
	 la8.setText("**illigal senatenceeeee");
	 } else {
	 la8.setText("");
	 }
	 if (ln6 < 1) {
	 l16.setText("**ill senatence");
	 } else {
	 l16.setText("");
	 }
	if (ln8 < 1) {
	 la11.setText("**illigal senatenceffff");
	 } else {
	 la11.setText("");
	 }
	 if (ln9 < 1) {
	 la12.setText("**illigal senatenceggg");
	 } else {
	 la12.setText("");
	 }
	if (ln10 < 1) {
	 la13.setText("**illigal senatencehhhh");
	 } else {
	 la13.setText("");
	 }
	 if (ln11 < 1) {
	 la14.setText("**illigal senatenceiii");
	 } else {
	 la14.setText("");
	 }
	 if (ln12 < 1) {
	 la15.setText("**illigal senatencejjjjj");
	 } else {
	 la15.setText("");
	 }
	 if (ln2 < 1) {
	 l16.setText("**illigal senatencevvv");
	 } else {
	 l16.setText("");
	 }
	if (ln2 < 1) {
	 la16.setText("**illigal senatencevvv");
	 } else {
	 la16.setText("");
	 }
	 if (ln2 < 1) {
	 la17.setText("**illigal senatencevvv");
	 } else {
	 la17.setText("");
	 try {
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con = 
	DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_report", "root", "1234");
	 // Statement stat = con.createStatement();
	String query = " INSERT INTO admin (aname,fname,adob,aemail,amon,apass,gender,apin,aadd)"
	 + "values(?,?,?,?,?,?,?,?,?)";
	 // create the mysql insert preparedstatement
	 PreparedStatement preparedStmt = con.prepareStatement(query);
	 preparedStmt.setString(1, s3);
	preparedStmt.setString(2, s4);
	preparedStmt.setString(3, s17);
	preparedStmt.setString(4, s5);
	preparedStmt.setString(5, s6);
	preparedStmt.setString(6, s12);
	preparedStmt.setString(7, s16);
	preparedStmt.setString(8, s7);
	preparedStmt.setString(9, s9);
	// execute the preparedstatement
	preparedStmt.execute();
	 String query1 = "SELECT * FROM admin";
	 // create the java statement
	 Statement st = con.createStatement();
	 // execute the query, and get a java ResultSet
	 ResultSet rs1 = st.executeQuery(query1);
	 // iterate through the java resultset
	 while (rs1.next()) {
	 String ss = (rs1.getString("aeid"));
	t5.setText(ss);}
	 JOptionPane.showMessageDialog(null, "Accountent Registration Successfull");
	 // stat.execute(query);
	 // con.close();
	 } catch (Exception e) {
	 System.err.println("Got an exception!");
	System.err.println(e.getMessage());
	 }
	 }
	 }
	 }
	 });
	 // la5.setBounds(460, 140, 200, 30);
	 // la6.setBounds(460, 265, 200, 30);
	 la7.setBounds(460, 230, 200, 30);
	 la8.setBounds(460, 265, 200, 30);
	 la9.setBounds(460, 300, 200, 30);
	 la10.setBounds(460, 350, 200, 30);
	 la11.setBounds(460, 390, 200, 30);
	 la12.setBounds(460, 440, 200, 30);
	 la13.setBounds(460, 490, 200, 30);
	 la14.setBounds(460, 540, 200, 30);
	 la15.setBounds(460, 350, 200, 30);
	 l11.setBounds(150, 265, 100, 40);
	 l1.setBounds(135, 80, 100, 30);
	 t1.setBounds(250, 80, 200, 30);
	 l2.setBounds(460, 80, 200, 40);
	 l3.setBounds(135, 130, 150, 30);
	 t2.setBounds(250, 130, 200, 30);
	 l4.setBounds(460, 130, 200, 40);
	 l5.setBounds(120, 180, 200, 40);
	 bo1.setBounds(250, 180, 50, 30);
	 bo2.setBounds(310, 180, 50, 30);
	 bo3.setBounds(370, 180, 60, 30);
	 l6.setBounds(155, 230, 100, 40);
	 t3.setBounds(250, 230, 200, 30);
	 l7.setBounds(100, 300, 200, 40);
	 t4.setBounds(250, 300, 200, 30);
	 l8.setBounds(460, 400, 100, 40);
	 l9.setBounds(160, 440, 100, 40);
	 ch.setBounds(250, 440, 80, 30);
	 ch1.setBounds(350, 440, 80, 30);
	 t5.setBounds(250, 265, 200, 30);
	 l15.setBounds(98, 350, 200, 40);
	 l13.setBounds(160, 490, 100, 40);
	 // t10.setBounds(150, 390, 200, 40);
	 t9.setBounds(250, 350, 200, 30);
	 t10.setBounds(250, 390, 200, 30);
	 l16.setBounds(460, 300, 200, 40);
	 l17.setBounds(85, 390, 200, 40);
	 t11.setBounds(250, 490, 200, 30);
	 sub.setBounds(250, 580, 80, 35);
	 can.setBounds(350, 580, 80, 35);
	 ret.setBounds(450, 580, 80, 35);
	 l10.setBounds(160, 540, 150, 35);
	 t12.setBounds(250, 540, 200, 30);
	 aa.add(l1);
	 aa.add(t1);
	 aa.add(l2);
	 aa.add(l3);
	 aa.add(t2);
	 aa.add(l4);
	 aa.add(l5);
	 aa.add(bo1);
	 aa.add(bo2);
	 aa.add(bo3);
	 aa.add(l6);
	 aa.add(t4);
	 aa.add(l7);
	 aa.add(t5);
	 aa.add(l8);
	 aa.add(l9);
	 aa.add(t10);
	 aa.add(l11);
	 aa.add(t3);
	 aa.add(l13);
	 aa.add(t9);
	 aa.add(t12);
	 add(l14);
	 aa.add(l15);
	 aa.add(l10);
	 aa.add(l16);
	 aa.add(l17);
	 //add(t10);
	 aa.add(sub);
	 aa.add(can);
	 aa.add(ret);
	 aa.add(l14);
	 aa.add(t11);
	 aa.add(la5);
	 // aa.add(la6);
	 aa.add(la7);
	 aa.add(la8);
	 aa.add(la9);
	 aa.add(la10);
	 aa.add(la11);
	 aa.add(la12);
	 aa.add(la13);
	 aa.add(la14);
	 aa.add(la15);
	 }
	}
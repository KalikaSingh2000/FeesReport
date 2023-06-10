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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import beans.Studentreg;
import db.sregisterdb;
class sreg extends JFrame{
JLabel la5, la6, la7, la8, la9, la10, la11, la12, la13, la, la14, 
la15, la16, la17, la18, la19, la20;
 JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l13, l14, 
l15, l16, l17;
 JTextField t1, t2, t3, t4, t5, bo4, t9, t10, textfield, te1, 
te2, te3, te4;
 JButton sub, ret, can;
 JComboBox bo1, bo2, bo3, cou, sem;
 JRadioButton ch, ch1;
 public sreg() {
 setVisible(true);
 setSize(1370, 750);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(null);
 JPanel aa1 = new JPanel();
 aa1.setLayout(null);
 aa1.setBackground(Color.BLUE);
 aa1.setBounds(3, 5, 1370, 100);
 JPanel aa = new JPanel();
 aa.setLayout(null);
 aa.setBackground(new Color(0, 0, 0, 170));
 aa.setBounds(350, 50, 700, 700);
 add(aa1);
 add(aa);
 Font ff1 = new Font("Serif", Font.BOLD, 60);
 JLabel h1 = new JLabel("REGISTRATION STUDENT");
 h1.setBounds(330, 10, 800, 80);
 h1.setFont(ff1);
 h1.setForeground(Color.PINK);
 aa1.add(h1);
 l1 = new JLabel("FIRST NAME");
 l2 = new JLabel("");
 l3 = new JLabel("FATHER NAME");
 l4 = new JLabel("");
 l5 = new JLabel("DATE OF BIRTH");
 l6 = new JLabel(" EMAIL ID");
 l7 = new JLabel("MOBILE NUMBER");
 l8 = new JLabel("");
 l9 = new JLabel("GENDER");
 l17 = new JLabel("ADDRESS");
 l11 = new JLabel("ROLL NUMBER");
 l15 = new JLabel("PIN CODE");
 l14 = new JLabel("(6 digit number)");
 l13 = new JLabel("SEM");
 l16 = new JLabel("(max 150 characters a-z and A-Z)");
 String arr4[] = {"course", "BCA", "BBA", "B.COM", "MCA", 
"MBA", "M.COM", "B.ED", "M.ED"};
 cou = new JComboBox(arr4);
 String arr5[] = {"SEM", "1", "2", "3", "4", "5", "6"};
 sem = new JComboBox(arr5);
 l10 = new JLabel("COURSE");
 t1 = new JTextField();
 t2 = new JTextField();
 t3 = new JTextField();
 t4 = new JTextField();
 t5 = new JTextField();
 t9 = new JTextField();
 t10 = new JTextField();
 textfield = new JTextField();
 te1 = new JTextField();
 te2 = new JTextField();
 te3 = new JTextField();
 te4 = new JTextField();
 ch = new JRadioButton("Male");
 ch1 = new JRadioButton("FeMale");
 la6 = new JLabel("");
 la7 = new JLabel("");
 la8 = new JLabel("");
 la9 = new JLabel("");
 la10 = new JLabel("");
 la11 = new JLabel("");
 la12 = new JLabel("");
 Font ff2 = new Font("Serif", Font.BOLD, 15);
 Font ff3 = new Font("Serif", Font.BOLD, 18);
 aa.add(ch);
 aa.add(ch1);
 ButtonGroup gb1 = new ButtonGroup();
 gb1.add(ch);
 gb1.add(ch1);
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
 bo4 = new JTextField("");
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
 l11.setBounds(110, 345, 200, 40);
 bo4.setBounds(250, 345, 200, 30);
 l15.setBounds(150, 385, 100, 40);
 l13.setBounds(150, 430, 100, 40);
 l14.setBounds(460, 385, 200, 40);
 t9.setBounds(250, 385, 200, 30);
 l16.setBounds(460, 430, 200, 40);
 l17.setBounds(150, 430, 200, 40);
 t10.setBounds(250, 430, 200, 30);
 l10.setBounds(150, 500, 200, 40);
 cou.setBounds(250, 500, 70, 40);
 sem.setBounds(330, 500, 70, 40);
 la7.setBounds(460, 230, 200, 30);
 la8.setBounds(460, 265, 200, 30);
 la9.setBounds(460, 300, 200, 30);
 la11.setBounds(460, 345, 200, 30);
 la10.setBounds(460, 430, 200, 30);
 la12.setBounds(460, 440, 200, 30);
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
 la7.setForeground(Color.YELLOW);
 la8.setForeground(Color.PINK);
 l16.setForeground(Color.GREEN);
 la11.setForeground(Color.GREEN);
 la12.setForeground(Color.GREEN);
la10.setForeground(Color.GREEN);
 
 // aa.add(sub);
 aa.add(l1);
 aa.add(t1);
 // aa.add(l2);
 aa.add(l3);
 aa.add(t2);
 // aa.add(l4);
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
 aa.add(l11);
 aa.add(bo4);
 aa.add(l17);
 aa.add(t10);
 aa.add(l10);
 aa.add(cou);
 aa.add(sem);
 aa.add(l15);
 aa.add(l14);
 aa.add(t9);
 sub = new JButton("Submit");
 can = new JButton("Cancel");
 ret = new JButton("Reset");
 can.setBackground(Color.PINK);
 ret.setBackground(Color.PINK);
 sub.setBackground(Color.PINK);
 ret.setBounds(350, 550, 80, 35);
 can.setBounds(450, 550, 80, 35);
 sub.setBounds(250, 550, 80, 35);
 can.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 login f1 = new login();
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
 bo4.setText("");
 }
 });
 sub.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e1) {
 int x = 0;
 String s14 = new String();
 if (e1.getSource() == sub) {
 String s3 = t1.getText();
String s4 = t2.getText();
String s5 = t4.getText();
String s6 = t5.getText();
String s7 = bo4.getText();
 String s8 = t9.getText();
 String s9 = t10.getText();
// String s10 = t10.getText();
// String s11 = t12.getText();
 String s16;
te1.setText((String) bo2.getSelectedItem());
 textfield.setText((String)bo1.getSelectedItem());
 te2.setText((String) bo3.getSelectedItem());
te3.setText((String) cou.getSelectedItem());
te4.setText((String) sem.getSelectedItem());
 String s17 = textfield.getText() + "/" +te1.getText() + "/" + te2.getText();
 String s18 = te3.getText() + "--" + 
te4.getText();
 System.out.print(s17);
 int ln9 = ch.getText().length();
 int ln10 = ch.getText().length();
s16 = ch.getText() + ch1.getText();
 System.out.print(s16);
//s16=gb1.SelectedItem();
 System.out.println(s16);
 int ln2 = s3.length();
int ln3 = s4.length();
int ln4 = s5.length();
int ln5 = s6.length();
int ln6 = s7.length();
 int ln8 = s8.length();
 int ln11 = s9.length();
 if (ln2 < 1) {
 l2.setText("**please fill the box");
 } else {
 l2.setText("");
 }
 if (ln3 < 1) {
 l4.setText("**please fill the box");
 } else {
 l4.setText("");
 }
if (ln4 < 1) {
 l8.setText("**please fill the box");
 } else {
 l8.setText("");
 }
if (ln5 < 1) {
 la8.setText("**please fill the box");
 } else {
 la8.setText("");
 }
 if (ln6 < 1) {
 la12.setText("**please fill the box");
 } else {
 la12.setText("");
 }
 if (ln8 < 1) {
 l14.setText("**please fill the box");
 } else {
 l14.setText("");}
 if (ln11 < 1) {
 la11.setText("**please fill the box");
 } else {
 la11.setText("");
 
}
 if (ln11 < 1) {
 la10.setText("**please fill the box");
 } else {
 la10.setText("");
 System.out.println(ln2);
System.out.println(s3);
 try {
	 if (ch.isSelected()) {
 	    s16="male";
 	}
 	if (ch1.isSelected()) {
 	    s16="female";
 	}
	 long lmob=Long.parseLong(s6);
	 int roll=Integer.parseInt(s7);
	 int pin=Integer.parseInt(s8);
	 Studentreg rb=new Studentreg();
	 rb.setName(s3);
	 rb.setFname(s4);
	 rb.setDob(s17);
	 rb.setEmail(s5);
	 rb.setMob(lmob);
	 rb.setGender(s16);
	 rb.setRollno(roll);
	 rb.setPinno(pin);
	 rb.setAddr(s9);
	 rb.setCourse(s18);
	 sregisterdb sidb=new sregisterdb();
	 sidb.insertStudentdb(rb);
 }/*
 Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_report", "root", "1234");
 String query = " INSERT INTO student (sname,sfname,sdob,semail,smon,sgender,sroll,spin,sadd,course)"
 + "values(?,?,?,?,?,?,?,?,?,?)";
 // create the mysql insert PreparedStatement
 PreparedStatement preparedStmt = con.prepareStatement(query);
 preparedStmt.setString(1, s3);
 preparedStmt.setString(2, s4);
 preparedStmt.setString(3, s17);
preparedStmt.setString(4, s5);
preparedStmt.setString(5, s6);
// preparedStmt.setString (6,s12);
 preparedStmt.setString(6, s16);
preparedStmt.setString(7, s7);
preparedStmt.setString(8, s8);
preparedStmt.setString(9, s9);
 preparedStmt.setString(10, s18);
 // execute the preparedstatement
preparedStmt.execute();
JOptionPane.showMessageDialog(null, 
"Register Student Successfull");
 // stat.execute(query);
 //con.close();
 } */ catch (Exception e) {
 System.err.println("Got an exception!");
System.err.println(e.getMessage());
 }
 }
 }
 }
 });
 
 /* la13.setBounds(460, 490, 200, 30);
 la14.setBounds(460, 540, 200, 30);
 la15.setBounds(460, 350, 200, 30);
 * aa.add(la7);
 aa.add(la8);
*/
 aa.add(l2);
 aa.add(l4);
 aa.add(la7);
 aa.add(la8);
 aa.add(la9);
 aa.add(la10);
 aa.add(la11);
 aa.add(sub);
 aa.add(can);
 aa.add(ret);
 
 }}
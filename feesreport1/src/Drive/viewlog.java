package Drive;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class viewlog extends JFrame {
	 ResultSet rs, rs1;
	 JPanel aa, aa1, aab1, aab;
	 JButton login;
	 JTextField tt2;
	 JPasswordField tt1;
	 duelog nn;
	 JLabel t1, t2, t3, t4, t5, t9, t10, ttus, tbus, thostol, treg, 
	cou, tus, bus, ll5, l1, l3, l5, l6, l7, l9, l11, l13, l15, hostol, 
	reg, ll4;
	 JButton sub, ret, can;
	 String stus, sbus, shostol, sreg, ss1, ss2, fname, ss, s11, s, 
	ssf, sroll;
	 int id, i, il;
	 public viewlog() {
	 setVisible(true);
	 setSize(1370, 750);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 Font ff1 = new Font("Serif", Font.BOLD, 40);
	 Font ff2 = new Font("Serif", Font.BOLD, 28);
	 Font ff3 = new Font("Serif", Font.BOLD, 18);
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
	 JLabel ll1 = new JLabel("Log in Student");
	 JLabel ll2 = new JLabel(" Enter Studnt id");
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
	sub = new JButton("submit");
	 try {
	 try {
	 Class.forName("com.mysql.jdbc.Driver");
	 } catch (ClassNotFoundException ex) {
	 Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
	 }
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_report", "root", "1234");
	 String query = "SELECT * FROM student";
	// create the java statement
	Statement st = con.createStatement();
	 // execute the query, and get a java 
	ResultSet rs = st.executeQuery(query);
	 String query1 = "SELECT * FROM due_fee";
	// create the java statement
	Statement st1 = con.createStatement();
	 // execute the query, and get a java 
	ResultSet rs1 = st1.executeQuery(query1);
	
	
	 // iterate through the java resultset
	 // iterate through the java resultset
	 while ((rs.next()) && (rs1.next())) {
	 ss = (rs.getString("sroll"));
	fname = rs.getString("sdob");
	ssf = rs1.getString("sroll");
	System.out.println(s11 +"=="+ss);
	 if (i <= 1) {
	 ll4.setText("enter only no.");
	ll4.setForeground(Color.RED);
	 }
	if (il <= 1) {
	 ll5.setText("enter pass.");
	ll5.setForeground(Color.RED);
	 }
	
	else { 
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
	// while (rs1.next()) {
	 if (ssf.equals(s11)) {
	 JFrame nn = new JFrame();
	setVisible(true);
	setSize(1200, 1600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 Font ff1 = new Font("Serif", Font.BOLD, 60);
	JLabel h1 = new JLabel("View Studnt");
	 h1.setBounds(320, 10, 680, 80);
	h1.setFont(ff1);
	h1.setForeground(Color.black);
	aab1.add(h1);
	l1 = new JLabel("FULL NAME");
	l3 = new JLabel("FATHER NAME");
	l5 = new JLabel("DATE OF BIRTH");
	 l6 = new JLabel(" EMAIL ID");
	 l7 = new JLabel("MOBILE NUMBER");
	l9 = new JLabel("GENDER");
	l11 = new JLabel("ROLL NUMBER");
	 l15 = new JLabel("COURSE");
	 l13 = new JLabel("SEM");
	tus = new JLabel("Tution Fee");
	 bus = new JLabel("Bus Fee");
	 hostol = new JLabel("Hostol Fee");
	reg = new JLabel("University Fee");
	ttus = new JLabel(rs1.getString("tutionfee"));
	 tbus = new JLabel(rs1.getString("busfee"));
	 thostol = new JLabel(rs1.getString("hostelfee"));
	treg = new JLabel(rs1.getString("rfee"));
	 t1 = new JLabel(rs.getString("sname"));
	t2 = new JLabel(rs.getString("sfname"));
	 t3 = new JLabel(rs.getString("sdob"));
	 t4 = new JLabel(rs.getString("semail"));
	 t5 = new JLabel(rs.getString("smob"));
	t9 = new JLabel(rs.getString("course"));
	 t10 = new JLabel(rs.getString("sroll"));
	 cou = new JLabel(rs.getString("sgender"));
	ssf =rs1.getString("sroll");
	 ss1 = rs.getString("sname");
	 ss2 = rs.getString("sroll");
	 Font ff2 = new Font("Serif", Font.BOLD, 15);
	Font ff3 = new Font("Serif", Font.BOLD, 18);
	 l1.setBounds(150, 80, 100, 30);
	t1.setBounds(300, 80, 200, 30);
	 // l2.setBounds(460, 80, 200, 40);
	 l3.setBounds(130, 130, 150, 30);
	 t2.setBounds(300, 130, 200, 30);
	 // l4.setBounds(460, 120, 200, 40);
	l5.setBounds(120, 170, 170, 40);
	 t3.setBounds(300, 170, 170, 40);
	 l6.setBounds(150, 225, 100, 40);
    t4.setBounds(300, 225, 200, 30);
	 l7.setBounds(100, 265, 200, 40);
	 t5.setBounds(300, 265, 200, 30);
	 l9.setBounds(150, 305, 100, 40);
	 l11.setBounds(110, 345, 200, 40);
	 l15.setBounds(150, 385, 100, 40);
	l13.setBounds(150, 430, 100, 40);
	 t9.setBounds(300, 385, 200, 30);
	 t10.setBounds(300, 345, 200, 30);
	 // l10.setBounds(150, 500, 200, 40);
	cou.setBounds(300, 305, 150, 40);
	 tus.setBounds(150, 430, 200, 40);
	 bus.setBounds(150, 485, 150, 40);
	hostol.setBounds(150, 530, 150, 40);
	reg.setBounds(150, 580, 150, 40);
	 ttus.setBounds(300, 430, 200, 35);
	tbus.setBounds(300, 485, 200, 35);
	thostol.setBounds(300, 530, 200, 35);
	 treg.setBounds(300, 580, 200, 35);
	 l1.setFont(ff2);
	l3.setFont(ff2);
	l5.setFont(ff2);
	 l6.setFont(ff2);
	 l7.setFont(ff2);
	l9.setFont(ff2);
	// l10.setFont(ff2);
	l11.setFont(ff2);
	l13.setFont(ff2);
	l15.setFont(ff2);
	 t1.setFont(ff2);
	t2.setFont(ff2);
	 t3.setFont(ff2);
	 t4.setFont(ff2);
	t5.setFont(ff2);
	t9.setFont(ff2);
	t10.setFont(ff2);
	// bo3.setFont(ff2);
	cou.setFont(ff2);
	tus.setFont(ff2);
	bus.setFont(ff2);
	 hostol.setFont(ff2);
	 reg.setFont(ff2);
	 ttus.setFont(ff2);
	tbus.setFont(ff2);
	 thostol.setFont(ff2);
	 treg.setFont(ff2);
	 t1.setForeground(Color.white);
	t2.setForeground(Color.white);
	 t3.setForeground(Color.white);
	 t4.setForeground(Color.white);
	t5.setForeground(Color.white);
	t9.setForeground(Color.white);
	 t10.setForeground(Color.white);
	// bo3.setForeground(Color.white);
	cou.setForeground(Color.white);
	 reg.setForeground(Color.red);
	 hostol.setForeground(Color.red);
	bus.setForeground(Color.red);
	// bo3.setForeground(Color.white);
	 tus.setForeground(Color.red);
	treg.setForeground(Color.white);
	thostol.setForeground(Color.white);
	 tbus.setForeground(Color.white);
	 // bo3.setForeground(Color.white);
	ttus.setForeground(Color.white);
	 l1.setForeground(Color.red);
	 // l2.setForeground(Color.red);
	l3.setForeground(Color.red);
	// l4.setForeground(Color.red);
	 l5.setForeground(Color.red);
	 l6.setForeground(Color.red);
	l7.setForeground(Color.red);
	 l9.setForeground(Color.red);
	 //l10.setForeground(Color.red);
	 l11.setForeground(Color.red);
	l13.setForeground(Color.red);
	 l15.setForeground(Color.red);
	 aab.add(tus);
	aab.add(bus);
	aab.add(hostol);
	aab.add(reg);
	 aab.add(ttus);
	 aab.add(tbus);
	aab.add(thostol);
	aab.add(treg);
	aab.add(l1);
	aab.add(t1);
	// aab.add(l2);
	aab.add(l3);
	aab.add(t2); // aab.add(l4);
	aab.add(l5);
	aab.add(t3);
	// aab.add(bo3);
	aab.add(l6);
	 aab.add(t4);
	 aab.add(l7);
	aab.add(t5);
	aab.add(l9);
	aab.add(t3);
	 aab.add(l11);
	 aab.add(t10);
	aab.add(cou);
	 aab.add(l15);
	 aab.add(t9);
	 can = new JButton("Cancel");
	 can.setBackground(Color.PINK);
	 can.setBounds(300, 625, 100, 35);
	 aab.add(can);
	 can.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 t1.setText("");
	t2.setText("");
	t3.setText("");
	t4.setText("");
	t5.setText("");
	t9.setText("");
	t10.setText("");
	cou.setText("");
	// ll4.setText("");
	//ll.setText("");
	tt2.setText("");
	ttus.setText("");
	 tbus.setText("");
	 thostol.setText("")
	;
	treg.setText("");
	tt1.setText("");
	 treg.setText("");
	 }
	 });
	 // if(ltus<=0)
	 // con.close();
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
	 }
	 });
	 }
	}
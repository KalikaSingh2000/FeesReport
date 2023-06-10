package Drive;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class login extends JFrame {
	 public login() {
	 setVisible(true);
	 setSize(1370, 750);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 JPanel aa = new JPanel();
	 aa.setLayout(null);
	 aa.setBackground(new Color(0, 0, 0, 195));
	 aa.setBounds(500, 150, 500, 400);
	 add(aa);
	 JButton jb1 = new JButton("Add Student");
	 jb1.setBounds(50, 100, 180, 30);
	 JButton jb2 = new JButton("View Student");
	 jb2.setBounds(270, 100, 180, 30);
	 JButton jb3 = new JButton("Edit Student");
	 jb3.setBounds(50, 180, 180, 30);
	 JButton jb4 = new JButton("Due Fee");
	 JButton jb5 = new JButton("Log Out");
	 jb5.setBounds(170, 240, 180, 30);
	 jb1.setBackground(Color.PINK);
	 jb4.setBounds(266, 180, 180, 30);
	 jb2.setBackground(Color.PINK);
	 jb3.setBackground(Color.PINK);
	 jb4.setBackground(Color.PINK);
	 jb5.setBackground(Color.PINK);
	 aa.add(jb1);
	 aa.add(jb2);
	 aa.add(jb3);
	 aa.add(jb4);
	 aa.add(jb5);
	 jb5.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 Stu f2 = new Stu();
	 Container c3 = f2.getContentPane();
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
	 jb1.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 sreg f1 = new sreg();
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
	 jb2.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 viewlog f3 = new viewlog();
	 Container c3 = f3.getContentPane();
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
	 jb3.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 editstu f2 = new editstu();
	 Container c3 = f2.getContentPane();
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
	 jb4.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 duelog f2 = new duelog();
	 Container c3 = f2.getContentPane();
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
	 }
	}
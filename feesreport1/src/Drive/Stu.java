package Drive;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Stu extends JFrame {
	 public Stu() {
	 setVisible(true);
	 setSize(1370, 750);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 JPanel aa1 = new JPanel();
	 aa1.setLayout(null);
	 aa1.setBackground(new Color(0, 0, 0, 150));
	 aa1.setBounds(0, 0, 1370, 100);
	 add(aa1);
	 JButton jb1 = new JButton("STUDENT");
	 jb1.setBounds(1115, 30, 100, 30);
	 JButton jb2 = new JButton("Admin");
	 jb2.setBackground(Color.GREEN);
	 jb2.setBounds(1000, 30, 100, 30);
	 JButton jb3 = new JButton("ACCOUNTANT");
	 jb3.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 acc f2=new acc();
	 Container c3 = f2.getContentPane();
	 ImageIcon img = new ImageIcon("./1.jpg");
	 Image image = img.getImage(); // transform it
	 Image newimg = image.getScaledInstance(1370, 730,java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
	 img = new ImageIcon(newimg);
	 JLabel lll = new JLabel("", img, JLabel.LEFT);
	 JPanel aa = new JPanel();
	 aa.setBounds(0, 0, 500, 400);
	 lll.setBounds(0, 0, 1370, 720);
	 c3.add(lll);
	 c3.setBounds(0, 0, 700, 700);
	 c3.add(lll);
	 }
	 });
	 jb2.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 admin f2 = new admin();
	 Container c3 = f2.getContentPane();
	 ImageIcon img = new ImageIcon("./1.jpg");
	 Image image = img.getImage(); // transform it
	 Image newimg = image.getScaledInstance(1370, 730,java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
	 img = new ImageIcon(newimg);
	 JLabel lll = new JLabel("", img, JLabel.LEFT);
	 JPanel aa = new JPanel();
	 aa.setBounds(0, 0, 500, 400);
	 lll.setBounds(0, 0, 1370, 720);
	 c3.add(lll);
	 c3.setBounds(0, 0, 700, 700);
	 c3.add(lll);
	 }
	 });
	 jb3.setBounds(1230, 30, 130, 30);
	 jb1.setBackground(Color.GREEN);
	 jb3.setBackground(Color.GREEN);
	 jb1.setLayout(new FlowLayout());
	 jb3.setLayout(new FlowLayout());
	 aa1.add(jb2);
	 aa1.add(jb3);
	 aa1.add(jb1);
	 jb1.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 student f2 = new student();
	 Container c3 = f2.getContentPane();
	 ImageIcon img = new ImageIcon("./1.jpg");
	 Image image = img.getImage(); // transform it
	 Image newimg = image.getScaledInstance(1370, 730,java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
	 img = new ImageIcon(newimg);
	 JLabel lll = new JLabel("", img, JLabel.LEFT);
	 JPanel aa = new JPanel();
	 aa.setBounds(0, 0, 500, 400);
	 lll.setBounds(0, 0, 1370, 720);
	 c3.add(lll);
	 c3.setBounds(0, 0, 700, 700);
	 c3.add(lll);
	 }
	 });
	 }
	}
	
	
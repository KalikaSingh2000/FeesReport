package Drive;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class accont1 extends JFrame {
	 public accont1() {
	 setVisible(true);
	 setSize(1370, 750);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 Font ff1 = new Font("Serif", Font.BOLD, 40);
	 Font ff2 = new Font("Serif", Font.BOLD, 28);
	 Font ff3 = new Font("Serif", Font.BOLD, 18);
	 JPanel aa1 = new JPanel();
	 aa1.setLayout(null);
	 aa1.setBackground(Color.BLUE);
	 aa1.setBounds(400, 100, 500, 100);
	 JPanel aa = new JPanel();
	 aa.setLayout(null);
	 aa.setBackground(new Color(0, 0, 0, 195));
	 aa.setBounds(500, 150, 450, 400);
	 add(aa);
	 JButton bb2 = new JButton("Edit Accountant");
	 JButton bb3 = new JButton("View Accountant ");
	 JButton bb4 = new JButton("Log Out");
	 bb2.setBackground(Color.CYAN);
	 bb3.setBackground(Color.CYAN);
	 bb4.setBackground(Color.CYAN);
	 bb2.setBounds(250, 130, 150, 35);
	 bb3.setBounds(80, 130, 150, 35);
	 bb4.setBounds(180, 200, 150, 35);
	 aa.add(bb2);
	 aa.add(bb3);
	 aa.add(bb4);
	 bb2.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 editacc f2 = new editacc();
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
	 bb3.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
	 viewacc f2 = new viewacc();
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
	 bb4.addActionListener(new ActionListener() {
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
	 }
	}
	
package Drive;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class slog extends JFrame {
	 public slog() {
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
	 aa1.setBounds(450, 100, 550, 100);
	 JPanel aa = new JPanel();
	 aa.setLayout(null);
	 aa.setBackground(new Color(0, 0, 0, 170));
	 aa.setBounds(450, 100, 550, 500);
	 add(aa1);
	 add(aa);
	 JTextField t2 = new JTextField();
	 JPasswordField t1 = new JPasswordField();
	 JLabel l1 = new JLabel("Log in Student");
	 JLabel l2 = new JLabel(" Enter Studnt id");
	 JLabel l3 = new JLabel(" Enter Password");
	 JLabel l4 = new JLabel("");
	 JButton login = new JButton("Submit");
	 l1.setForeground(Color.red);
	 l2.setForeground(Color.red);
	 l3.setForeground(Color.red);
	 l4.setForeground(Color.red);
	 l1.setFont(ff1);
	 l2.setFont(ff2);
	 l3.setFont(ff2);
	 l1.setBounds(150, 30, 300, 50);
	 l2.setBounds(170, 150, 300, 50);
	 t2.setBounds(150, 215, 250, 35);
	 l3.setBounds(170, 260, 300, 50);
	 t1.setBounds(150, 320, 250, 35);
	 login.setBounds(210, 380, 100, 35);
	 l1.setForeground(Color.red);
	 l2.setForeground(Color.red);
	 l3.setForeground(Color.red);
	 l4.setForeground(Color.red);
	 login.setBackground(Color.GREEN);
	 aa.add(t2);
	 aa.add(l3);
	 aa.add(t1);
	 aa.add(login);
	 aa.add(l4);
	 aa1.add(l1);
	 aa.add(l2);
	 }
	}
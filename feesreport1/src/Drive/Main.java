package Drive;

import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
public static void main(String[] args) {
	Stu f2 = new Stu();
	 
	Container c3 = f2.getContentPane();
	ImageIcon img = new ImageIcon("./1.jpg");
	Image image = img.getImage(); // transform it
	Image newimg = image.getScaledInstance(1370, 730, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
	img = new ImageIcon(newimg);
	JLabel lll = new JLabel("", img, JLabel.LEFT);
	JPanel aa = new JPanel();
	aa.setBounds(0, 0, 500, 400);
	lll.setBounds(0, 0, 1370, 720);
	c3.add(lll);
	 }
	}
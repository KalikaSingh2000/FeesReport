package db;
import beans.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class sregisterdb {
	Session session;
	Transaction t1;
	
		
	public static SRegisterBeans read(int id) {
		SRegisterBeans emp=null;
		Session session=null;
		try {
			session=SessionProvider.getSession();
			emp=(SRegisterBeans)session.get(SRegisterBeans.class,id);
			System.out.println("get record");
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return emp;
	}
public void insertStudentdb(Studentreg sb) {
	 try {
	session=SessionProvider.getSession();
	t1=session.beginTransaction();
	
	
	 session.save(sb);
	 System.out.println("Persiste state");
	 t1.commit();
	 System.out.println("Data base  state");
	 
	 
	 System.out.println("Object remove from the Session Detached state");}
catch(Exception e) {
	e.printStackTrace();
}}
	 
public void insertAccountent(SRegisterBeans sb) {
	 try {
	session=SessionProvider.getSession();
	t1=session.beginTransaction();
	
	
	 session.save(sb);
	 System.out.println("Persiste state");
	 t1.commit();
	 System.out.println("Data base  state");
	 
	 
	 System.out.println("Object remove from the Session Detached state");}
catch(HibernateException e) {
	e.printStackTrace();
}}
/*public static void main(String ...s) {
	sregisterdb sdb=new sregisterdb();
	SRegisterBeans rb=new SRegisterBeans();
	 rb.setAid(1755);
	 rb.setName("name");
	 rb.setFname("fname");
	 rb.setDob("22/04/3000");
	 rb.setEmail("email");
	 rb.setMob(33333);
	 rb.setPass("1234");
	 rb.setGender("gender");
	 rb.setPinno(123456);
	 rb.setAddr("addr");
	
	sdb.insertAccountent(rb);
}*/

/*  String s14 = new String();
		 if (e1.getSource() == sub) {
	    String aid=tid.getText();
	    String name =t3.getText();
		String fname = t2.getText();
		 String email = t3.getText();
		String mob = t4.getText();
		String s7 = t5.getText();
		char[] s8 = t9.getPassword();
		String pin = t11.getText();
		 char[] s10 = t10.getPassword();
		 String addr = t12.getText();
		String s12 = new String(s8);
		String s13 = new String(s10);
		String s16;
		
		System.out.println("s3 "+name);
		System.out.println("s4 "+fname);
		System.out.println("s5 "+email);
		System.out.println("s6 "+mob);
		System.out.println("s7 "+s7);
		System.out.println("s8 "+s8);
		System.out.println("s9 "+pin);
		System.out.println("s10 "+s10);
		System.out.println("s11 "+addr);
		System.out.println("s12 "+s12);
		System.out.println("s13 "+s13);
		//System.out.println("s3 "+s3);
		textfield.setText((String) 
		bo1.getSelectedItem());
		 int s18=bo1.getSelectedIndex();
		te1.setText((String) bo2.getSelectedItem());
		te2.setText((String) bo3.getSelectedItem());
		String s17 = textfield.getText() + "/" + 
		te1.getText() + "/" + te2.getText();
		 String s19=te1.getText();
		String s20=textfield.getText();
		String s21=te2.getText();
		 s16 = ch.getText();
		 int ln1 = aid.length();
		 int ln2 = name.length();
		 int ln3 = fname.length();
		int ln4 = email.length();
		int ln5 = mob.length();
		int ln6 = s7.length();
		int ln8 = pin.length();
		int ln9 = Integer.parseInt(String.valueOf(s10.length));
		 int ln10 = addr.length();
		int ln11 = s12.length();
		int ln12 = s13.length();
		int in13=s19.length();
		 int in14=s20.length();
		 int in15=s21.length();
		 
		 try {
				SRegisterBeans rb=new SRegisterBeans();
				 long mobn=Long.parseLong(mob);
				 int pinn=Integer.parseInt(pin);
				 ln1=Integer.parseInt(aid);
				 rb.setAid(ln1);
				 rb.setName(name);
				 rb.setFname(fname);
				 rb.setDob(s19+"/0" + s20 +"/" +"s21");
				 rb.setEmail(email);
				 rb.setMob(mobn);
				 rb.setPass(s21);
				 rb.setGender(s21);
				 rb.setPinno(pinn);
				 rb.setAddr(addr);
				 sregisterdb ai=new sregisterdb();
				 ai.insertAccountent(rb);
				 }catch (Exception e) {
				 System.err.println("Got an exception!");
				 System.err.println(e.getMessage());
				 } */


	}


package db;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionProvider {

	private static Session session=null;
	public static Session getSession() {
		System.out.println("Session Provider");
		try {
			Configuration cfg=new Configuration().configure("resource/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		session=sf.openSession();
		System.out.print("Get Session success full" );
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		return session;
	}
	
	
}

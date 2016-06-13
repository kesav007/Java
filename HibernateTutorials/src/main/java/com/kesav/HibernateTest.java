package com.kesav;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateTest {
	
	private Logger logger = LoggerFactory.getLogger(HibernateTest.class);

	public static void main(String[] args) {
		
		UserDetails kesav = new UserDetails();		
		kesav.setUserName("Kesav");
		kesav.setJoinedDate(new Date());
		kesav.setDescription("Description of the user goes here");
		Address kesavsHomeAddress = new Address();
		kesavsHomeAddress.setStreet("21398 Fultonham Cir");
		kesavsHomeAddress.setCity("Ashburn");
		kesavsHomeAddress.setState("VA");
		kesavsHomeAddress.setZipcode("20147");
		Address kesavsOfficeAddress = new Address();
		kesavsOfficeAddress.setStreet("123 Masters Street");
		kesavsOfficeAddress.setCity("Herndon");
		kesavsOfficeAddress.setState("VA");
		kesavsOfficeAddress.setZipcode("20171");
		kesav.getListOfAddresses().add(kesavsHomeAddress);
		kesav.getListOfAddresses().add(kesavsOfficeAddress);
		Company kesavsCompany = kesav.getCompany();
		kesavsCompany.setName("ABC Company");
		kesavsCompany.setDesignation("Manager");
		kesav.setCompany(kesavsCompany);
		Collage kesavsEngg = new Collage("GVIT");
		Collage kesavsMasters = new Collage("SDSMT");
		kesav.getListOfCollages().add(kesavsEngg);
		kesav.getListOfCollages().add(kesavsMasters);
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(kesav);
		session.getTransaction().commit();
		session.close();
		
		kesav = null;		
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		kesav = session.get(UserDetails.class, 1);		
		session.close();
		System.out.println(kesav.getUserName());
		System.out.println(kesav.getCompany());
		System.out.println(kesav.getListOfCollages().size());
		HibernateUtil.shutdown();
		
		/*- Only Collections are lazy loaded
		 * if eager type not specified then its lazyly loaded
		 * check getCompany, getUserName
		 * System.out.println(user.getListOfAddresses().size());
		*/
	}
}

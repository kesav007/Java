package com.kesav;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		// user.setUserId(1);
		user.setUserName("First User");
		user.setJoinedDate(new Date());
		Address homeAddress = new Address();
		homeAddress.setStreet("21398 Fultonham Cir");
		homeAddress.setCity("Ashburn");
		homeAddress.setState("VA");
		homeAddress.setZipcode("20147");
		// user.setHomeAddress(homeAddress);
		user.setDescription("Description of the user goes here");

		Address officeAddress = new Address();
		officeAddress.setStreet("123 Masters Street");
		officeAddress.setCity("Herndon");
		officeAddress.setState("VA");
		officeAddress.setZipcode("20171");

		user.getListOfAddresses().add(homeAddress);
		user.getListOfAddresses().add(officeAddress);
		// user.setOfficeAddress(officeAddress);

		UserDetails user2 = new UserDetails();
		// user.setUserId(1);
		user2.setUserName("Second User");
		user2.setJoinedDate(new Date());
		user2.setDescription("Description of the user goes here");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		// SessionFactory sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		// HibernateUtil.shutdown();
		user = null;

		session = sessionFactory.openSession();
		session.beginTransaction();
		user = session.get(UserDetails.class, 1);
		System.out.println(user);
		// session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}
}

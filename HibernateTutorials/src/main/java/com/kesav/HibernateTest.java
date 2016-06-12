package com.kesav;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		// user.setUserId(1);
		user.setUserName("First User");
		user.setJoinedDate(new Date());
		Address address = new Address();
		address.setStreet("21398 Fultonham Cir");
		address.setCity("Ashburn");
		address.setState("VA");
		address.setZipcode("20147");
		user.setAddress(address);
		user.setDescription("Description of the user goes here");

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

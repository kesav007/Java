package com.keshav;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTester {
	public static void main(String[] args) {
		UserDetails kesav = new UserDetails("Keshav Nallan");
		kesav.setDob(new Date());
		kesav.setDescription("Kesav is a Java Developer");
		Address home = new Address("21398 Fultonham Cir", "Ashburn", "VA", "20147");
		Address office = new Address("123 U Building", "Chantily", "VA", "20170");
		kesav.getAddressList().add(home);
		kesav.getAddressList().add(office);
		Watch ax = new Watch("Aramni ", "AX-302");
		Watch movado = new Watch("Movado", "MD080");
		kesav.getWatchSet().add(movado);
		kesav.getWatchSet().add(ax);
		Favorite kesavFavFood = new Favorite("Biryani", "Paradise");
		Favorite kesavFavmovie = new Favorite("Die hard", "Bruce Willis");
		kesav.setMovie(kesavFavmovie);
		kesav.setFood(kesavFavFood);

		Spouse spouse = new Spouse("Manju", "Saamavedam");
		kesav.setSpouse(spouse);
		spouse.setUserDetails(kesav);

		Spouse spouse2 = new Spouse("Soundarya", "Mccott");
		spouse2.setUserDetails(kesav);

		Vehicle honda = new Vehicle("Accord");
		Vehicle chevy = new Vehicle("Lumina");
		kesav.getVehicles().add(chevy);
		kesav.getVehicles().add(honda);

		Course java = new Course("Java Course");
		Course hibernate = new Course("Hibernate Course");
		Course businessObjects = new Course("Bussiness Objects");

		kesav.getCourses().add(java);
		kesav.getCourses().add(hibernate);


		// ###########################################
		UserDetails manju = new UserDetails("Manjusree Saamavedam");
		manju.setDob(new Date());
		manju.setDescription("Manju  is a BO Developer");
		Address manjuHome = home;
		Address manjuOffice = new Address("7878 Austin Ln", "Mclean", "VA", "20170");
		manju.getAddressList().add(manjuHome);
		manju.getAddressList().add(manjuOffice);
		Watch Timex = new Watch("Timex", "TX-100");
		Watch rolex = new Watch("Rolex", "RX-010");
		manju.getWatchSet().add(rolex);
		manju.getWatchSet().add(Timex);
		Favorite manjuFavFood = new Favorite("Methi Pappu", "Tajmahal");
		Favorite manjuFavmovie = new Favorite("Rudramadevi", "Anushka");
		manju.setMovie(manjuFavmovie);
		manju.setFood(manjuFavFood);

		Spouse spouse1 = new Spouse("Keshav", "Nallan");
		manju.setSpouse(spouse1);
		spouse1.setUserDetails(manju);

		Vehicle accura = new Vehicle("Accura 3.2L");
		manju.getVehicles().add(accura);

		/*-
		 * Vechicles is Many to One Relation with User Details
		 * So Unique Constraint formed, honda is already assigned to kesav
		 * so it can not be assigned to another user
		 * manju.getVehicles().add(honda);
		 */

		manju.getCourses().add(java);
		manju.getCourses().add(businessObjects);

		// #####################################

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(kesav);
		session.save(spouse);
		session.save(honda);
		session.save(chevy);

		session.save(manju);
		session.save(spouse1);
		session.save(spouse2);
		session.save(accura);

		session.save(hibernate);
		session.save(java);
		session.save(businessObjects);

		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();

	}
}

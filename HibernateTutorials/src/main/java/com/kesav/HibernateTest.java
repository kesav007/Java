package com.kesav;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateTest {

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
		Vehicle vehicle = new Vehicle();
		vehicle.setVechile_name("Honda");
		vehicle.setUser(kesav);
		kesav.setVehicle(vehicle);

		// One-to-Many
		Computer dell = new Computer("Dell Latitude");
		Computer mac = new Computer("Mac");
		kesav.getComputers().add(dell);
		kesav.getComputers().add(mac);

		// Many-to-One
		Shoe nike = new Shoe("Nike");
		// kesav.getShoes().add(nike);
		nike.setUser(kesav);
		Shoe addidas = new Shoe("Addidas");
		// kesav.getShoes().add(addidas);
		addidas.setUser(kesav);

		UserDetails manju = new UserDetails();
		manju.setUserName("Manju");
		manju.setVehicle(vehicle);
		// manju.getComputers().add(dell);
		// manju.getComputers().add(mac);

		Dress dress = new Dress("Raymonds");
		Pant jeanspant = new Pant("Levis", "Jeans");
		Pant formalpant = new Pant("JCPenny", "Formal Black");
		Shirt tshirt = new Shirt("Gucci", "T-Shirt");
		Shirt formalshirt = new Shirt("Buffalo", "Formal Shirt");

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(kesav);
		session.save(manju);
		session.save(vehicle);
		// cascade applied for computers
		// session.save(dell);
		// session.save(mac);
		session.save(nike);
		session.save(addidas);
		session.save(dress);
		session.save(jeanspant);
		session.save(formalpant);
		session.save(tshirt);
		session.save(formalshirt);
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

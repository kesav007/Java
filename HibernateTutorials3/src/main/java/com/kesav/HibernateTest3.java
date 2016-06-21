package com.kesav;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest3 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String inxdateInString = "24-08-2015";
		String uscdateInString = "16-02-2014";
		String kesavdobdateInString = "16-02-2014";
		Date inxJoinDate = sdf.parse(inxdateInString);
		Date uscJoinDate = sdf.parse(uscdateInString);
		Date kesavdob = sdf.parse(kesavdobdateInString);

		UserDetails kesav = new UserDetails();
		kesav.setUserName("Kesav");

		Company inx = new Company();
		inx.setCompanyName("Intersections");
		inx.setDesignation("Java Developer");
		inx.setJoinDate(inxJoinDate);
		kesav.setIntx(inx);

		Company usc = new Company();
		usc.setCompanyName("United States Courts");
		usc.setDesignation("Java Developer");
		usc.setJoinDate(uscJoinDate);
		kesav.setUsc(usc);

		Address home = new Address("21398 Fultonham Cir", "Ashburn", "VA", "20147");
		Address office = new Address("3901 Stonecroft Blvd", "Chantilly", "VA", "20151");
		kesav.getListOfAddresses().add(home);
		kesav.getListOfAddresses().add(office);
		Book java = new Book("Java", "1234");
		Book spring = new Book("Spring", "2345");
		kesav.getSetOfBooks().add(java);
		kesav.getSetOfBooks().add(spring);

		PersonalInfo kesavsPersonalInfo = new PersonalInfo();
		kesavsPersonalInfo.setDob(kesavdob);
		kesavsPersonalInfo.setFirst_name("Kesav");
		kesavsPersonalInfo.setLast_name("Nallan");
		kesavsPersonalInfo.setSsn("123-45-6789");
		kesavsPersonalInfo.setUser(kesav);
		kesav.setPersonalInfo(kesavsPersonalInfo);

		Watch timex = new Watch("Timex", 46);
		Watch movado = new Watch("Movado", 600);
		Watch ax = new Watch("armani", 75);
		kesav.getWatches().add(timex);
		kesav.getWatches().add(movado);
		kesav.getWatches().add(ax);

		Sunglass rayBan = new Sunglass("Ray-Ban", 55);
		Sunglass gucci = new Sunglass("Gucci", 50);
		rayBan.setUser(kesav);
		gucci.setUser(kesav);

		Laptop dell = new Laptop("Dell", 499);
		Laptop mac = new Laptop("Mac", 799);
		kesav.getLaptop().add(dell);
		kesav.getLaptop().add(mac);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(kesav);
		session.save(timex);
		session.save(movado);
		session.save(ax);
		session.save(rayBan);
		session.save(gucci);
		session.save(kesavsPersonalInfo);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}
}

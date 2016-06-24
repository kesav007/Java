package com.kesav;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest2 {

	public static void main(String[] args) {

		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.setVechile_name("Vehicle");
		FourWheeler car = new FourWheeler();
		car.setVechile_name("Car");
		car.setSteeringwheel("Steering");
		TwoWheeler bike = new TwoWheeler();
		bike.setSteeringHandle("Handle Bar");
		bike.setVechile_name("Bike");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle2);
		session.save(bike);
		session.save(car);
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}
}

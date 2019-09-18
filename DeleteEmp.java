package com.hibernate.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.hibernateproject.utility.Hibernateutil;

public class DeleteEmp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = Hibernateutil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		EmpDetail empdetail = (EmpDetail) session.load(EmpDetail.class, 4);
		session.delete(empdetail);
		System.out.println("Deleted");
		session.getTransaction().commit();

		sessionFactory.close();
	}
}

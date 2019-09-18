package com.hibernate.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.hibernateproject.utility.Hibernateutil;

public class UpdateEmp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = Hibernateutil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		EmpDetail empdetail = (EmpDetail) session.get(EmpDetail.class, 2);
		empdetail.e("Saran");
		System.out.println("Updated");
		session.getTransaction().commit();
		sessionFactory.close();
	}
}

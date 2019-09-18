package com.hibernate.hibernateproject.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	private static SessionFactory sessionFactory;

	/*
	 * static { try { sessionFactory = new
	 * Configuration().configure().buildSessionFactory(); } catch(Throwable th){
	 * System.err.println("initial SessionFactory creation failed"+th); throw new
	 * ExceptionInInitializerError(th); } }
	 */
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			} catch (Throwable th) {
				System.err.println("initial SessionFactory creation failed" + th);
				throw new ExceptionInInitializerError(th);
			}
		}
		return sessionFactory;
	}
}

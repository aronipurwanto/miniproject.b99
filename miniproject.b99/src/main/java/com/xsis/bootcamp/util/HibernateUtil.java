package com.xsis.bootcamp.util;
/**
 * 
 */


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Awiyanto Ajisasongko
 * 
 */
public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	
	/*
	 * perhatikan block dibawah ini!!
	 * bukan method, tetapi akan dijalankan ketika class ini di load ke classloader
	 * sehingga hanya dijalankan sekali saja.
	 * 
	 * Fungsi blok ini adalah untuk membaca konfigurasi hibernate, akan mencari file
	 * hibernate.cfg.xml pada classpath.
	 * 
	 * Kemudian setelah itu sessionFactory akan dapat digunakan oleh class manapun
	 * dengan memanggil HibernateUtil.getSessionFactory()
	 */
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}

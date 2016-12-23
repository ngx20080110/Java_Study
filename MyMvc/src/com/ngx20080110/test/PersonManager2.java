package com.ngx20080110.test;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.bean.ch5.Person2;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager2 {
	
	public static void main(String[] args) {
		PersonManager2 pm = new PersonManager2();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person2 p = new Person2();
		p.setAge(23);
		p.setName("Bob");
		String[] schools = { "Primary school", "Middle school" };
		p.setSchools(schools);
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

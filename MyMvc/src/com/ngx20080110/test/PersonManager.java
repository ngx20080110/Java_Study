package com.ngx20080110.test;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager {
	
	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person p = new Person();
		p.setAge(20);
		p.setName("Alan");
		List<String> schools = new ArrayList<String>();
		schools.add("Primary school");
		schools.add("Middle school");
		p.setSchools(schools);
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

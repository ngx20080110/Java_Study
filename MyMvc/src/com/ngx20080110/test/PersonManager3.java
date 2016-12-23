package com.ngx20080110.test;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.bean.ch5.Person2;
import com.ngx20080110.bean.ch5.Person3;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager3 {
	
	public static void main(String[] args) {
		PersonManager3 pm = new PersonManager3();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person3 p = new Person3();
		p.setAge(25);
		p.setName("Clark");
		Set<String> schools = new HashSet<String>();
		schools.add("Primary school");
		schools.add("Middle school");
		p.setSchools(schools);
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

package com.ngx20080110.test;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.hibernate.Session;

import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.bean.ch5.Person2;
import com.ngx20080110.bean.ch5.Person3;
import com.ngx20080110.bean.ch5.Person4;
import com.ngx20080110.bean.ch5.Person5;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager5 {
	
	public static void main(String[] args) {
		PersonManager5 pm = new PersonManager5();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
//		Person5 p = new Person5();
//		p.setAge(40);
//		p.setName("Fighter");
//		SortedSet<String> s = new TreeSet<String>();
//		s.add("Wild Java Camp");
//		s.add("Sun SCJP");
//		p.setTrainings(s);
		Person5 p = (Person5)session.load(Person5.class, 3);
//		p.getTrainings().add("Java");
		System.out.println(p.getTrainings().toString());
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

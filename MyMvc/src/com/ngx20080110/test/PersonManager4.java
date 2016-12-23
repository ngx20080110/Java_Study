package com.ngx20080110.test;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;

import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.bean.ch5.Person2;
import com.ngx20080110.bean.ch5.Person3;
import com.ngx20080110.bean.ch5.Person4;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager4 {
	
	public static void main(String[] args) {
		PersonManager4 pm = new PersonManager4();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person4 p = new Person4();
		p.setAge(28);
		p.setName("Dike");
		Map<String, Float> scores = new HashMap<String, Float>();
		scores.put("English", new Float(93));
		scores.put("History", new Float(76));
		scores.put("Math", new Float(88));
		p.setScores(scores);
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

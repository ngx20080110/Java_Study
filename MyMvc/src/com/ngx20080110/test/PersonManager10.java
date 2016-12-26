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

import com.ngx20080110.bean.ch5.Cat10;
import com.ngx20080110.bean.ch5.Name10;
import com.ngx20080110.bean.ch5.Name6;
import com.ngx20080110.bean.ch5.Name9;
import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.bean.ch5.Person2;
import com.ngx20080110.bean.ch5.Person3;
import com.ngx20080110.bean.ch5.Person4;
import com.ngx20080110.bean.ch5.Person5;
import com.ngx20080110.bean.ch5.Person6;
import com.ngx20080110.bean.ch5.Person10;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager10 {
	
	public static void main(String[] args) {
		PersonManager10 pm = new PersonManager10();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person10 p = new Person10();
		Name10 name = new Name10();
		name.setFirst("Guan Ying");
		name.setLast("WU");
		p.setName(name);
		String email = "gy.wu@macaowater.com";
		p.setEmail(email);
		Cat10 pet = new Cat10();
		pet.setName("Tom");
		pet.setColor("White");
		p.setPet(pet);
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

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

import com.ngx20080110.bean.ch5.Name6;
import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.bean.ch5.Person2;
import com.ngx20080110.bean.ch5.Person3;
import com.ngx20080110.bean.ch5.Person4;
import com.ngx20080110.bean.ch5.Person5;
import com.ngx20080110.bean.ch5.Person6;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager6 {
	
	public static void main(String[] args) {
		PersonManager6 pm = new PersonManager6();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person6 p = new Person6();
		p.setAge(30);
		Name6 n = new Name6();
		n.setFirst("W2U");
		n.setLast("G2Y");
		Map<String, Integer> power = new HashMap<String, Integer>();
		power.put("Fire", new Integer(90));
		power.put("Wing", new Integer(60));
		power.put("Land", new Integer(40));
		n.setPower(power);
		p.setName(n);
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

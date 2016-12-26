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
import com.ngx20080110.bean.ch5.Name7;
import com.ngx20080110.bean.ch5.Person;
import com.ngx20080110.bean.ch5.Person2;
import com.ngx20080110.bean.ch5.Person3;
import com.ngx20080110.bean.ch5.Person4;
import com.ngx20080110.bean.ch5.Person5;
import com.ngx20080110.bean.ch5.Person6;
import com.ngx20080110.bean.ch5.Person7;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager7 {
	
	public static void main(String[] args) {
		PersonManager7 pm = new PersonManager7();
		pm.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void createAndStorePerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person7 p = new Person7();
		p.setAge(30);
		Name7 n = new Name7();
		n.setFirst("W2U");
		n.setLast("G2Y");
		Map<String, Integer> power = new HashMap<String, Integer>();
		power.put("Fire", new Integer(90));
		power.put("Wing", new Integer(60));
		power.put("Land", new Integer(40));
		n.setPower(power);
		
		Name7 n2 = new Name7();
		n2.setFirst("W22U");
		n2.setLast("G22Y");
		Map<String, Integer> power2 = new HashMap<String, Integer>();
		power2.put("Fire", new Integer(930));
		power2.put("Wing", new Integer(602));
		power2.put("Land", new Integer(401));
		n2.setPower(power2);
		
		Map<String, Name7> nicks = new HashMap<String, Name7>();
		nicks.put("Level 1", n);
		nicks.put("Level 2", n2);
		p.setNicks(nicks);
		session.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}
}

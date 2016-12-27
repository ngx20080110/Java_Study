package com.ngx20080110.test.ch6;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.ngx20080110.bean.ch6.Address1;
import com.ngx20080110.bean.ch6.Person1;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager1 {
	
	public static void main(String[] args) {
		PersonManager1 pm = new PersonManager1();
		pm.testPerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void testPerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Person1 p = new Person1();
		Address1 a = new Address1("Macau");
		p.setName("WUGY");
		p.setAge(30);
		p.setAddress(a);
		session.persist(p);
		
		Address1 a2 = new Address1("Zhuhai");
		p.setAddress(a2);
		
		tx.commit();
		HibernateUtil.closeSession();
	}
}

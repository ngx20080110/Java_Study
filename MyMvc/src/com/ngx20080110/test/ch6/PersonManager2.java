package com.ngx20080110.test.ch6;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.ngx20080110.bean.ch6.Address1;
import com.ngx20080110.bean.ch6.Person1;
import com.ngx20080110.bean.ch6.Person2;
import com.ngx20080110.util.HibernateUtil;

public class PersonManager2 {
	
	public static void main(String[] args) {
		PersonManager2 pm = new PersonManager2();
		pm.testPerson();
		HibernateUtil.sessionFactory.close();
	}
	
	private void testPerson() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Person2 p = new Person2();
		Address1 a = new Address1("Macao");
		session.persist(a);
		p.setName("WGY");
		p.setAge(30);
		p.getAddresses().add(a);
		session.save(p);
		Address1 a2 = new Address1("Zhuhai");
		session.persist(a2);
		p.getAddresses().add(a2);
		
		tx.commit();
		HibernateUtil.closeSession();
	}
}

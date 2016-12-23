package com.ngx20080110.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.ngx20080110.bean.ch5.News;
import com.ngx20080110.bean.ch5.News2;

public class NewsManager2 {
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		News2 n = (News2)sess.get(News2.class, 1);
		System.out.println(n.getFullContent());
		tx.commit();
		sess.close();
		sf.close();
	}
}

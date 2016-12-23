package com.ngx20080110.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.ngx20080110.bean.ch5.News;
import com.ngx20080110.bean.ch5.News2;
import com.ngx20080110.bean.ch5.News3;

public class NewsManager3 {
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		News3 n = new News3();
		n.setTitle("News 3");
		n.setContent("SQL Server is database");
		sess.save(n);
		tx.commit();
		System.out.println(n.getFullContent());
		sess.close();
		sf.close();
	}
}

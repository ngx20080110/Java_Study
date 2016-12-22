package com.ngx20080110.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.ngx20080110.bean.ch5.News;

public class NewsManager {
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		News news = new News();
		news.setTitle("Java");
		news.setContent("Java is good");
		sess.save(news);
		tx.commit();
		sess.close();
		sf.close();
	}
}

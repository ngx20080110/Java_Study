package com.ngx20080110.ch7.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ngx20080110.ch7.service.Person;

public class BeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Person p = ctx.getBean("chinese", Person.class);
		p.useAxe();
		((ClassPathXmlApplicationContext)ctx).close();
	}

}

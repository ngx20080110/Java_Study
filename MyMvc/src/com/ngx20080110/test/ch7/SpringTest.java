package com.ngx20080110.test.ch7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ngx20080110.bean.ch7.PersonService;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(ctx);
		PersonService p = ctx.getBean("personService", PersonService.class);
		p.info();
	}

}

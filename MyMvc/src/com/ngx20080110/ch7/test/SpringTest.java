package com.ngx20080110.ch7.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		String loginPage = ctx.getMessage("loginPage", null, Locale.TAIWAN);
		System.out.println(loginPage);
		((ClassPathXmlApplicationContext)ctx).close();
	}

}

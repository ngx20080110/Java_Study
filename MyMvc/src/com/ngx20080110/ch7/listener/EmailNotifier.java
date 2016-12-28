package com.ngx20080110.ch7.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.ngx20080110.ch7.event.EmailEvent;

public class EmailNotifier implements ApplicationListener<ApplicationEvent> {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof EmailEvent) {
			EmailEvent emailEvent = (EmailEvent)event;
			System.out.println("Email address : " + emailEvent.getAddress());
			System.out.println("Email text : " + emailEvent.getText());
		}
		else {
			System.out.println("Contain self event : " + event);
		}
	}
}

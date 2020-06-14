package com.springexample.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		//1. 직접 ServiceConsumer 객체 생성 (new 구문 사용)
		//MyServiceConsumer serviceConsumer = new MyServiceConsumer();
		
		//2. 스프링이 제공하는 팩토리(Factory or ApplicationContext) 사용
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("app-context.xml");
		
		ServiceConsumer serviceConsumer = 
				(ServiceConsumer)ctx.getBean("serviceConsumer");
		
//		MessageService messageService = 
//				(MessageService)ctx.getBean("messageService");
//		serviceConsumer.setMessageService(messageService);
		
		serviceConsumer.doSomething();
		

	}

}









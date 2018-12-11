package com.training.spel.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spel.bean.Author;

public class Application1 {

	public static void main(String[] args) {
	
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
			Author author = (Author) context.getBean("authorBean");
			System.out.println(author.toString());
			System.out.println(author.getFullAuthorInfo());
			context.close();
	}
}

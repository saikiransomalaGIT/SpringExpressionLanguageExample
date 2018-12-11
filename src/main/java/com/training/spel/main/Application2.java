package com.training.spel.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spel.bean.Operators;
import com.training.spel.bean.TernaryOperator;

public class Application2 {

	public static void main(String[] args) {
	
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
			Operators op = (Operators) context.getBean("operatorsBean");
			System.out.println(op.toString());
			TernaryOperator tern = (TernaryOperator) context.getBean("ternaryOperatorBean");
			System.out.println(tern.toString());
			context.close();
	}
}
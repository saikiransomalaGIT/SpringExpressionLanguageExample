package com.training.spel.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spel.bean.TestMapList;
import com.training.spel.bean.TestRegEx;

public class Application3 {

	public static void main(String[] args) {
	
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

			TestMapList testMapList = (TestMapList) context.getBean("testMapListBean");
			System.out.println(testMapList.toString());
			
			TestRegEx testRegEx = (TestRegEx) context.getBean("testRegExBean");
			System.out.println(testRegEx.toString());
			
			context.close();
	}
}
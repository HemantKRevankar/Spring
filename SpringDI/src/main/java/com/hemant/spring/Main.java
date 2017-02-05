package com.hemant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hemant.spring.model.Shape;
import com.hemant.spring.model.Triangle;

public class Main {
public static void main(String[] args) {
	//Shape triangle = new Triangle();
	//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/java/context.xml"));
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
	//Shape triangle = (Triangle) beanFactory.getBean("triangle");
    Shape triangle = (Triangle) applicationContext.getBean("triangle");
	triangle.draw();
	
	/*Shape isocelesTriangle = (Triangle) applicationContext.getBean("isocelesTriangle");
	isocelesTriangle.draw();*/
}
}

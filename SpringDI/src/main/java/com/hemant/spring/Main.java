package com.hemant.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.hemant.spring.model.Shape;
import com.hemant.spring.model.Triangle;

public class Main {
public static void main(String[] args) {
	//Shape triangle = new Triangle();
	BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/java/context.xml"));
	Shape triangle = (Triangle) beanFactory.getBean("triangle");
	triangle.draw();
}
}

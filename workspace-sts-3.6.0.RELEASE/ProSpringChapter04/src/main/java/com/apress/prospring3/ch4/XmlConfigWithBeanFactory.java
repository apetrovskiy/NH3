package com.apress.prospring3.ch4;

/*
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;
*/

public class XmlConfigWithBeanFactory {
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/xmlBeanFactory.xml"));
		
		//Oracle oracle = (Oracle)factory.getBean("oracle");
		Oracle oracle = factory.getBean("oracle", Oracle.class);
		System.out.println(oracle.defineMeaningOfLife());
	}
	*/
}

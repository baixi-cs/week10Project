package com.cogent.setterBasedDI;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("com/cogent/setterBasedDI/ApplicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  //Bean got pulled from Spring container
    Student student2=(Student)factory.getBean("studentbean"); 
    System.out.println("prototype "+student.hashCode());
    System.out.println("prototype "+student2.hashCode());
    Student student3=(Student)factory.getBean("studentbean2");  //Bean got pulled from Spring container
    Student student4=(Student)factory.getBean("studentbean2"); 
    System.out.println("singleton "+student3.hashCode());
    System.out.println("singleton "+student4.hashCode());
    
    student.displayInfo();  
}  
}  

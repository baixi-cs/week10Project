package com.cogent.controller;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.cogent.entity.Address;

import com.cogent.entity.Employee;




public class Controller {
	public static void main(String[] args) {
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		System.out.println("connection successful");

	
	
		//create object and save data
		
		Address a1 = new Address (3405, "Portland", "Orchard Ave");
		session.save(a1);
		Employee e1 = new Employee (111, "Alan", "IT dept", a1);
		session.save(e1);
		
		Address a2 = new Address (7788, "Seattle", "23St Maple blvd");
		session.save(a2);
		Employee e2 = new Employee (135, "Bob", "HR dept", a2);
		session.save(e2);
	
	

//		System.out.println(" add successfully...");
//		t.commit();
		
		
		
		//read
		String hql = "FROM Employee";
		System.out.println("read hql ..." );
		Query query = session.createQuery(hql);
		List<Employee> results = query.list();
//		System.out.println("Employee ..." + results);
		
		for(Employee e: results) {
			System.out.println("every employee ele..." +e);
		}
		
		//other opt to read data
		System.out.println("------------------------------------------------" );
		Query query2 = session.createQuery("from Employee");   // Class Name
  		List<Employee> eList = query2.list();
  		for(Employee e: eList){
  			System.out.println("List of Customers::"+e.getEmpid()+","+e.getName()+" "+e.getDept()+" "+e.getAddress());
  		}

  		System.out.println("*****************************************************" );
  		String hql3 = "DELETE FROM Employee "  + "WHERE id =:id";
  		
  		Query query3 = session.createQuery(hql3);
  		query3.setParameter("id", 22);
  		int result3 = query3.executeUpdate();
  		System.out.println("Rows affected: " + result3);  
		t.commit();
		
		System.out.println("*****************************************************" );
  	
		
//		Query queryDelete2 = session.createQuery("delete from Address where addid=5");---not work
//		
//        
//        //if else record is not there then ---Optional - JAVA 8 -  SpringBoot
//		queryDelete2.executeUpdate();
//		System.out.println("Deleted Successfully");
//		t.commit();

		
		
	
	}
}

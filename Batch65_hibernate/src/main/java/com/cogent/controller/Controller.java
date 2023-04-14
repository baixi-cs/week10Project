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


import com.cogent.entity.Customer;





public class Controller {
	public static void main (String[] args) {
		
		//logic to read config file  --  API 

				//Hibernate API 
				     //Session
				     //transaction
				     //Query
				
				StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		       	SessionFactory factory = meta.getSessionFactoryBuilder().build();
				Session session = factory.openSession();
				Transaction t = session.beginTransaction();
				System.out.println("success...");
				
			    //create object and save data
				Customer c1 = new Customer(111, "Alan", 30, 123456780);
				Customer c2 = new Customer(135, "Alex", 20, 123412345);
				session.save(c1);
				session.save(c2);
				System.out.println("c1  add successfully...");
				
//				t.commit();
				
				
				// read fetch from table HQL
				String hql = "FROM Customer";
				System.out.println("read hql ..." );
				Query query = session.createQuery(hql);
				List<Customer> results = query.list();
				System.out.println("customer ..." + results);
				
				for(Customer c: results) {
					System.out.println("every customer ele..." +c);
				}
				//other opt to read data
				System.out.println("------------------------------------------------" );
				Query query2 = session.createQuery("from Customer");   // Class Name
		  		List<Customer> custList = query2.list();
		  		for(Customer cust : custList){
		  			System.out.println("List of Customers::"+cust.getId()+","+cust.getName()+" "+cust.getAge()+" "+cust.getPhone());
		  		}

				
				//update
		  		String hql4 = "UPDATE Customer set name= :name, age = : age, phone =:phone WHERE id = :id";      
		  		Query query4 = session.createQuery(hql4);
		  		query4.setParameter("name", "Ava");
		  		query4.setParameter("age", 19);
		  		query4.setParameter("phone", 432112340L);
		  		query4.setParameter("id", 10);
		  		int result = query4.executeUpdate();
		  		System.out.println("Rows affected: " + result);
		  		t.commit();
		  		
		
		  		
		  		
				//DELETE
		  		
		  		Query queryDelete = session.createQuery("delete from Customer where id=2");
				
		        //if else record is not there then ---Optional - JAVA 8 -  SpringBoot
//				queryDelete.executeUpdate();
//				System.out.println("Deleted Successfully");
//				t.commit();  --run this line should commit first commit


				System.out.println("*****************************************************" );
//		  		String hql3 = "DELETE FROM Customer "  + 
//		  	             "WHERE id =:id";
//		  		Query query3 = session.createQuery(hql3);
//		  		query3.setParameter("id", 4);
//		  		int result3 = query3.executeUpdate();
////		  		System.out.println("Rows affected: " + result3);  
//				t.commit();
				
	}
	

}

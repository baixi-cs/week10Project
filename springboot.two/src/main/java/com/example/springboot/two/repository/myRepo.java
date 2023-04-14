package com.example.springboot.two.repository;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Repository
//@PropertySource("classpath:oracledatabase.properties")

public class myRepo {
	@Value("101")
	int num;
//	
////	@Value("${server.port}")  //New
////    private String apacheserver_port;
//
//	
//
//    @Value("${db.port}")  //New 3306
//    private String portno;
//    
//    
//   
//    
    public int disp() {
		System.out.println("port number read is ");
		return num;
	}




}

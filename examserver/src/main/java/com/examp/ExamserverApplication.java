package com.examp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Autowired
//private JdbcTemplate jdbcTemplate;
public class ExamserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		//String sql="INSERT INTO exam (name, id, password) VALUES (?,?,?)";
        //int result= jdbcTemplate.update(sql,"Ali", "123", "asdb23");
       // if(result>0){
           // System.out.println("a new row added ");
       // }
	System.out.println("Ramazan ba khair");
	}

}

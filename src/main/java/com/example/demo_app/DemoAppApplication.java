package com.example.demo_app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args)  {
	//	SpringApplication.run(DemoAppApplication.class, args);
              ConfigurableApplicationContext ctx = SpringApplication.run(DemoAppApplication.class);
//        RegisterUser userReg = ctx.getBean(RegisterUser.class);
//        userReg.registerUser("mike");
//        userReg.getUserDetails("mike");



	}

}

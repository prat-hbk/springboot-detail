package com.springdetail.detail;

import com.springdetail.detail.sub1.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DetailApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= SpringApplication.run(DetailApplication.class, args);
		SpringConfig component = applicationContext.getBean(SpringConfig.class);
		System.out.println(component.message());
	}

}

package com.wadda.spring.cloud.stream;



import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;


@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableBinding(Source.class)
public class SpringCloudStreamPublisherApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamPublisherApplication.class, args);
	}

}

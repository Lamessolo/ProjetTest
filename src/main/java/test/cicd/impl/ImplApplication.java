package test.cicd.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import test.cicd.impl.models.CollegeStudent;

@SpringBootApplication
public class ImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImplApplication.class, args);
	}

	@Bean(name="collegeStudent")
	@Scope(value = "prototype")
	CollegeStudent getCollegeStudent(){ return new CollegeStudent();}
}

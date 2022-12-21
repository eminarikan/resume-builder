package dev.eminarikan.resumebuilder;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.eminarikan.resumebuilder.model.Person;

@SpringBootApplication
public class ResumeBuilderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ResumeBuilderApplication.class, args);
	}

	@Bean
	public Person person() throws StreamReadException, DatabindException, IOException {

		
		InputStream jsonFile2 = new ClassPathResource("profile.json").getInputStream();

		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(jsonFile2, Person.class);
		return person;
	}

}

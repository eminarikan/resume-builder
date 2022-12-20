package dev.eminarikan.resumebuilder;

import java.io.File;
import java.io.IOException;

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

		
		File jsonFile2 = new ClassPathResource("profile.json").getFile();

		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(jsonFile2, Person.class);
		return person;
	}

}

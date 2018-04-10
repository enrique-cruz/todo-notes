package org.crukike.todonotes.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.crukike.todonotes")
public class TodoNotesWebApp extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TodoNotesWebApp.class);
	}

	public static void main(String args[]) {
		SpringApplication.run(new Class[] {TodoNotesWebApp.class, WebMvcAppConfig.class}, args);
	}
}

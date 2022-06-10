package com.techdj;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldRestApplication {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HelloWorldRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestApplication.class, args);
	}

	@GetMapping("/")
	public String getHello1(){

		String html = "<html>\n" +
				"<head>\n" +
				"<title>Spring Magic</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"\n" +
				"<h1>Hi Dheerendra</h1>\n" +
				"<p>Application deployed successfully </p>\n" +
				"\n" +
				"</body>\n" +
				"</html>";
		return html;
			}


@GetMapping("/{name}")
public String getHello(@PathVariable String name){
	
	if(!name.equalsIgnoreCase("Dheerendra")) {
		logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
	return "Hello "+name+" , How are you today ?";
	}
	else {
		logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
		throw new IllegalArgumentException("Dheerendra is not a valid user");
	}}
}

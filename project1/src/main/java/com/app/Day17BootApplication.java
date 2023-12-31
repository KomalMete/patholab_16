package com.app;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//consists of springbootConfiguration +@EnablrAutoConfiguration +@ComponentScan(basepkg="com.app")
public class Day17BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day17BootApplication.class, args);
	}
	@Bean // equivalent to <bean id ..../> in xml file/method level annotation
	public ModelMapper mapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}

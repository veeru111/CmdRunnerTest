package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Myrunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {

		for(String a:args)
			System.out.println((a));
		
		System.out.println(Arrays.asList(args));
	}

}

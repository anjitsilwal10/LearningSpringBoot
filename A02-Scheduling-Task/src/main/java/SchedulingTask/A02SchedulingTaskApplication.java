package SchedulingTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class A02SchedulingTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(A02SchedulingTaskApplication.class, args);
	}

}

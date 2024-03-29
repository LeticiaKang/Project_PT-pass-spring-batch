package com.fastcampus.pass;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBatchProcessing
public class PassBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassBatchApplication.class, args);
	}

//	@Bean
//	ApplicationRunner applicationRunner(JobLauncher jobLauncher, Job passJob) {
//		return args -> jobLauncher.run(passJob, new JobParameters());
//	}

}



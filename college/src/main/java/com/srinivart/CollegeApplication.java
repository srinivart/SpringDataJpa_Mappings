package com.srinivart;

import com.srinivart.entity.Branch;
import com.srinivart.entity.Subject;
import com.srinivart.repository.BranchRepository;
import com.srinivart.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CollegeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CollegeApplication.class, args);
	}

	@Autowired
	private BranchRepository branchRepository;

	@Autowired
	private SubjectRepository subjectRepository;


	@Override
	public void run(String... args) throws Exception {


		Branch b1 = new Branch();
		b1.setBname("Computer Science and Engineering");
		b1.setSname("CSE");

		Branch b2 = new Branch();
		b2.setBname("Information Technology");
		b2.setSname("IT");

		Subject s1 = new Subject();
		s1.setSubjectName("M1");

		Subject s2 = new Subject();
		s2.setSubjectName("MM");

		Subject s3 = new Subject();
		s3.setSubjectName("Physics");

		Subject s4 = new Subject();
		s4.setSubjectName("Chemistry");


		b1.getSubjects().add(s1);
		b1.getSubjects().add(s2);

		b2.getSubjects().add(s3);
		b2.getSubjects().add(s4);


		branchRepository.save(b1);
		branchRepository.save(b2);


	}


}

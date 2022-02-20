package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class  JpaProjectApplication {

	public static void main(String[] args) {
	 ApplicationContext context = SpringApplication.run(JpaProjectApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		User user;
		user = new User();
		user.setName("Prashant Chauhan");
		user.setCity("bangalore");
		user.setStatus("learning springboot");
		User user1 = new User();
		user1.setName("Sanjana Chauhan");
		user1.setCity("bangalore");
		user1.setStatus("learning c++");

		List<User> iter= List.of(user,user1);
		Iterable<User> result = userRepository.saveAll(iter);
		result.forEach(System.out::println);

	userRepository.getAllUsers().forEach(System.out::println);
	}

}

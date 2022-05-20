package com.example.lender;

import com.example.lender.Controller.lender_controller;
import com.example.lender.Model.Lender;
import com.example.lender.Repository.lender_repo;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;
import static org.reflections.Reflections.collect;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootTest
class LenderApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private lender_controller l;

	@Mock
	private lender_repo ll;


	@Test
	public void saveLenderTest(@RequestBody Lender lender)
	{
		ll.save(lender);
	}

	@Test
	public void givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect() {
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 50;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1)
				.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();

		System.out.println(generatedString);

	}


}

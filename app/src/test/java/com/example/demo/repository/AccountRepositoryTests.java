package com.example.demo.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.demo.repository.entity.Account;

@DataJpaTest
class AccountRepositoryTests {

	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private AccountRepository accountRepository;

	@BeforeEach
	void beforeEach() {
		entityManager.persist(new Account(1L, "user1", "user1@example.com"));
		entityManager.persist(new Account(2L, "user2", "user2@example.com"));
	}

	@Test
	void findByNameWithout01() {
		List<Account> accounts = accountRepository.findByName("test1");
		assertThat(accounts.size()).isEqualTo(0);
	}

	@Test
	void findByNameWithout02() {
		List<Account> accounts = accountRepository.findByName("user1");
		assertThat(accounts.size()).isEqualTo(1);
		assertThat(accounts.get(0).getName()).isEqualTo("user1");
	}
}

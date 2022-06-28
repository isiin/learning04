package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.repository.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long>{
	List<Account> findByName(String name);
}

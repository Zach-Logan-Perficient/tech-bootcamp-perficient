package com.perficient.techbootcampzach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampzach.entity.AccountData;
import com.perficient.techbootcampzach.repository.AccountDataRepository;

@Service
public class AccountDataService {
	@Autowired
	private AccountDataRepository repo;
	
	public AccountData saveAccountData(AccountData accountData) {
		return repo.save(accountData);
	}
}

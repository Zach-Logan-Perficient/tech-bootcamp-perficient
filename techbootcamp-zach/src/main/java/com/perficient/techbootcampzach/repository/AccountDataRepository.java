package com.perficient.techbootcampzach.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perficient.techbootcampzach.entity.AccountData;

public interface AccountDataRepository extends JpaRepository<AccountData, Integer> {

}

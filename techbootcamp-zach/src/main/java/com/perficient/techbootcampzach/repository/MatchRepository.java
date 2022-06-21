package com.perficient.techbootcampzach.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perficient.techbootcampzach.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {

}

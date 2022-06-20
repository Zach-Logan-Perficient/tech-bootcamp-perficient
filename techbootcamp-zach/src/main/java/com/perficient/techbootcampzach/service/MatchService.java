package com.perficient.techbootcampzach.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampzach.entity.Match;
import com.perficient.techbootcampzach.repository.MatchRepository;

@Service
public class MatchService {
	@Autowired
	private MatchRepository repo;
	
	public Match saveMatch(Match match) {
		return repo.save(match);
	}
	
	public List<Match> saveMatches(List<Match> matches) {
		return repo.saveAll(matches);
	}
	
	public List<Match> saveMatches(Match[] matches) {
		return repo.saveAll(Arrays.asList(matches));
	}
}

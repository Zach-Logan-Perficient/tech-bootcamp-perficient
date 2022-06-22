package com.perficient.techbootcampzach.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampzach.entity.Match;
import com.perficient.techbootcampzach.repository.MatchMetaDataRepository;
import com.perficient.techbootcampzach.repository.MatchRepository;

@Service
public class MatchService {
	@Autowired
	private MatchRepository repo;
	@Autowired
	private MatchMetaDataRepository metaRepo;
	
	public Match saveMatch(Match match) {
		return repo.save(match);
	}
	
	public List<Match> saveMatches(List<Match> matches) {
		List<Match> fiteredMatches = new ArrayList<Match>();
		for(Match match : matches) {
			if(!metaRepo.existsById(match.getMetadata().getMatchid()))
			{
				fiteredMatches.add(match);
			}
		}
		return repo.saveAll(fiteredMatches);
	}
	
	public List<Match> saveMatches(Match[] matches) {
		return saveMatches(Arrays.asList(matches));
	}
	
	public List<Match> getMatches() {
		return repo.findAll();
	}
	
	public List<Match> getMatches(String name, String mode) {
		return repo.findMatchesByNameAndMode(name, mode);
	}
	
	public List<Match> getMatches(String name) {
		return repo.findMatchesByName(name);
	}
}

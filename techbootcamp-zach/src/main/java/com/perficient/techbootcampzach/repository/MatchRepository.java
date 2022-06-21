package com.perficient.techbootcampzach.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.perficient.techbootcampzach.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {

	@Query("SELECT DISTINCT m FROM Match as m JOIN m.players AS p JOIN p.blue AS b JOIN p.red AS r JOIN m.metadata AS meta "
			+ "WHERE meta.mode = :mode AND ( b.name = :name OR r.name = :name )")
	public List<Match> findMatchesByNameAndMode(@Param("name") String name, @Param("mode") String mode);
	
	@Query("SELECT DISTINCT m FROM Match as m JOIN m.players AS p JOIN p.blue AS b JOIN p.red AS r"
			+ "WHERE b.name = :name OR r.name = :name")
	public List<Match> findMatchesByName(@Param("name") String name);
	
	@Query("SELECT DISTINCT m FROM Match as m JOIN m.metadata AS meta "
			+ "WHERE meta.mode = :mode")
	public List<Match> findMatchesByMode(@Param("mode") String mode);
}

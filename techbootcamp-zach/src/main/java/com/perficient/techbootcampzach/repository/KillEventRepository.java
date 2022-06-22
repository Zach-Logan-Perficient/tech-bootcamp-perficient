package com.perficient.techbootcampzach.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.perficient.techbootcampzach.entity.KillEvent;

public interface KillEventRepository extends JpaRepository<KillEvent, Integer> {
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k WHERE k.killer_display_name = :name AND k.victim_display_name = :name")
	public List<KillEvent> findSelfKillsByName(@Param("name") String name);
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k WHERE k.killer_display_name = :name OR k.victim_display_name = :name")
	public List<KillEvent> findKillEventsByName(@Param("name") String name);
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k WHERE k.killer_display_name = :name AND NOT k.victim_display_name = :name")
	public List<KillEvent> findKillsByName(@Param("name") String name);
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k WHERE k.victim_display_name = :name")
	public List<KillEvent> findDeathsByName(@Param("name") String name);
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k JOIN k.player_stats AS ps JOIN ps.round AS r JOIN r.match AS m JOIN m.metadata AS meta "
			+ "WHERE (k.killer_display_name = :name AND k.victim_display_name = :name) AND meta.map = :map")
	public List<KillEvent> findSelfKillsByNameAndMap(@Param("name") String name, @Param("map") String map);
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k JOIN k.player_stats AS ps JOIN ps.round AS r JOIN r.match AS m JOIN m.metadata AS meta "
			+ "WHERE (k.killer_display_name = :name OR k.victim_display_name = :name) AND meta.map = :map")
	public List<KillEvent> findKillEventsByNameAndMap(@Param("name") String name, @Param("map") String map);
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k JOIN k.player_stats AS ps JOIN ps.round AS r JOIN r.match AS m JOIN m.metadata AS meta "
			+ "WHERE k.killer_display_name = :name AND NOT k.victim_display_name = :name AND meta.map = :map")
	public List<KillEvent> findKillsByNameAndMap(@Param("name") String name, @Param("map") String map);
	
	@Query("SELECT DISTINCT k FROM KillEvent AS k JOIN k.player_stats AS ps JOIN ps.round AS r JOIN r.match AS m JOIN m.metadata AS meta "
			+ "WHERE k.victim_display_name = :name AND meta.map = :map")
	public List<KillEvent> findDeathsByNameAndMap(@Param("name") String name, @Param("map") String map);
}

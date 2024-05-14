package com.vivek.SpringBootREST;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnimalRepo extends JpaRepository<Animal, Integer> {
	
	List<Animal> findByAnameOrderByAageDesc(String name);
	
	@Query("FROM Animal WHERE aname= :aname ORDER BY aage DESC")
	List<Animal> findAnimalsWithName(@Param("aname") String name);

}

package com.revature.repositories;

import com.revature.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Integer> {

    List<Actor> findByName(String name);


}

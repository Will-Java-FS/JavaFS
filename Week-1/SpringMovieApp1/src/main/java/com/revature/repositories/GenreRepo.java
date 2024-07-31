package com.revature.repositories;

import com.revature.models.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepo extends CrudRepository<Genre, Integer> {

    public List<Genre> findByName(String name);
}
package com.revature.Repository;

import com.revature.Model.Painting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Extending JPARepository<Entity class, ID datatype> grants this class the functionality of a JPARepository:
 * this means that this class will be capable of treating the provided entity as an ORM object.
 *
 * Spring provides any JPARepository with some automatically generated abilities, such as persisting with save(),
 * as well as some automatically generated methods for interacting with databases such as findAll() and findById().
 * These methods do not need to be implemented by the developer at all.
 *
 * A JPARepository also allows for the developer to write JPQL (Java Persistence Query Language), which allows for the
 * writing of queries that Spring JPARepository does not provide from the start. JPQL Queries are made for interacting
 * with ORM entities, and they follow the same format and use the same clauses as a typical SQL query, but rather
 * than starting with SELECT <columns> FROM <table> ... , they are written with the pattern FROM <entity class name> ...
 * because they abstract away the conversion of a ResultSet into a model class entirely, and do not require the SELECT
 * keyword. (Spring also allows you to write native sql queries, or selecting columns with JPQL, if required.)
 *
 * This class will work like a Spring Component, but the @Component annotation is not needed here, because the class
 * is an interface. The implementation of JPARepository, which will be a component, will be generated at runtime.
 */
@Repository
public interface PaintingRepository extends JpaRepository<Painting,Long> {
    List<Painting> findPaintingsByGenre(String genre);

    List<Painting> findPaintingsByTitle(String title);

    @Query("From Painting WHERE title= :title AND genre=:genre")
    List<Painting> findPaintingsByTitleAndGenre(@Param("title") String title, @Param("genre") String genre);
}

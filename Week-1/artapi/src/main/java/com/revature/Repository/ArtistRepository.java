package com.revature.Repository;

import com.revature.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Extending JPARepository<Entity class, ID datatype> grants this class the functionality of a JPARepository:
 * this means that this class will be capable of treating the provided entity as a Java Object that is mapped
 * to a database record automatically using a strategy called Object Relational Mapping.
 *
 * Spring provides any JPARepository with some automatically generated abilities, such as persisting with save(),
 * as well as some automatically generated methods for interacting with databases such as findAll() and findById().
 * These methods do not need to be implemented by the developer at all. If the developer needs a more complicated
 * query, they can use a named query and allow Spring to construct a query based off of a method name (for instance,
 * selecting an entity where a column fulfills some condition, just like in a WHERE clause in SQL.)
 *
 * A JPARepository also allows for the developer to write JPQL (Java Persistence Query Language), which allows for the
 * writing of queries that Spring JPARepository does not provide from the start. JPQL Queries are made for interacting
 * with ORM entities, and they follow the same format and use the same clauses as a typical SQL query, but rather
 * than starting with SELECT <columns> FROM <table> ... , they are written with the pattern FROM <entity class name> ...
 * because they abstract away the conversion of a ResultSet into a model class entirely. and do not require the SELECT
 * keyword. You can also find the syntax for adding parameters for the query below. (Spring also allows you to write
 * native SQL queries, or selecting columns with JPQL, if required.)
 *
 * This class will work like a Spring Component, but the @Component annotation is not needed here, because the class
 * is an interface. The implementation of JPARepository, which will be a component, will be generated at runtime.
 */

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long>{
    /**
     * Spring is smart: JPARepositories can infer many types of queries based on the method name without
     * any need the write a query.
     * You can read about more of them here:
     * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords
     * Until you need to write a very ornate query, these can fulfill all of your use cases.
     * @param name
     * @return A List of all Artist entities with a certain name
     */
    List<Artist> findArtistsByName(String name);
    List<Artist> findArtistsByNationality(@Param("nationality") String nationality);
}

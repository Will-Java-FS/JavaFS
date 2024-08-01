package com.revature.Repository;

import com.revature.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long>{
    List<Artist> findArtistsByName(String name);
    List<Artist> findArtistsByNationality(@Param("nationality") String nationality);
}

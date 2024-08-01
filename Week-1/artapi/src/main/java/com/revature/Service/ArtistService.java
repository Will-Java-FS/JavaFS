package com.revature.Service;

import com.revature.Model.Artist;
import com.revature.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists(){
        return artistRepository.findAll();
    }

    public Artist saveArtist(Artist artist){
        return artistRepository.save(artist);
    }

    public List<Artist> getArtistsByName(String name){
        return artistRepository.findArtistsByName(name);

    }

    public List<Artist> getArtistsByNationality(String nationality){
        return artistRepository.findArtistsByNationality(nationality);
    }










}

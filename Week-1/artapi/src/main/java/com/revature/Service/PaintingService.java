package com.revature.Service;


import com.revature.Model.Artist;
import com.revature.Model.Painting;
import com.revature.Repository.ArtistRepository;
import com.revature.Repository.PaintingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PaintingService {
    PaintingRepository paintingRepository;
    ArtistRepository artistRepository;

    @Autowired
    public PaintingService(PaintingRepository paintingRepository,ArtistRepository artistRepository){
        this.paintingRepository=paintingRepository;
        this.artistRepository=artistRepository;

    }

    public Painting savePainting(long artistID, Painting painting){
        Artist a = artistRepository.findById(artistID).get();
        a.getPaintings().add(painting);
        return paintingRepository.save(painting);
    }

    public List<Painting> getAllPaintings(){
        return paintingRepository.findAll();
    }

    public Artist getArtistOfPainting(long paintingID){
        Painting P1 =paintingRepository.findById(paintingID).get();
        Artist a1 = P1.getArtist();
        return a1;
    }

    public List<Painting> getAllPaintingsByGenre(String genre){
        return paintingRepository.findPaintingsByGenre(genre);
    }

    public List<Painting> getAllPaintingsByTitle(String title){
        return paintingRepository.findPaintingsByTitle(title);
    }

    public List<Painting> getAllPaintingsByTitleAndGenre(String title, String genre){
        return paintingRepository.findPaintingsByTitleAndGenre(title,genre);
    }

}

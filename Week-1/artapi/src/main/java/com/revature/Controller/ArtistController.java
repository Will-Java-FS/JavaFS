package com.revature.Controller;

import com.revature.Model.Artist;
import com.revature.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {
    ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService){
        this.artistService = artistService;
    }

    @GetMapping("artist")
    public List<Artist> getAllArtists(){
        return artistService.getAllArtists();

    }

    @PostMapping("artist")
    public Artist postArtist(@RequestBody Artist artist){
        return artistService.saveArtist(artist);
    }

    @GetMapping(value = "artist",params ={"nationality"})
    public List<Artist> getArtistByNationality(@RequestParam("nationality") String nationality){
        return artistService.getArtistsByNationality(nationality);
    }

    @GetMapping(value = "artist",params={"name"})
    public List<Artist> getArtistByName(@RequestParam("name") String name){
        return artistService.getArtistsByName(name);
    }
}

package dev.example.songs.controller;

import dev.example.songs.Service.ArtistService;
import dev.example.songs.Service.TrackService;
import dev.example.songs.model.Artist;
import dev.example.songs.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
@CrossOrigin
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    //load all track
    @GetMapping
    public List<Artist> allArtist() {
        return artistService.allArtist();
    }

}

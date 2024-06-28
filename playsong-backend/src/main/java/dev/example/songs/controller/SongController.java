package dev.example.songs.controller;

import dev.example.songs.Service.SongService;
import dev.example.songs.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/app/user/song")
public class SongController {
    @Autowired
    private SongService songService;

    @PostMapping
    public ResponseEntity<Song> createSong(@RequestBody Map<String,String> load)
    {
        return new ResponseEntity<Song>(songService.createSong(load.get("title"),load.get("imdbId")), HttpStatus.CREATED);
    }

}

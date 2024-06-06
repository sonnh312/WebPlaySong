package dev.example.songs.controller;

import dev.example.songs.SongService;
import dev.example.songs.model.Songs;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/songs")
public class SongsController {
    @Autowired
    private SongService songService;
    @GetMapping
    public ResponseEntity<List<Songs>> getAllSong(){ // get proper status codes
        return new ResponseEntity<List<Songs>>(songService.AllSong(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Songs>> getSingleSong(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Songs>>(songService.singleSong(id), HttpStatus.OK);
    }
}

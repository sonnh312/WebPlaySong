package dev.example.songs.controller;

import dev.example.songs.Service.TrackService;
import dev.example.songs.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/track")
@CrossOrigin
public class TrackController {
    @Autowired
    private TrackService trackService;

    //load all track
    @GetMapping
    public List<Track> allTrack() {
        return trackService.allTrack();
    }

    query by using objId
    @GetMapping("/{id}")
    public ResponseEntity<Track> getSingleTrack(@PathVariable String id) {
        if (!ObjectId.isValid(id)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid ObjectId format");
        }
        ObjectId objectId = new ObjectId(id);
        return trackService.singleTrack(objectId)
                .map(track -> new ResponseEntity<>(track, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    searching

}

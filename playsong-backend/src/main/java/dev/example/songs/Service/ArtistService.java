package dev.example.songs.Service;

import dev.example.songs.Repository.ArtistRepository;
import dev.example.songs.Repository.TrackRepository;
import dev.example.songs.model.Artist;
import dev.example.songs.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> allArtist()
    {
        return artistRepository.findAll();
    }
}

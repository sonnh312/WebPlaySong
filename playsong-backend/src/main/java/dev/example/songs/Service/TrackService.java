package dev.example.songs.Service;

import dev.example.songs.Repository.TrackRepository;
import dev.example.songs.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//database access method
@Service
public class TrackService {
    @Autowired
    private TrackRepository trackRepository;
    //load list all track
    public List<Track> allTrack()
    {
        return trackRepository.findAll();
    }
//    query track like id
//    public Optional<Track> singleTrack(ObjectId id)
//    {
//        return trackRepository.findById(id);
//    }

}

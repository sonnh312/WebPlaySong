package dev.example.songs;

import dev.example.songs.model.Songs;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {
    @Autowired //instantiate class here
    private SongRepository songRepository;
    public List<Songs> AllSong(){

        return songRepository.findAll();
    }
    public Optional<Songs> singleSong(ObjectId id){ //using to say maybe return null
        return  songRepository.findById(id);
    }

}

package dev.example.songs.Service;

import dev.example.songs.Repository.SongRepository;
import dev.example.songs.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Song createSong(String title, String imdbId){
        Song song = songRepository.insert(new Song(title));

        mongoTemplate.update(Song.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply((new Update().push("songs").value(song)))
                .first();
        return song;
    }
}

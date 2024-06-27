package dev.example.songs.Repository;

import dev.example.songs.model.Artist;
import dev.example.songs.model.Track;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ArtistRepository extends MongoRepository<Artist, ObjectId> {
//    ResponseEntity<Artist> addArtist(Artist artist);
}

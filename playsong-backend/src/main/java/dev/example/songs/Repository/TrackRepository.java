package dev.example.songs.Repository;


import dev.example.songs.model.Track;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends MongoRepository<Track, ObjectId> {
    Optional<Track> singleTrack(ObjectId id);
}

package dev.example.songs.Repository;

import dev.example.songs.model.Track;
import dev.example.songs.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
}

package dev.example.songs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Users")
@Data //getter,setter,toString method
@AllArgsConstructor//constructor
@NoArgsConstructor //another constructor taken no parameter
public class User {
    @Id
    private ObjectId id;
    private String imdbId;
    private String username;
    private String email;
    private String password;
    private String profilePictureUrl;
    private String createdAt;

    @DocumentReference
    private List<Song> songs;
    private List<Playlist> playlists;
    private List<LikeTrack> likedTracks;
    private List<Review> reviews;
    private List<String> genres;


}

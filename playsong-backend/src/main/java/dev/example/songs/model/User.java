package dev.example.songs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Users")
@Data //getter,setter,toString method
@AllArgsConstructor//constructor
@NoArgsConstructor //another constructor taken no parameter
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password_hash;
    private String profile_picture_url;
    private String created_at;
    private List<Playlist> playlists;
    private List<LikedTrack> liked_tracks;
    private List<Follow> follows;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Playlist {
        private ObjectId playlist_id;
        private String title;
        private String description;
        private List<TrackReference> tracks;
        private String created_at;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LikedTrack {
        private ObjectId track_id;
        private String liked_at;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Follow {
        private ObjectId artist_id;
        private String followed_at;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TrackReference {
        private ObjectId track_id;
        private String added_at;
    }
}

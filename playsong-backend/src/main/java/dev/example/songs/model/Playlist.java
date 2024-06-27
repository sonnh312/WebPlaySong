package dev.example.songs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Playlists")
@Data //getter,setter,toString method
@AllArgsConstructor//constructor
@NoArgsConstructor //another constructor taken no parameter


public class Playlist {
    @Id
    private ObjectId id;
    private ObjectId user_id;
    private String title;
    private String description;
    private List<TrackReference> tracks;
    private String created_at;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TrackReference {
        private ObjectId track_id;
        private String added_at;
    }
}

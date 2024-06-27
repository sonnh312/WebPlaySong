package dev.example.songs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Artists")
@Data //getter,setter,toString method
@AllArgsConstructor//constructor
@NoArgsConstructor //another
public class Artist {
    @Id
    private ObjectId id;
    private String name;
    private String bio;
    private String profile_picture_url;
    private String created_at;
    private List<Album> albums;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Album {
        private ObjectId album_id;
        private String title;
        private String release_date;
        private String cover_image_url;
        private List<Track> tracks;
        private String created_at;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Track {
        private ObjectId track_id;
        private String title;
        private int duration;
        private String track_url;
        private String created_at;
    }
}

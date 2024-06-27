package dev.example.songs.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Tracks")
@Data //getter,setter,toString method
@AllArgsConstructor//constructor
@NoArgsConstructor //another constructor taken no parameter

public class Track {
    @Id
    private ObjectId id;
    private String title;
    private ObjectId album_id;
    private ObjectId artist_id;
    private String  duration;
    private String track_url;
    private List<String> genres;
    private String created_at;
    private List<Comment> comments;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Comment {
        private ObjectId comment_id;
        private ObjectId user_id;
        private String content;
        private String created_at;
    }

    //@DocumentReference, manual reference relationship

}

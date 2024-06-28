package dev.example.songs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "songs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    @Id
    private ObjectId id;
    private String title;

    public Song(String title) {
        this.title = title;
    }
}

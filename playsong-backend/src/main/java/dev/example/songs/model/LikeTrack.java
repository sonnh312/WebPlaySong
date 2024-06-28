package dev.example.songs.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "likes")
@Data //getter,setter,toString method
@AllArgsConstructor//constructor
@NoArgsConstructor
public class LikeTrack {
    @Id
    private ObjectId id;
    private String title;


}

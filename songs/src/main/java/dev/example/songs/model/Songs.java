package dev.example.songs.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "songs")
@Data //getter,setter,toString method
@AllArgsConstructor//constructor
@NoArgsConstructor //another constructor taken no parameter

public class Songs {
    @Id // this defined each song inside database
    private ObjectId id;
    private String title;
    private String releaseDate;
    private String youtubeLink;
    private List<String> genres;

//    @DocumentReference, manual reference relationship

}

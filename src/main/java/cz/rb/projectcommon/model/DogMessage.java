package cz.rb.projectcommon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName("dogMessage")
public class DogMessage implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("breed")
    private String breed;
    @JsonProperty("gender")
    private GenderEnum gender;
    @JsonProperty("details")
    private String details;
    @JsonProperty("ownerId")
    private Long ownerId;
}

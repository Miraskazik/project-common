package cz.rb.projectcommon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class DogListMessage implements Serializable {

    @JsonProperty("dogMessage")
    private List<DogMessage> dogMessageList;
}
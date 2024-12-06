package cz.rb.projectcommon.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerListMessage implements Serializable {

    @JsonProperty("customerMessage")
    private List<CustomerMessage> customerMessage;

}

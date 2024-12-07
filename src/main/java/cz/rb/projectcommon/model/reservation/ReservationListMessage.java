package cz.rb.projectcommon.model.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationListMessage implements Serializable {

    @JsonProperty("reservationMessage")
    private List<ReservationMessage> reservationMessages;
}


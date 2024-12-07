package cz.rb.projectcommon.model.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonRootName("reservationMessage")
public class ReservationMessage implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("reservationDateStart")
    private LocalDateTime reservationDateStart;

    @JsonProperty("reservationDateEnd")
    private LocalDateTime reservationDateEnd;

    @JsonProperty("dogId")
    private Long dogId;

    @JsonProperty("ownerId")
    private Long ownerId;

    @JsonProperty("fullPrice")
    private Long fullPrice;

    @JsonProperty("numberOfDays")
    private Integer numberOfDays;
}


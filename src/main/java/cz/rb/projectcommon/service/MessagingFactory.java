package cz.rb.projectcommon.service;

import cz.rb.projectcommon.model.DogMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
public class MessagingFactory {


    public void checkResponse(final ResponseEntity<DogMessage> response) {
        var status = response.getStatusCode();
        if (status != HttpStatusCode.valueOf(200)) {
            throw new RuntimeException("Invalid response code: " + status);
        }
    }
}

package org.example.randmcharacter;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RandMService {
    private final RestClient restClient;

    public RandMService(RestClient.Builder clientBuilder) {
        this.restClient = clientBuilder.baseUrl("https://rickandmortyapi.com/api").build();
    }
    public List<RandMResults> getAllCharacters(){
        RandMResponse response = this.restClient.get().uri("/character").retrieve().body(RandMResponse.class);
        assert response != null;
        return response.results();
    }

}

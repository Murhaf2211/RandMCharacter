package org.example.randmcharacter;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class RandMController {
    RestClient.Builder clientBuilder = RestClient.builder();
    private final RandMService randMService = new RandMService(clientBuilder);

    @GetMapping
    public List<RandMResults> getAllCharacters(){
        return randMService.getAllCharacters();
    }
}

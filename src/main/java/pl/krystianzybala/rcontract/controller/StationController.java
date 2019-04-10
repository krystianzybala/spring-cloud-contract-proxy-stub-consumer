package pl.krystianzybala.rcontract.controller;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.krystianzybala.rcontract.dto.StationDetails;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/stations")
public class StationController {

    private final RestTemplate restTemplate;

    StationController(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<StationDetails>> getStationsDetails(@PathVariable("id") long id) {
        return this.restTemplate.exchange("http://localhost:9000/pjp-api/rest/station/sensors/" + id, HttpMethod.GET, null, new ParameterizedTypeReference<List<StationDetails>>() {
        });
    }
}

package com.behl.pilotrun.controller;

import ch.qos.logback.classic.Logger;
import com.behl.pilotrun.utils.GsonVsJackson;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController

public class Controller {

    private static Logger logger = (Logger) LoggerFactory.getLogger(Controller.class);

    private static final String status_success = "{ \"response\": \"success\", \"status\": 200 }";
    private static final String status_error = "{ \"response\": \"failure\", \"status\": 404 }";
    @Autowired
    private GsonVsJackson gsonVsJackson;

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test(HttpServletRequest request) {
        RestTemplate restTemplate = new RestTemplate();

        return ResponseEntity.status(200).body(status_success);



    }

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> healthcheck( @RequestParam(required = false)  String format ) {
        if (null != format && format.equalsIgnoreCase("short")) {
            return ResponseEntity.status(200).body(status_success);
        } else if (null != format && format.equalsIgnoreCase("full")) {
            String res = "{\"currentTime\" : \"" + LocalDateTime.now().toString() + "\" , \"status\" : \"OK\"}";
            return ResponseEntity.status(200).body(res);
        } else {
            return ResponseEntity.status(404).body(status_error);
        }
    }

    @GetMapping(value = "/convert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> gsonVsJackson() throws JsonProcessingException {
        String gsonString = gsonVsJackson.usingGson();
        logger.info(gsonString);
        String jacksonString = gsonVsJackson.usingJackson();
        logger.info(jacksonString);
        return ResponseEntity.status(200).body(gsonString);
    }
}

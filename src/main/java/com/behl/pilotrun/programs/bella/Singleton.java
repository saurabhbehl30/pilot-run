package com.behl.pilotrun.programs.bella;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

public class Singleton {

    private static final String status = "{\"currentTime\" : \"\" , \"status\" : \"OK\"}";

    @GetMapping(value = "/healthcheck")
    public String healthcheck(@RequestParam String format) {
        if (null != format && format.equalsIgnoreCase("short")) {
            return status;
        } else if (null != format && format.equalsIgnoreCase("full")) {
            LocalDateTime time = LocalDateTime.now();
            return "{\"currentTime\" : time , \"status\" : \"OK\"}";
        }
            return null;
        }
    }
package com.behl.pilotrun.utils;


import com.behl.pilotrun.dto.Tiger;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class GsonVsJackson {

    private Tiger tiger = null;

    @PostConstruct
    public void init() {
        tiger = new Tiger();
        tiger.setName("tiger");
        tiger.setAge(14);
        tiger.setBreed("shihTzu");
    }

    public String usingGson() {
        Gson gsonObject = new Gson();
        return gsonObject.toJson(tiger);
    }

    public String usingJackson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(tiger);
    }
}

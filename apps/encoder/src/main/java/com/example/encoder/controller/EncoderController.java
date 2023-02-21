package com.example.encoder.controller;

import com.example.encoder.EncoderApplication;
import com.example.encoder.dto.FromEncodeDTO;
import com.example.encoder.dto.ToEncoderDTO;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Base64;

@RestController
@RequestMapping("api/v1")
public class EncoderController {

    @PostMapping(path = "/encode", produces = "application/json")
    public @ResponseBody FromEncodeDTO postEncode(@RequestBody ToEncoderDTO request) {

        System.out.println("incoming request: " + request.toString());

        return FromEncodeDTO.builder()
                .encoded(Base64.getEncoder().encodeToString(request.getBaseText().getBytes()))
                .encoderCounter(EncoderApplication.counter++)
                .build();
    }

}

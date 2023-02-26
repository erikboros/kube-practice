package com.example.encoder.controller;

import com.example.common.dtos.FromEncoderDTO;
import com.example.common.dtos.ToEncoderDTO;
import com.example.encoder.EncoderApplication;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Base64;

@RestController
@RequestMapping("api/v1")
public class EncoderController {

    @PostMapping(path = "/encode", produces = "application/json")
    public @ResponseBody FromEncoderDTO postEncode(@RequestBody ToEncoderDTO request) {

        System.out.println("incoming request: " + request.toString());

        return FromEncoderDTO.builder()
                .encoded(Base64.getEncoder().encodeToString(request.getBaseText().getBytes()))
                .encoderCounter(EncoderApplication.counter++)
                .build();
    }

}

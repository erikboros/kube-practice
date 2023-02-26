package com.example.appA.controller;

import com.example.appA.AppAApplication;
import com.example.appA.dto.EncoderResponseDTO;
import com.example.appA.dto.HelloDTO;
import com.example.appA.service.EncoderConnector;
import com.example.common.dtos.FromEncoderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class AppController {

    private final EncoderConnector encoderConnector;

    @Autowired
    public AppController(EncoderConnector encoderConnector) {
        this.encoderConnector = encoderConnector;
    }

    @GetMapping(path = "/hello", produces = "application/json")
    public @ResponseBody HelloDTO getBook() {
        return new HelloDTO("Hello", AppAApplication.counter++);
    }

    @GetMapping(path = "/encode/{text}", produces = "application/json")
    public @ResponseBody EncoderResponseDTO getEncoded(@PathVariable String text) {
        FromEncoderDTO encodedResult = encoderConnector.getEncodedResult(text);
        return EncoderResponseDTO.builder()
                .encoded(encodedResult.getEncoded())
                .appAcounter(AppAApplication.counter)
                .appBcounter(encodedResult.getEncoderCounter())
                .build();
    }

}

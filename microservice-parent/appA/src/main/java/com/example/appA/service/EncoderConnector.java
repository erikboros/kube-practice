package com.example.appA.service;

import com.example.appA.AppAApplication;
import com.example.common.dtos.FromEncoderDTO;
import com.example.common.dtos.ToEncoderDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EncoderConnector {

    private final String encoderUrl;

    public EncoderConnector(@Value("${clients.encoder.url}") String encoderUrl)  {
        this.encoderUrl = encoderUrl;
    }

    public FromEncoderDTO getEncodedResult(String text) {
        ToEncoderDTO toEncoder = new ToEncoderDTO(text, AppAApplication.counter++);

        System.out.println("url:" + encoderUrl + ", toEncoderDTO:" + toEncoder);


//        HttpEntity<ToEncoderDTO> request = new HttpEntity<>(toEncoder);

        RestTemplate restTemplate = new RestTemplate();
        FromEncoderDTO fromEncoder = restTemplate.postForObject(
                encoderUrl + "/encode",
                toEncoder,
                FromEncoderDTO.class
        );

        assert fromEncoder != null;
        System.out.println("fromEncoderDTO:" + fromEncoder);

        return fromEncoder;
    }

}

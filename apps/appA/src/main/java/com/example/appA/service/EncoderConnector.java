package com.example.appA.service;

import com.example.appA.AppAApplication;
import com.example.appA.dto.FromEncoderDTO;
import com.example.appA.dto.ToEncoderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EncoderConnector {

    private String encoderUrl;

    public EncoderConnector(@Value("${clients.encoder.url}") String encoderUrl)  {
        this.encoderUrl = encoderUrl;
    }

    public FromEncoderDTO getEncodedResult(String text) {
        ToEncoderDTO toEncoder = new ToEncoderDTO(text, AppAApplication.counter++);

        System.out.println("url:" + encoderUrl + ", toEncoderDTO:" + toEncoder.toString());


        HttpEntity<ToEncoderDTO> request = new HttpEntity<>(toEncoder);

        RestTemplate restTemplate = new RestTemplate();
        FromEncoderDTO fromEncoder = restTemplate.postForObject(
                encoderUrl + "/encode",
                toEncoder,
                FromEncoderDTO.class
        );

        System.out.println("fromEncoderDTO:" + fromEncoder.toString());

        return fromEncoder;
    }

}

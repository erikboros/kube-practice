package com.example.encoder.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class FromEncodeDTO {

    private String encoded;
    private int encoderCounter;

}

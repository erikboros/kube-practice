package com.example.common.dtos;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class FromEncoderDTO implements Serializable {
    private String encoded;
    private int encoderCounter;
}

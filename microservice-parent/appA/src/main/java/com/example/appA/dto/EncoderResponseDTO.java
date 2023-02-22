package com.example.appA.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class EncoderResponseDTO {
    String encoded;
    int appAcounter;
    int appBcounter;
}

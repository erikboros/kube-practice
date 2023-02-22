package com.example.encoder.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class ToEncoderDTO {
    private String baseText;
    private int entryCounter;
}

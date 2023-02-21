package com.example.appA.dto;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class ToEncoderDTO {
    private String baseText;
    private int entryCounter;
}

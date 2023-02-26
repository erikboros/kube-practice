package com.example.common.dtos;

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

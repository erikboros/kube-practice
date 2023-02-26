package com.example.common.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class ToEncoderDTO {
    private String baseText;
    private int entryCounter;
}

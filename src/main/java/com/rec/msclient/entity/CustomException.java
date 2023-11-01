package com.rec.msclient.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomException {
    private String statusCode;

    private String message;
}

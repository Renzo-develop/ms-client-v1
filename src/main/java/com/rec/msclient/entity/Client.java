package com.rec.msclient.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.NumberFormat;

@Document(collection = "client")
@Data
public class Client {

    @Field
    private Long clientId;

    @Field
    @NotEmpty
    private String name;

    @Field
    @NotEmpty
    private String dni;

    @Field
    @NotNull
    @NumberFormat
    private Integer age;
}

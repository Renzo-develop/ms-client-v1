package com.rec.msclient.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
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
    @Pattern(regexp = "[0-9]{8}$")
    private String dni;

    @Field
    @NotNull
    @NumberFormat
    private Integer age;
}

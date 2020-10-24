package com.afkklein.handson.s2it.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseMessageDto<T> {

    private T teste;
    private int s2itport;

}
